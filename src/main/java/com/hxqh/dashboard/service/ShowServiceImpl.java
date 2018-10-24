package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.*;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.repository.DashboardRepository;
import com.hxqh.dashboard.repository.DashboardVisualizeRepository;
import com.hxqh.dashboard.repository.TableManagerRepository;
import com.hxqh.dashboard.repository.VisualizeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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


    private static Map<String, String> yTypeMap = new HashMap<String, String>() {{
        put("double", "double(10,2)");
        put("float", "float(7,2)");
        put("int", "int");
    }};

    private static Map<String, String> typeMap = new HashMap<String, String>() {{
        put("饼图", "pie");
        put("条形图", "bar");
        put("折线图", "line");
    }};

    private static final String CREATE_SQL_1 = "create table ";
    private static final String SELECT_SQL = "select * from ";
    private static final String SELECT_SQL_1 = "select showkey,showvalue, sid+ ";
    private static final String SELECT_SQL_2 = " sid from ";

    private static final String CREATE_SQL_2 = "(`sid` int(20) NOT NULL AUTO_INCREMENT,  `showkey` varchar(20) DEFAULT NULL,  `showvalue` ";
    private static final String CREATE_SQL_3 = " DEFAULT NULL, PRIMARY KEY (`sid`))";
    private static final String DROP_TABLE_SQL = " drop table ";
    private static final String DOUBLE_TYPE = "double";
    private static final String FLOAT_TYPE = "float";
    private static final Integer START_NUM = 1;
    private static final Integer END_NUM = 8;
    private static final Integer SPLIT_NUM = 150;

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Visualize findVisualizeByVid(Integer vid) {
        return visualizeRepository.findOne(vid);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public ShowDto findLineByVid(Integer integerId, Integer random, Integer bid, Integer did) {
        Visualize visualize = visualizeRepository.findOne(integerId);

        String sql = SELECT_SQL_1 + random * SPLIT_NUM + SELECT_SQL_2 + visualize.getTablename();
        String keyShow, valueShow;
        Session currentSession = sessionFactory.getCurrentSession();

        if (DOUBLE_TYPE.equals(visualize.getYtype())) {
            List<LineDouble> list = currentSession.createSQLQuery(sql).addEntity(LineDouble.class).list();
            keyShow = list.stream().map(LineDouble::getShowkey).collect(Collectors.toList()).toString();
            valueShow = list.stream().map(LineDouble::getShowvalue).collect(Collectors.toList()).toString();
        } else if (FLOAT_TYPE.equals(visualize.getYtype())) {
            List<LineFloat> list = currentSession.createSQLQuery(sql).addEntity(LineFloat.class).list();
            keyShow = list.stream().map(LineFloat::getShowkey).collect(Collectors.toList()).toString();
            valueShow = list.stream().map(LineFloat::getShowvalue).collect(Collectors.toList()).toString();
        } else {
            List<LineInteger> list = currentSession.createSQLQuery(sql).addEntity(LineInteger.class).list();
            keyShow = list.stream().map(LineInteger::getShowkey).collect(Collectors.toList()).toString();
            valueShow = list.stream().map(LineInteger::getShowvalue).collect(Collectors.toList()).toString();
        }
        ShowDto showDto = new ShowDto(visualize.getVisualizename(), visualize.getXname(), visualize.getYname(),
                keyShow, valueShow, visualize.getType(), visualize.getVid(), bid, did);

        return showDto;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addVisualize(Visualize visualize) {
        TableManager tableManager = tableManagerRepository.findByTablecategory(visualize.getType());
        String tableName = tableManager.getTableprefix() + tableManager.getTablemaxid();
        String yTpe = visualize.getYtype();
        String sql = CREATE_SQL_1 + tableName + CREATE_SQL_2 + yTypeMap.get(yTpe) + CREATE_SQL_3;
        sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
        visualize.setTablename(tableName);
        tableManager.setTablemaxid(tableManager.getTablemaxid() + 1);
        // 添加缺省的Demo数据
        for (int i = START_NUM; i < END_NUM; i++) {
            Random random = new Random();
            int rand = random.nextInt(60) + 10;
            String insertSQL = "insert into " + tableName + "(showkey,showvalue) values (" + i + "," + rand + ")";
            sessionFactory.getCurrentSession().createSQLQuery(insertSQL).executeUpdate();
        }

        visualizeRepository.save(visualize);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addDashboard(Dashboard dashboard) {
        dashboardRepository.save(dashboard);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public VisualizeDto visualizeList(Visualize visualize, Pageable pageable) {
        List<String> distinctBusinesscategory = visualizeRepository.findDistinctBusinesscategory();
        Page<Visualize> visualizes = visualizeRepository.findAll(pageable);
        //获取结果集
        List<Visualize> visualizeList = visualizes.getContent();
        Integer totalPages = visualizes.getTotalPages();
        VisualizeDto visualizeDto = new VisualizeDto(pageable, totalPages, visualizeList);
        visualizeDto.setDistinctBusinesscategory(distinctBusinesscategory);
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
                DashboardVisualize dashboardVisualize = new DashboardVisualize(dashboard, visualize,
                        location.getX(), location.getY(), location.getH(), location.getW());
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
    public boolean isDashboardByVisualizename(String dashboardname) {
        Dashboard dashboard = dashboardRepository.findByDashboardname(dashboardname);
        return null != dashboard ? true : false;
    }


    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public DashboardDto dashboardList(Dashboard dashboard, Pageable pageable) {
        Page<Dashboard> dashboards = dashboardRepository.findAll(pageable);
        //获取结果集
        List<Dashboard> dashboardList = dashboards.getContent();

//        dashboardList = dashboardList.stream().map(e -> {
//            e.setDashboardVisualizes(null);
//            return e;
//        }).collect(Collectors.toList());

        Integer totalPages = dashboards.getTotalPages();
        DashboardDto visualizeDto = new DashboardDto(pageable, totalPages, dashboardList);
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

}
