package com.hxqh.dashboard.service;

import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.model.*;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.repository.*;
import com.hxqh.dashboard.util.JdbcUtil;
import com.hxqh.dashboard.util.MatrixUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Service("showService")
public class ShowServiceImpl implements ShowService {

    @Resource
    protected SessionFactory sessionFactory;

    @Autowired
    private VisualizeRepository visualizeRepository;
    @Autowired
    private TableManagerRepository tableManagerRepository;
    @Autowired
    private DashboardRepository dashboardRepository;
    @Autowired
    private DashboardVisualizeRepository dashboardVisualizeRepository;
    @Autowired
    private DatabaseRepository databaseRepository;

    private static final String PIE = "pie";

    private static Map<String, String> typeMap = new HashMap<String, String>() {{
        put("饼图", "pie");
        put("条形图", "bar");
        put("折线图", "line");
    }};

    private static Map<Integer, String> lineXMap = new HashMap<Integer, String>() {{
        put(1, "周一");
        put(2, "周二");
        put(3, "周三");
        put(4, "周四");
        put(5, "周五");
        put(6, "周六");
        put(7, "周日");
    }};


    private static Map<Integer, String> pieXMap = new HashMap<Integer, String>() {{
        put(1, "直接访问");
        put(2, "邮件营销");
        put(3, "联盟广告");
        put(4, "视频广告");
        put(5, "搜索引擎");
        put(6, "简介访问");
        put(7, "抖音广告");
    }};

    private static final String[] EXCEL_HEADER = {"业务类别", "视图名称", "表名", "视图类型", "数值类型", "业务处理逻辑描述"};


    private static final String DROP_TABLE_SQL = " drop table ";
    private static final String DOUBLE_TYPE = "double";
    private static final String FLOAT_TYPE = "float";
    private static final Integer START_NUM = 1;
    private static final Integer END_NUM = 8;
    private static final Integer SPLIT_NUM = 150;
    private static final String TRUNCATE_TABLE = "TRUNCATE TABLE ";

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Visualize findVisualizeByVid(Integer vid) {
        return visualizeRepository.findOne(vid);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public ShowDto findLineByVid(Integer integerId, Integer random, Integer bid, Integer did) {
        ShowDto showDto = new ShowDto();
        List<List<Object>> showValues = new ArrayList<>(10);
        List<String> showkeys = new ArrayList<>(15);
        Visualize visualize = visualizeRepository.findOne(integerId);

        String sql = "select * from " + visualize.getTablename();
        Session currentSession = sessionFactory.getCurrentSession();
        List list = currentSession.createSQLQuery(sql).list();

        // 构造矩阵
        Integer x = visualize.getColumnsnumber() - 1;
        Integer y = list.size();
        Object[][] matrix = new Object[x][y];
        Object[][] target = new Object[y][x];

        if (PIE.equals(visualize.getType())) {
            List<Object> pieDtoList = new ArrayList<>(50);
            for (int i = 0; i < list.size(); i++) {
                Object[] o = (Object[]) list.get(i);
                for (int j = 0; j < x; j++) {
                    PieDto pieDto = new PieDto((String) o[1], o[2]);
                    pieDtoList.add(pieDto);
                }
            }
            showValues.add(pieDtoList);
            showDto.setShowValue(showValues);
        } else {
            for (int i = 0; i < list.size(); i++) {
                Object[] o = (Object[]) list.get(i);
                for (int j = 0; j < x; j++) {
                    matrix[j][i] = o[j + 2];
                }
                showkeys.add((String) o[1]);
            }

            MatrixUtils.transpose(matrix, x, y, target);
            for (int i = 0; i < target.length; i++) {
                showValues.add(Arrays.asList(target[i]));
            }
            showDto.setShowValue(showValues);
        }
        showDto.setShowKey(showkeys);
        showDto.setDid(did);
        BeanUtils.copyProperties(visualize, showDto);
        return showDto;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addVisualize(VDto vDto) throws Exception {
        List<ColumnMap> columns = new ArrayList<>(15);
        Visualize visualize = vDto.getVisualize();
        StringBuilder sql = new StringBuilder(150);
        StringBuilder insertDemoSql = new StringBuilder(300);

        // 获取表名称
        TableManager tableManager = tableManagerRepository.findByTablecategory(visualize.getType());
        String tableName = tableManager.getTableprefix() + tableManager.getTablemaxid();

        // 构造建表语句
        List<ColumnDto> columnMapList = getGenerateTable(vDto, columns, visualize, sql, tableName);

        // 添加缺省的Demo数据
        generateDemoData(visualize, insertDemoSql, tableName, columnMapList);

        // 管理表更新
        tableManager.setTablemaxid(tableManager.getTablemaxid() + 1);
        visualize.setColumnMapList(columns);
        visualize.setColumnsnumber(columnMapList.size());
        visualize.setYtype(DOUBLE_TYPE);
        visualizeRepository.save(visualize);
    }

    private List<ColumnDto> getGenerateTable(VDto vDto, List<ColumnMap> columns, Visualize visualize, StringBuilder sql, String tableName) {
        List<ColumnDto> columnMapList = vDto.getColumnList();

        sql.append("create table ").append(tableName).append(" (`sid` int(20) NOT NULL AUTO_INCREMENT,");
        for (int i = 0; i < columnMapList.size(); i++) {
            ColumnDto columnDto = columnMapList.get(i);
            sql.append("`").append(columnDto.getField()).append("` ").append(columnDto.getType()).append(" DEFAULT NULL, ");
            ColumnMap columnMap = new ColumnMap();
            BeanUtils.copyProperties(columnDto, columnMap);
            columnMap.setVisualize(visualize);
            columns.add(columnMap);
        }
        sql.append(" PRIMARY KEY (`sid`))");

        sessionFactory.getCurrentSession().createSQLQuery(sql.toString()).executeUpdate();
        visualize.setTablename(tableName);
        return columnMapList;
    }

    private void generateDemoData(Visualize visualize, StringBuilder insertDemoSql, String tableName, List<ColumnDto> columnMapList) {
        Integer rand;
        for (int i = START_NUM; i < END_NUM; i++) {
            Random random = new Random();

            insertDemoSql.append("insert into ").append(tableName).append("(");
            for (int j = 0; j < columnMapList.size(); j++) {
                ColumnDto columnDto = columnMapList.get(j);
                insertDemoSql.append(columnDto.getField()).append(",");
            }
            insertDemoSql.setLength(insertDemoSql.length() - 1);
            if (PIE.equals(visualize.getType())) {
                insertDemoSql.append(") values ('").append(pieXMap.get(i)).append("'");
            } else {
                insertDemoSql.append(") values ('").append(lineXMap.get(i)).append("'");
            }
            for (int j = 1; j < columnMapList.size(); j++) {
                rand = random.nextInt(300) + 10;
                insertDemoSql.append(",").append(rand);
            }
            insertDemoSql.setLength(insertDemoSql.length() - 1);
            insertDemoSql.append(")");

            sessionFactory.getCurrentSession().createSQLQuery(insertDemoSql.toString()).executeUpdate();
            insertDemoSql.setLength(0);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addDashboard(Dashboard dashboard) {
        dashboard.setRefresh(0);
        dashboardRepository.save(dashboard);
    }

    @Deprecated
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public VisualizeDto visualizeList(Visualize visualize, Pageable pageable) {
        List<String> distinctBusinessCategory = visualizeRepository.findDistinctBusinesscategory();
        Page<Visualize> visualizes = visualizeRepository.findAll(pageable);
        //获取结果集
        List<Visualize> visualizeList = visualizes.getContent();
        Integer totalPages = visualizes.getTotalPages();
        VisualizeDto visualizeDto = new VisualizeDto(pageable, totalPages, visualizes.getTotalElements(), visualizeList, distinctBusinessCategory);
        return visualizeDto;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Dashboard findDashboardByVid(Integer integerId) {
        return dashboardRepository.findOne(integerId);
    }

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public DashboardShowDto findDashboardDataByVid(Integer integerId) {
        Dashboard dashboard = dashboardRepository.findOne(integerId);
        List<DashboardVisualize> dashboardVisualizesList = dashboard.getDashboardVisualizes();
        List<ShowDto> showDtoList = new ArrayList<>();
        for (int i = 0; i < dashboardVisualizesList.size(); i++) {
            DashboardVisualize dashboardVisualize = dashboardVisualizesList.get(i);
            Integer vid = dashboardVisualize.getVisualize().getVid();
            ShowDto showDto = findLineByVid(vid, (i + 1) * vid, dashboard.getBid(), dashboardVisualize.getDid());
            showDto.setX(dashboardVisualize.getX());
            showDto.setY(dashboardVisualize.getY());
            showDto.setH(dashboardVisualize.getH());
            showDto.setW(dashboardVisualize.getW());

            showDtoList.add(showDto);
        }
        DashboardShowDto dashboardShowDto = new DashboardShowDto(showDtoList, dashboard.getDashboardshowname(),
                dashboard.getBusinesscategory());
        dashboardShowDto.setRefresh(dashboard.getRefresh());
        return dashboardShowDto;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addDashboardVisualize(DashboardVisualizeDto dashboardVisualizeDto) {
        Dashboard dashboard = dashboardRepository.findOne(dashboardVisualizeDto.getBid());
        List<Location> locationList = dashboardVisualizeDto.getLocationList();

        for (int i = 0; i < locationList.size(); i++) {
            Location location = locationList.get(i);

            if (null == location.getDid() || "".equals(location.getDid())) {
                // 新增
                Visualize visualize = visualizeRepository.findOne(location.getVid());
                DashboardVisualize dashboardVisualize = new DashboardVisualize(dashboard, visualize, location.getX(),
                        location.getY(), location.getH(), location.getW(), visualize.getXname(), visualize.getYname(),
                        visualize.getEcharttitle(), visualize.getLegendShow(), visualize.getLegendPos(),
                        visualize.getLegendOrient(), visualize.getTooltipShow()
                );

                dashboardVisualize.setBackground(visualize.getBackground());
                dashboardVisualize.setEchartTitPos(visualize.getEchartTitPos());
                dashboardVisualize.setEchartTitColor(visualize.getEchartTitColor());
                dashboardVisualizeRepository.save(dashboardVisualize);
            } else {
                // 更新
                DashboardVisualize dashboardVisualize = dashboardVisualizeRepository.findOne(location.getDid());
                Visualize visualizeNew = visualizeRepository.findOne(location.getVid());
                dashboardVisualize.setVisualize(visualizeNew);
                dashboardVisualize.setX(location.getX());
                dashboardVisualize.setY(location.getY());
                dashboardVisualize.setH(location.getH());
                dashboardVisualize.setW(location.getW());
                dashboardVisualize.setXname(visualizeNew.getXname());
                dashboardVisualize.setYname(visualizeNew.getYname());
                dashboardVisualize.setEcharttitle(visualizeNew.getEcharttitle());
                dashboardVisualize.setLegendShow(visualizeNew.getLegendShow());
                dashboardVisualize.setLegendPos(visualizeNew.getLegendPos());
                dashboardVisualize.setLegendOrient(visualizeNew.getLegendOrient());
                dashboardVisualize.setTooltipShow(visualizeNew.getTooltipShow());
                dashboardVisualize.setBackground(visualizeNew.getBackground());
                dashboardVisualize.setEchartTitPos(visualizeNew.getEchartTitPos());
                dashboardVisualize.setEchartTitColor(visualizeNew.getEchartTitColor());

                dashboardVisualizeRepository.save(dashboardVisualize);
            }
        }
        // 删除
        List<Integer> deleteList = dashboardVisualizeDto.getDeleteList();
        if (null != deleteList && deleteList.size() > 0) {
            for (int j = 0; j < deleteList.size(); j++) {
                dashboardVisualizeRepository.delete(deleteList.get(j));
            }
        }
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isVisualizeByVisualizename(String visualizename) {
        Visualize visualize = visualizeRepository.findByVisualizename(visualizename);
        return null != visualize ? true : false;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isVisualizeByVisualizenameAndVidNot(Visualize visualizeDb) {
        Visualize visualize = visualizeRepository.findByVisualizenameAndVidNot(visualizeDb.getVisualizename(), visualizeDb.getVid());
        return null != visualize ? true : false;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insertData(InsertInfo insertInfo) {
        Visualize visualize = visualizeRepository.findOne(insertInfo.getVid());

        // todo 是否保留history
        sessionFactory.getCurrentSession().createSQLQuery(TRUNCATE_TABLE + visualize.getTablename()).executeUpdate();
        if (null != insertInfo.getLineIntegerList() && insertInfo.getLineIntegerList().size() > 0) {
            insertInfo.getLineIntegerList().forEach(lineInteger -> {
                String insertSQL;
                insertSQL = "insert into " + visualize.getTablename() + "(showkey,showvalue) values ('" + lineInteger.getShowkey() + "'," + lineInteger.getShowvalue() + ")";
                sessionFactory.getCurrentSession().createSQLQuery(insertSQL).executeUpdate();
            });
        }
        if (null != insertInfo.getLineFloatList() && insertInfo.getLineFloatList().size() > 0) {
            insertInfo.getLineFloatList().forEach(lineFloat -> {
                String insertSQL;
                insertSQL = "insert into " + visualize.getTablename() + "(showkey,showvalue) values ('" + lineFloat.getShowkey() + "'," + lineFloat.getShowvalue() + ")";
                sessionFactory.getCurrentSession().createSQLQuery(insertSQL).executeUpdate();
            });
        }
        if (null != insertInfo.getLineDoubleList() && insertInfo.getLineDoubleList().size() > 0) {
            insertInfo.getLineDoubleList().forEach(lineDouble -> {
                String insertSQL;
                insertSQL = "insert into " + visualize.getTablename() + "(showkey,showvalue) values ('" + lineDouble.getShowkey() + "'," + lineDouble.getShowvalue() + ")";
                sessionFactory.getCurrentSession().createSQLQuery(insertSQL).executeUpdate();
            });
        }
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<String> tableList() throws Exception {
        List<String> nameList = new ArrayList<>(50);
        Database database = databaseRepository.findOne(1);
        // todo 后期完善数据库配置
        String url = "jdbc:mysql://" + database.getIp() + ":" + database.getPort() + "/" + database.getDatabase();
        Connection conn = JdbcUtil.getConnection(url, database.getUser(), database.getPassword(), database.getDrivername());
        String sql = Constants.SHOW_TAB_SQL;
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            String string = rs.getString(Constants.TABLEPREFIX + database.getDatabase());
            nameList.add(string);
        }
        return nameList;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ColumnDto> columnList(String tablename) throws Exception {
        List<ColumnDto> columnDtoList = new ArrayList<>(50);
        Database database = databaseRepository.findOne(1);

        String url = "jdbc:mysql://" + database.getIp() + ":" + database.getPort() + "/" + database.getDatabase() + Constants.URL_SUFFIX;
        Connection conn = JdbcUtil.getConnection(url, database.getUser(), database.getPassword(), database.getDrivername());
        String sql = Constants.COLOUMN_PREFIX + tablename;
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            ColumnDto columnDto = new ColumnDto(rs.getString(Constants.TABLE_COLUMN_NAME), rs.getString(Constants.TABLE_COLUMN_TYPE));
            columnDtoList.add(columnDto);
        }
        return columnDtoList;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<Database> databaseList() {
        List<Database> databaseList = databaseRepository.findAll();
        return databaseList;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isDashboardByDashboardName(String dashboardname) {
        Dashboard dashboard = dashboardRepository.findByDashboardname(dashboardname);
        return null != dashboard ? true : false;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isDashboardByDashboardNameAndBidNot(Dashboard dashboardDb) {
        Dashboard dashboard = dashboardRepository.findByDashboardnameAndBidNot(dashboardDb.getDashboardname(), dashboardDb.getBid());
        return null != dashboard ? true : false;
    }

    @Deprecated
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public DashboardDto dashboardList(Dashboard dashboard, Pageable pageable) {
        List<String> distinctBusinessCategory = visualizeRepository.findDistinctBusinesscategory();

        Page<Dashboard> dashboards = dashboardRepository.findAll(pageable);
        //获取结果集
        List<Dashboard> dashboardList = dashboards.getContent();
        Integer totalPages = dashboards.getTotalPages();
        DashboardDto visualizeDto = new DashboardDto(pageable, totalPages, dashboards.getTotalElements(), dashboardList, distinctBusinessCategory);
        return visualizeDto;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void visualizeDelete(Integer integerId) {
        Visualize visualize = visualizeRepository.findOne(integerId);
        List<DashboardVisualize> dashboardVisualizes = visualize.getDashboardVisualizes();
        if (dashboardVisualizes.size() > 0) {
            for (int i = 0; i < dashboardVisualizes.size(); i++) {
                DashboardVisualize dashboardVisualize = dashboardVisualizes.get(i);
                dashboardVisualizeRepository.delete(dashboardVisualize.getDid());
            }
        }
        visualizeRepository.delete(integerId);
        // 删除表
        String sql = DROP_TABLE_SQL + visualize.getTablename();
        sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void dashboardDelete(Integer integerValue) {
        Dashboard dashboard = dashboardRepository.findOne(integerValue);
        List<DashboardVisualize> dashboardVisualizes = dashboard.getDashboardVisualizes();
        for (int i = 0; i < dashboardVisualizes.size(); i++) {
            DashboardVisualize dashboardVisualize = dashboardVisualizes.get(i);
            dashboardVisualizeRepository.delete(dashboardVisualize.getDid());
        }
        dashboardRepository.delete(integerValue);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateVisualize(Visualize visualize) {
        visualizeRepository.save(visualize);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateDashboard(Dashboard dashboard) {
        dashboardRepository.save(dashboard);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public VisualizeDto visualizeList2(Visualize visualize, Pageable pageable) {

        List<Integer> hasBindList = new ArrayList<>(10);
        if (0 != visualize.getBid()) {
            Dashboard dashboard = dashboardRepository.findOne(visualize.getBid());
            List<DashboardVisualize> dashboardVisualizeList = dashboard.getDashboardVisualizes();
            List<Visualize> collect = dashboardVisualizeList.stream().map(DashboardVisualize::getVisualize).collect(Collectors.toList());
            hasBindList = collect.stream().map(Visualize::getVid).collect(Collectors.toList());
        }

        List<String> distinctBusinessCategory = visualizeRepository.findDistinctBusinesscategory();

        Specification<Visualize> specification = (root, query, cb) -> {
            List<Predicate> list = new ArrayList<>(5);

            if (StringUtils.isNotBlank(visualize.getVisualizename())) {
                list.add(cb.like(root.get("visualizename").as(String.class), "%" + visualize.getVisualizename() + "%"));
            }
            if (StringUtils.isNotBlank(visualize.getType())) {
                list.add(cb.equal(root.get("type").as(String.class), visualize.getType()));
            }
            Predicate[] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        };

        Page<Visualize> visualizes = visualizeRepository.findAll(specification, pageable);

        List<Visualize> visualizeList = visualizes.getContent();
        Integer totalPages = visualizes.getTotalPages();
        VisualizeDto visualizeDto = new VisualizeDto(pageable, totalPages, visualizes.getTotalElements(), visualizeList, distinctBusinessCategory);
        visualizeDto.setHasBindList(hasBindList);
        return visualizeDto;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public DashboardDto dashboardList2(Dashboard dashboard, Pageable pageable) {
        List<String> distinctBusinessCategory = visualizeRepository.findDistinctBusinesscategory();
        Specification<Dashboard> specification = (root, query, cb) -> {
            List<Predicate> list = new ArrayList<>(10);

            if (StringUtils.isNotBlank(dashboard.getDashboardname())) {
                list.add(cb.like(root.get("dashboardname").as(String.class), "%" + dashboard.getDashboardname() + "%"));
            }
            if (StringUtils.isNotBlank(dashboard.getDashboarddescription())) {
                list.add(cb.like(root.get("dashboarddescription").as(String.class), "%" + dashboard.getDashboarddescription() + "%"));
            }

            Predicate[] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        };

        Page<Dashboard> dashboards = dashboardRepository.findAll(specification, pageable);

        //获取结果集
        List<Dashboard> dashboardList = dashboards.getContent();
        Integer totalPages = dashboards.getTotalPages();
        DashboardDto visualizeDto = new DashboardDto(pageable, totalPages, dashboards.getTotalElements(), dashboardList, distinctBusinessCategory);
        return visualizeDto;
    }

    @Override
    public HSSFWorkbook exportVisualizeExcel() {
        Sort sort = new Sort(Sort.Direction.DESC, "vid");
        Pageable pageable = new PageRequest(0, Constants.EXCEL_EXPORT_SIZE, sort);
        Page<Visualize> visualizes = visualizeRepository.findAll(pageable);
        Integer totalPages = visualizes.getTotalPages();

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("业务对接明细表");
        HSSFRow row = sheet.createRow((int) 0);
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        for (int i = 0; i < EXCEL_HEADER.length; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(EXCEL_HEADER[i]);
            cell.setCellStyle(style);
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, 100 * 60);
        }

        int count = 1;
        for (int page = 0; page < totalPages; page++) {
            pageable = new PageRequest(page, Constants.EXCEL_EXPORT_SIZE, sort);
            visualizes = visualizeRepository.findAll(pageable);
            List<Visualize> visualizeList = visualizes.getContent();

            for (int i = 0; i < visualizeList.size(); i++) {
                row = sheet.createRow(count);
                Visualize visualize = visualizeList.get(i);
                row.createCell(0).setCellValue(visualize.getBusinesscategory());
                row.createCell(1).setCellValue(visualize.getVisualizename());
                row.createCell(2).setCellValue(visualize.getTablename());
                row.createCell(3).setCellValue(visualize.getType());
                row.createCell(4).setCellValue(visualize.getYtype());
                row.createCell(5).setCellValue(visualize.getVisualizedescription());
                count++;
            }
        }
        return wb;
    }


}
