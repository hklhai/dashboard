package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.ColumnMap;
import com.hxqh.dashboard.model.Dashboard;
import com.hxqh.dashboard.model.Database;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.data.domain.Pageable;

import java.util.List;

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
     * @param bid       dashboardId
     * @param did       dashboardVisualizeId
     * @param random    random随机数
     * @return LineDouble List
     */
    ShowDto findLineByVid(Integer integerId, Integer random, Integer bid, Integer did);

    /**
     * 添加visualize
     *
     * @param visualDto
     * @param tableName
     * @throws Exception
     */
    void addVisualize(VisualDto visualDto, String tableName) throws Exception;

    /**
     * 添加dashboard
     *
     * @param dashboard
     */
    void addDashboard(Dashboard dashboard);


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
    void addDashboardVisualize(DashboardVisualizeDto integerValue);


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
    boolean isDashboardByDashboardName(String dashboardname);


    /**
     * 删除visualize，并级联删除DashboardVisualize中数据
     *
     * @param integerId visualize主键
     */
    void visualizeDelete(Integer integerId);

    /**
     * 删除dashboard,级联删除DashboardVisualize中数据
     *
     * @param integerValue dashboard主键
     */
    void dashboardDelete(Integer integerValue);

    /**
     * 更新visualize
     *
     * @param visualize visualize实体
     */
    void updateVisualize(VisualDto visualize);

    /**
     * 更新dashboard
     *
     * @param dashboard dashboard实体
     */
    void updateDashboard(Dashboard dashboard);


    /**
     * visualize带条件查询分页
     *
     * @param visualize
     * @param pageable
     * @return
     */
    VisualizeDto visualizeList2(Visualize visualize, Pageable pageable);

    /**
     * dashboard带条件查询分页
     *
     * @param dashboard
     * @param pageable
     * @return
     */
    DashboardDto dashboardList2(Dashboard dashboard, Pageable pageable);

    /**
     * 导出Excel
     *
     * @return
     */
    HSSFWorkbook exportVisualizeExcel();

    /**
     * 根据仪表板名称和主键查询
     *
     * @param dashboardDb
     * @return
     */
    boolean isDashboardByDashboardNameAndBidNot(Dashboard dashboardDb);

    /**
     * 根据视图名称和主键查询
     *
     * @param visualizeDb
     * @return
     */
    boolean isVisualizeByVisualizenameAndVidNot(Visualize visualizeDb);


    /**
     * 获取数据库中表列表
     *
     * @param dbid
     * @return
     * @throws Exception
     */
    List<String> tableList(Integer dbid) throws Exception;


    /**
     * 获取表字段列表
     *
     * @param tablename 表名
     * @param dbid      数据库id
     * @return
     * @throws Exception
     */
    List<ColumnDto> columnList(String tablename, Integer dbid) throws Exception;

    /**
     * 获取数据库列表
     *
     * @return
     */
    List<Database> databaseList();

    /**
     * 查询是图对应字段列表
     *
     * @param vid
     * @return
     */
    List<ColumnMap> columnMapList(Integer vid);

    /**
     * 判断列是否已经存在
     *
     * @param columnMap
     * @return
     */
    boolean isSameColumn(ColumnMap columnMap);

    /**
     * 更新列
     *
     * @param columnMap
     */
    void columnMapUpdate(ColumnMap columnMap);

    /**
     * 新建表时获取tableManager分配表名
     *
     * @param visualDto
     * @return
     */
    String getTableName(VisualDto visualDto);

    /**
     * 验证数据库链接
     *
     * @param dbId
     * @return
     * @throws Exception
     */
    Boolean validateDatabase(Integer dbId) throws Exception;

    /**
     * 添加数据库
     *
     * @param database
     */
    void databaseAdd(Database database);

    /**
     * 更新数据库配置
     *
     * @param database
     */
    void databaseUpdate(Database database);
}
