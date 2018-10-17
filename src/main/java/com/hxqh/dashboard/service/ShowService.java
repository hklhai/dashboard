package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.Dashboard;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.*;
import org.springframework.data.domain.Pageable;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
public interface ShowService {
    /**
     * 查询Visualize
     *
     * @param vid Visualize主键
     * @return Visualize实体
     */
    Visualize findVisualizeByVid(Integer vid);

    /**
     * 查询展示数据
     *
     * @param integerId
     * @return LineDouble List
     */
    ShowDto findLineByVid(Integer integerId);

    /**
     * 添加visualize
     *
     * @param visualize
     */
    void addVisualize(Visualize visualize);

    /**
     * 添加dashboard
     *
     * @param dashboard
     */
    void addDashboard(Dashboard dashboard);

    /**
     * visualize列表
     *
     * @param visualize visualize实体为后期做带条件分页查询
     * @param pageable  分页实体类
     * @return
     */
    VisualizeDto visualizeList(Visualize visualize, Pageable pageable);

    /**
     * 查询Dashboard
     *
     * @param integerId Dashboard主键
     * @return Dashboard实体类
     */
    Dashboard findDashboardByVid(Integer integerId);

    /**
     * 查询Dashboard中所有Visualize
     *
     * @param integerId DashBoard主键
     * @return DashBoard展示类
     */
    DashboardShowDto findDashboardDataByVid(Integer integerId);

    /**
     * 绑定DashBoard与Visualize
     *
     * @param integerValue
     */
    void addDashboardVisualize(DoubleIntegerValue integerValue);


    /**
     * 查询是否存在visualizename
     *
     * @param visualizename
     * @return 存在返回true
     */
    boolean isVisualizeByVisualizename(String visualizename);

    /**
     * 查询是否存在dashboardname
     *
     * @param dashboardname
     * @return 存在返回true
     */
    boolean isDashboardByVisualizename(String dashboardname);

    /**
     * 是否存在dashboardname与Visualize
     *
     * @param integerValue
     * @return 存在返回true
     */
    boolean isHasDashboardVisualize(DoubleIntegerValue integerValue);

    /**
     * visualize分页查询
     *
     * @param dashboard dashboard实体为后期做带条件分页查询
     * @param pageable  分页实体类
     * @return 分页结果
     */
    DashboardDto dashboardList(Dashboard dashboard, Pageable pageable);
}
