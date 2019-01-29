package com.hxqh.dashboard.service;

import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.common.ObjectUtil;
import com.hxqh.dashboard.model.*;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.repository.*;
import com.hxqh.dashboard.util.JdbcUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.hibernate.SQLQuery;
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

import static com.hxqh.dashboard.util.AesUtils.Decrypt;
import static com.hxqh.dashboard.util.AesUtils.Encrypt;

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
    @Autowired
    private ColumnMapRepository columnMapRepository;
    @Autowired
    private OrientyRepository orientYRepository;
    @Autowired
    private OrientxRepository orientxRepository;
    @Autowired
    private ValueColorMapRepository valueColorMapRepository;

    private static Map<String, String> dbType = new HashMap<String, String>() {{
        put("oracle", ":thin:@");
        put("mysql", "://");
    }};

    private static Map<String, String> typeC2EMap = new HashMap<String, String>() {{
        put("饼图", "pie");
        put("条形图", "bar");
        put("折线图", "line");
    }};

    private static Map<String, String> typeE2CMap = new HashMap<String, String>() {{
        put("pie", "饼图");
        put("bar", "条形图");
        put("line", "折线图");
        put("text", "文本");
        put("number", "数值");
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

    private static Map<String, String> dbMap = new HashMap<String, String>() {{
        put("mysql", "com.mysql.jdbc.Driver");
        put("oracle", "oracle.jdbc.driver.OracleDriver");
    }};

    private static Map<Integer, String> dbStatusMap = new HashMap<Integer, String>() {{
        put(0, "连接失败");
        put(1, "连接成功");
    }};


    private static final String[] EXCEL_HEADER = {"业务类别", "视图名称", "表名", "视图类型", "业务处理逻辑描述"};

    private static final String SELECT_SQL = "select * from ";
    private static final String DROP_TABLE_SQL = " drop table ";
    private static final String DOUBLE_TYPE = "value";
    private static final Integer START_NUM = 1;
    private static final Integer END_NUM = 8;


    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Visualize findVisualizeByVid(Integer vid) {
        return visualizeRepository.findOne(vid);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public ShowDto findLineByVid(Integer integerId, Integer random, Integer bid, Integer did) throws Exception {
        ShowDto showDto = new ShowDto();
        List<List<Object>> showValues = new ArrayList<>(10);
        List<String> showkeys = new ArrayList<>(15);
        Visualize visualize = visualizeRepository.findOne(integerId);

        String sql = SELECT_SQL + visualize.getTablename();
        if (null != visualize.getVwhere() && !"".equals(visualize.getVwhere())) {
            sql = sql + Constants.SQL_WHERE + visualize.getVwhere();
        }
        if (visualize.getType().equals(Constants.TEXT)) {
            BeanUtils.copyProperties(visualize, showDto);
            return showDto;
        } else if (visualize.getType().equals(Constants.NUMBER)) {
            // 根据SQL查询
            Database database = databaseRepository.findOne(visualize.getDbid());
            String url = getDbConnectString(database);
            Connection conn = JdbcUtil.getConnection(url, database.getUser(), Decrypt(database.getPassword()), database.getDrivername());
            PreparedStatement st = conn.prepareStatement(visualize.getVwhere());
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                showDto.setCountValue(rs.getInt(1));
            }
            BeanUtils.copyProperties(visualize, showDto);
            return showDto;
        } else {
            Session currentSession = sessionFactory.getCurrentSession();
            List list = currentSession.createSQLQuery(sql).list();
            // 构造矩阵
            Integer x = visualize.getColumnsnumber() - 1;
            Integer y = list.size();
            Object[][] matrix = new Object[x][y];

            if (Constants.PIE.equals(visualize.getType())) {
                List<Object> mulitPieDtoList = new ArrayList<>(50);
                for (int j = 0; j < x; j++) {
                    List<Object> pieDtoList = new ArrayList<>(50);
                    for (int i = 0; i < list.size(); i++) {
                        Object[] o = (Object[]) list.get(i);
                        PieDto pieDto = new PieDto((String) o[1], o[j + 2]);
                        pieDtoList.add(pieDto);
                    }
                    mulitPieDtoList.add(pieDtoList);
                }
                showValues.add(mulitPieDtoList);
                showDto.setShowValue(showValues);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    Object[] o = (Object[]) list.get(i);
                    for (int j = 0; j < x; j++) {
                        matrix[j][i] = o[j + 2];
                    }
                    showkeys.add((String) o[1]);
                }

                for (int i = 0; i < matrix.length; i++) {
                    showValues.add(Arrays.asList(matrix[i]));
                }
                showDto.setShowValue(showValues);
            }


            List<ValueColorMap> valueColorMaps = valueColorMapRepository.findByVid(visualize.getVid());
            if (null != valueColorMaps && valueColorMaps.size() > 0) {
                visualize.setRangeDesc(valueColorMaps);
            }

            List<ColumnMap> columnMapList = columnMapRepository.findByVidAndType(visualize.getVid());
            showDto.setColumnList(columnMapList);
            columnMapList.stream().map(e -> {
                e.setVisualize(null);
                return e;
            }).collect(Collectors.toList());
            List<String> showLabel = columnMapList.stream().map(ColumnMap::getColumnshow).collect(Collectors.toList());

            showDto.setShowLabel(showLabel);
            showDto.setShowKey(showkeys);
            showDto.setDid(did);
            List<OrientY> orientYList = visualize.getOrientYList();
            List<OrientX> orientXList = visualize.getOrientXList();

            orientYList = orientYList.stream().map(e -> {
                e.setVisualize(null);
                return e;
            }).collect(Collectors.toList());
            visualize.setOrientYList(orientYList);
            orientXList = orientXList.stream().map(e -> {
                e.setVisualize(null);
                return e;
            }).collect(Collectors.toList());
            visualize.setOrientXList(orientXList);
        }

        BeanUtils.copyProperties(visualize, showDto);
        return showDto;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addVisualize(VisualDto visualDto, String tableName) throws Exception {
        List<ColumnMap> columns = new ArrayList<>(15);
        Visualize visualize = visualDto.getVisualize();
        StringBuilder sql = new StringBuilder(150);
        StringBuilder insertDemoSql = new StringBuilder(300);

        if (Constants.TEXT.equals(visualize.getType())) {

        } else if (Constants.NUMBER.equals(visualize.getType())) {

        } else {
            // 构造建表语句
            List<ColumnDto> columnMapList = getGenerateTable(visualDto, columns, visualize, sql, tableName);

            // 添加缺省的Demo数据
            generateDemoData(visualize, insertDemoSql, tableName, columnMapList);

            visualize.setColumnMapList(columns);
            visualize.setColumnsnumber(columnMapList.size());
            visualize.setYtype(DOUBLE_TYPE);

            // 设置默认值
            visualize.setxAxisLine(true);
            visualize.setxSplitLine(true);
            visualize.setxInverse(false);
            visualize.setAlignWithLabel(false);
            visualize.setxToy(false);
            visualize.setDataZoom(false);

            visualize.setyAxisLine(true);
            visualize.setySplitLine(true);
            visualize.setyInverse(false);
            visualize.setxBoundaryGap(false);
            visualize.setIsrangeDesc(true == visualize.getIsrangeDesc() ? true : false);
        }
        visualizeRepository.save(visualize);
    }

    private List<ColumnDto> getGenerateTable(VisualDto visualDto, List<ColumnMap> columns, Visualize visualize, StringBuilder sql, String tableName) {
        List<ColumnDto> columnMapList = visualDto.getColumnList();

        sql.append(Constants.CREATE_TABLE).append(tableName).append(Constants.CREATE_TABLE_ID);
        for (int i = 0; i < columnMapList.size(); i++) {
            ColumnDto columnDto = columnMapList.get(i);
            sql.append("`").append(columnDto.getField()).append("` ").append(columnDto.getType()).append(Constants.CREATE_TABLE_DEFAULT);
            ColumnMap columnMap = new ColumnMap();
            // 设置默认值
            columnMap.setColMax(false);
            columnMap.setColMin(false);
            columnMap.setColAverage(false);
            columnMap.setColGradient(false);
            columnMap.setColAreaStyle(false);
            columnMap.setColSmooth(true);
            columnMap.setColstep(false);
            columnMap.setColRoseType(false);
            columnMap.setColLabelline(false);

            BeanUtils.copyProperties(columnDto, columnMap);
            columnMap.setVisualize(visualize);
            columns.add(columnMap);
        }
        sql.append(Constants.CREATE_TABLE_PRIMARY);

        sessionFactory.getCurrentSession().createSQLQuery(sql.toString()).executeUpdate();
        visualize.setTablename(tableName);
        return columnMapList;
    }

    private void generateDemoData(Visualize visualize, StringBuilder insertDemoSql, String tableName, List<ColumnDto> columnMapList) {
        Integer rand;
        for (int i = START_NUM; i < END_NUM; i++) {
            Random random = new Random();

            insertDemoSql.append(Constants.INSERT_SQL).append(tableName).append("(");
            for (int j = 0; j < columnMapList.size(); j++) {
                ColumnDto columnDto = columnMapList.get(j);
                insertDemoSql.append(columnDto.getField()).append(",");
            }
            insertDemoSql.setLength(insertDemoSql.length() - 1);
            if (Constants.PIE.equals(visualize.getType())) {
                insertDemoSql.append(Constants.VALUE_SQL).append(pieXMap.get(i)).append("'");
            } else {
                insertDemoSql.append(Constants.VALUE_SQL).append(lineXMap.get(i)).append("'");
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


    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Dashboard findDashboardByVid(Integer integerId) {
        return dashboardRepository.findOne(integerId);
    }

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public DashboardShowDto findDashboardDataByVid(Integer integerId) throws Exception {
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
                BeanUtils.copyProperties(visualize, dashboardVisualize);
                dashboardVisualizeRepository.save(dashboardVisualize);
            } else {
                // 更新
                DashboardVisualize dashboardVisualize = dashboardVisualizeRepository.findOne(location.getDid());
                Visualize visualizeNew = visualizeRepository.findOne(location.getVid());
                dashboardVisualize.setVisualize(visualizeNew);

                BeanUtils.copyProperties(location, dashboardVisualize);
                BeanUtils.copyProperties(visualizeNew, dashboardVisualize);
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


    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<String> tableList(Integer dbId, String tabName) throws Exception {
        List<String> nameList = new ArrayList<>(50);
        Database database = databaseRepository.findOne(dbId);
        String url = getDbConnectString(database);
        Connection conn = JdbcUtil.getConnection(url, database.getUser(), Decrypt(database.getPassword()), database.getDrivername());
        String sql = Constants.SHOW_TAB_SQL_MAP.get(database.getDbtype());
        if (Constants.ORACLE.equals(database.getDbtype())) {
            if ("".equals(tabName)) {
                sql = sql + database.getUser().toUpperCase() + Constants.SUFFIX + Constants.UNION;
            } else {
                sql = sql + database.getUser().toUpperCase() + Constants.SUFFIX + Constants.TABLE_NAME + tabName +
                        Constants.UNION + Constants.VIEW_NAME + tabName;
            }
        } else {
            if (!"".equals(tabName)) {
                sql = sql + " where Tables_in_" + database.getDatabase() + " = " + tabName;
            }
        }

        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            String string = null;
            if (Constants.ORACLE.equals(database.getDbtype())) {
                string = rs.getString(Constants.ORACLE_TABLE_NAME);
            } else {
                string = rs.getString(Constants.TABLEPREFIX + database.getDatabase());
            }
            nameList.add(string);
        }
        JdbcUtil.closeResource(conn, rs, st);
        return nameList;
    }


    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ColumnDto> columnList(String tablename, Integer dbid, Integer vid) throws Exception {
        List<ColumnDto> columnDtoList = new ArrayList<>(50);
        Database database = databaseRepository.findOne(dbid);
        String url = getDbConnectString(database);

        Connection conn = JdbcUtil.getConnection(url, database.getUser(), Decrypt(database.getPassword()), database.getDrivername());
        String sql = null;
        if (Constants.ORACLE.equals(database.getDbtype())) {
            sql = Constants.ORACLE_COLOUMN_PREFIX + tablename + Constants.ORACLE_COLOUMN_SUFFIX;
        } else {
            sql = Constants.COLOUMN_PREFIX + tablename;
        }

        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            ColumnDto columnDto = null;
            if (Constants.ORACLE.equals(database.getDbtype())) {
                String type = rs.getString(Constants.TABLE_COLUMN_TYPE);
                if (type.startsWith(Constants.TYPE_NUMBER)) {
                    type = type.replace(Constants.TYPE_NUMBER, Constants.TYPE_DOUBLE);
                } else if (type.startsWith(Constants.TYPE_VARCHAR2)) {
                    type = type.replace(Constants.TYPE_VARCHAR2, Constants.TYPE_VARCHAR);
                } else {
                    continue;
                }
                columnDto = new ColumnDto(rs.getString(Constants.TABLE_COLUMN_NAME).toLowerCase(), type);
            } else {
                String propertyName = rs.getString(Constants.TABLE_COLUMN_NAME);
                if (!propertyName.toLowerCase().contains("id")) {
                    columnDto = new ColumnDto(propertyName, rs.getString(Constants.TABLE_COLUMN_TYPE));
                }
            }
            if (null != columnDto) {
                columnDtoList.add(columnDto);
            }
        }
        JdbcUtil.closeResource(conn, rs, st);

        if (0 == vid) {
            return columnDtoList;
        } else {
            List<ColumnMap> selectedColumns = columnMapRepository.findByVid(vid);
            List<ColumnDto> equalList = new ArrayList<>(15);

            for (int i = 0; i < columnDtoList.size(); i++) {
                for (ColumnMap columnMap : selectedColumns) {
                    if (columnDtoList.get(i).getField().toLowerCase().equals(columnMap.getField().toLowerCase())) {
                        equalList.add(columnDtoList.get(i));
                    }
                }
            }
            columnDtoList.removeAll(equalList);
            return columnDtoList;
        }
    }

    private String getDbConnectString(Database database) {
        String url = Constants.JDBC + database.getDbtype() + dbType.get(database.getDbtype()) + database.getIp() +
                ":" + database.getPort() + "/" + database.getDatabase();
        if (!Constants.ORACLE.equals(database.getDbtype())) {
            url = url + Constants.URL_SUFFIX;
        }
        return url;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ColumnMap> columnMapList(Integer vid) {
        List<ColumnMap> columnMapList = columnMapRepository.findByVidAndType(vid);
        return columnMapList;
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

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Dashboard visualizeHasUsed(Integer integerValue) {
        Visualize visualize = visualizeRepository.findOne(integerValue);
        List<DashboardVisualize> dashboardVisualizes = visualize.getDashboardVisualizes();
        if (null != dashboardVisualizes && dashboardVisualizes.size() > 0) {
            return dashboardVisualizes.get(0).getDashboard();
        }
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void databaseDelete(Integer integerValue) {
        databaseRepository.delete(integerValue);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List validWhere(VisualDto visualDto) throws Exception {
        // 执行验证SQL
        Visualize visualize = visualizeRepository.findOne(visualDto.getVisualize().getVid());

        String tableName = visualize.getTablename();
        String sql = Constants.COUNT_SQL + tableName + Constants.SQL_WHERE + visualize.getVwhere() + Constants.SQL_AND;
        List list = sessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(CountDto.class).list();
        return list;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public void validCountSQL(Visualize visualize) throws Exception {
        Database database = databaseRepository.findOne(visualize.getDbid());
        String url = getDbConnectString(database);
        Connection conn = JdbcUtil.getConnection(url, database.getUser(), Decrypt(database.getPassword()), database.getDrivername());
        PreparedStatement st = conn.prepareStatement(visualize.getVwhere());
        st.executeQuery();
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void visualizeDelete(Integer integerId) {
        Visualize visualize = visualizeRepository.findOne(integerId);
        List<ColumnMap> columnMapList = visualize.getColumnMapList();
        if (null != columnMapList && columnMapList.size() > 0) {
            columnMapList.stream().map(e -> {
                columnMapRepository.delete(e.getVid());
                return null;
            });
        }
        List<OrientY> orientYList = visualize.getOrientYList();
        if (null != orientYList && orientYList.size() > 0) {
            orientYList.stream().map(ele -> {
                orientYRepository.delete(ele.getOrientyid());
                return null;
            });
        }

        List<OrientX> orientXList = visualize.getOrientXList();
        if (null != orientXList && orientXList.size() > 0) {
            orientXList.stream().map(ele -> {
                orientxRepository.delete(ele.getOrientxid());
                return null;
            });
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
        if (null != dashboardVisualizes && dashboardVisualizes.size() > 0) {
            for (DashboardVisualize dashboardVisualize : dashboardVisualizes) {
                dashboardVisualizeRepository.delete(dashboardVisualize.getDid());
            }
        } else {
            dashboardRepository.delete(integerValue);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateVisualize(VisualDto visualDto) {
        Session currentSession = sessionFactory.getCurrentSession();

        Visualize visualize = visualDto.getVisualize();
        List<Integer> deleteColumnList = visualDto.getDeleteColumnList();
        List<Integer> yDeleteList = visualDto.getyDeleteList();
        List<Integer> xDeleteList = visualDto.getxDeleteList();
        List<Integer> colorDeleteList = visualDto.getColorDeleteList();

        List<ValueColorMap> rangeDesc = visualDto.getRangeDesc();
        List<ColumnMap> mapList = visualDto.getColumnMaps();
        List<OrientY> yList = visualDto.getyList();
        List<OrientX> xList = visualDto.getxList();
        // 更新主表
        Visualize visualizeDb = visualizeRepository.findOne(visualize.getVid());
        BeanUtils.copyProperties(visualize, visualizeDb, ObjectUtil.getNullPropertyNames(visualize));

        // 新增
        if (null != mapList) {
            mapList = mapList.stream().map(e -> {
                if (null == e.getColumnmid()) {
                    // ALTER TABLE table_name ADD column_name datatype
                    String alterSQL = "ALTER TABLE " + visualizeDb.getTablename() + " ADD " + e.getField() + " " + e.getType();
                    SQLQuery query = currentSession.createSQLQuery(alterSQL);
                    query.executeUpdate();

                    // 插入demo数据
                    String sql = "select sid from " + visualize.getTablename();
                    List<Integer> sidList = (List<Integer>) currentSession.createSQLQuery(sql).list();
                    for (Integer sid : sidList) {
                        Random random = new Random();
                        Integer rand = random.nextInt(300) + 10;
                        sql = "update " + visualize.getTablename() + " set `" + e.getField() + "` =  " + rand + " where  `sid` = " + sid;
                        SQLQuery q = currentSession.createSQLQuery(sql);
                        q.executeUpdate();
                    }
                    Integer columnsNumber = visualizeDb.getColumnsnumber() + 1;
                    visualizeDb.setColumnsnumber(columnsNumber);
                }
                e.setColName(e.getField());

                e.setVisualize(visualizeDb);
                return e;
            }).collect(Collectors.toList());
        }


        // column删除
        if (null != deleteColumnList && deleteColumnList.size() >= 1) {
            ColumnMap column = columnMapRepository.findOne(deleteColumnList.get(0));
            String field = column.getField();
            // ALTER TABLE table_name DROP COLUMN column_name
            String alterSQL = "ALTER TABLE `" + visualizeDb.getTablename() + "` DROP COLUMN `" + field + "`";
            SQLQuery query = currentSession.createSQLQuery(alterSQL);
            query.executeUpdate();
            columnMapRepository.delete(deleteColumnList.get(0));
            Integer columnsNumber = visualizeDb.getColumnsnumber() - 1;
            visualizeDb.setColumnsnumber(columnsNumber);
        }

        // 存储多个y轴情况
        if (null != yList && yList.size() > 0) {
            yList = yList.stream().map(ele -> {
                ele.setyAxisLine(true);
                ele.setySplitLine(true);
                ele.setVisualize(visualizeDb);
                return ele;
            }).collect(Collectors.toList());
            visualizeDb.setOrientYList(yList);
        }
        // 删除y轴
        if (null != yDeleteList && yDeleteList.size() > 0) {
            for (Integer integer : yDeleteList) {
                orientYRepository.delete(integer);
            }
        }

        // 存储多个x轴情况
        if (null != xList && xList.size() > 0) {
            xList = xList.stream().map(orientX -> {
                orientX.setxAxisLine(true);
                orientX.setxSplitLine(true);
                orientX.setVisualize(visualizeDb);
                return orientX;
            }).collect(Collectors.toList());
            visualizeDb.setOrientXList(xList);
        }

        // 删除x轴
        if (null != xDeleteList && xDeleteList.size() > 0) {
            for (Integer integer : xDeleteList) {
                orientxRepository.delete(integer);
            }
        }

        // 根据数据变换颜色
        if (null != rangeDesc && rangeDesc.size() > 0) {
            rangeDesc = rangeDesc.stream().map(e -> {
                e.setVisualize(visualizeDb);
                return e;
            }).collect(Collectors.toList());
            visualizeDb.setIsrangeDesc(true);
            visualizeDb.setRangeDesc(rangeDesc);
        }

        // 删除颜色
        if (null != colorDeleteList && colorDeleteList.size() > 0) {
            for (Integer integer : colorDeleteList) {
                valueColorMapRepository.delete(integer);
            }
        }

        visualizeDb.setColumnMapList(mapList);
        visualizeRepository.save(visualizeDb);
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
            if (StringUtils.isNotBlank(visualize.getBusinesscategory())) {
                list.add(cb.like(root.get("businesscategory").as(String.class), "%" + visualize.getBusinesscategory() + "%"));
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
            if (StringUtils.isNotBlank(dashboard.getBusinesscategory())) {
                list.add(cb.like(root.get("businesscategory").as(String.class), "%" + dashboard.getBusinesscategory() + "%"));
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

    @Transactional(readOnly = true, rollbackFor = Exception.class)
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
                row.createCell(3).setCellValue(typeE2CMap.get(visualize.getType()));
                row.createCell(4).setCellValue(visualize.getVisualizedescription());
                count++;
            }
        }
        return wb;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isSameColumn(ColumnMap columnMap) {
        ColumnMap dbColumnMap = columnMapRepository.findByFieldAndVid(columnMap.getField(), columnMap.getVid());
        return null != dbColumnMap ? true : false;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void columnMapUpdate(ColumnMap columnMap) {
        ColumnMap dbColumnMap = columnMapRepository.findOne(columnMap.getVid());
        BeanUtils.copyProperties(columnMap, dbColumnMap);
        BeanUtils.copyProperties(columnMap, dbColumnMap, ObjectUtil.getNullPropertyNames(columnMap));
        columnMapRepository.save(dbColumnMap);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String getTableName(String type) {
        // 获取表名称
        TableManager tableManager = tableManagerRepository.findByTablecategory(type);
        String tableName = tableManager.getTableprefix() + tableManager.getTablemaxid();
        tableManager.setTablemaxid(tableManager.getTablemaxid() + 1);
        tableManagerRepository.save(tableManager);
        return tableName;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean validateDatabase(Integer dbId) throws Exception {
        Database database = databaseRepository.findOne(dbId);
        String url = getDbConnectString(database);
        Connection conn = JdbcUtil.getConnection(url, database.getUser(), Decrypt(database.getPassword()), database.getDrivername());
        if (!conn.isClosed()) {
            database.setValid(1);
            databaseRepository.save(database);
            JdbcUtil.closeConnect(conn);
            return true;
        } else {
            database.setValid(0);
            databaseRepository.save(database);
            JdbcUtil.closeConnect(conn);
            return false;
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void databaseAdd(Database database) throws Exception {
        database.setDrivername(dbMap.get(database.getDbtype()));
        database.setValid(0);
        database.setPassword(Encrypt(database.getPassword()));
        databaseRepository.save(database);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void databaseUpdate(Database database) throws Exception {
        Database databaseDb = databaseRepository.findOne(database.getDbid());
        BeanUtils.copyProperties(database, databaseDb, ObjectUtil.getNullPropertyNames(database));
        databaseDb.setDrivername(dbMap.get(database.getDbtype()));
        databaseDb.setValid(0);
        databaseDb.setPassword(Encrypt(databaseDb.getPassword()));
        databaseRepository.save(databaseDb);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<Database> databaseList(Integer valid) throws Exception {
        List<Database> databaseList = null;
        if (0 == valid) {
            databaseList = databaseRepository.findAll();
        } else {
            databaseList = databaseRepository.findAvaliableLins(valid);
        }
        for (Database database : databaseList) {
            database.setDbstatus(dbStatusMap.get(database.getValid()));
            database.setPassword(Decrypt(database.getPassword()));
        }
        return databaseList;
    }

}
