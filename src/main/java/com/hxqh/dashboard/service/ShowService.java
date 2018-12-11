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
     * @return 展示数据 List
     */
    ShowDto findLineByVid(Integer integerId, Integer random, Integer bid, Integer did);

    /**
     * 添加visualize
     *
     * @param visualDto 视图DTO
     * @param tableName 表名
     * @throws Exception
     */
    void addVisualize(VisualDto visualDto, String tableName) throws Exception;

    /**
     * 添加dashboard
     *
     * @param dashboard 仪表板实体
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
     * @param dashboardVisualizeDto 仪表板ID、视图ID DTO
     */
    void addDashboardVisualize(DashboardVisualizeDto dashboardVisualizeDto);


    /**
     * 查询是否存在visualizename
     *
     * @param visualizename 视图名称
     * @return 存在返回true
     */
    boolean isVisualizeByVisualizename(String visualizename);

    /**
     * 查询是否存在dashboardname
     *
     * @param dashboardname 仪表板名称
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
     * @param visualize 前台传入带条件查询视图实体
     * @param pageable  分页工具类
     * @return 视图列表
     */
    VisualizeDto visualizeList2(Visualize visualize, Pageable pageable);

    /**
     * dashboard带条件查询分页
     *
     * @param dashboard 前台传入带条件查询仪表板实体
     * @param pageable  分页工具类
     * @return 仪表板列表
     */
    DashboardDto dashboardList2(Dashboard dashboard, Pageable pageable);

    /**
     * 导出Excel
     *
     * @return Excel对象
     */
    HSSFWorkbook exportVisualizeExcel();

    /**
     * 根据仪表板名称和主键查询
     *
     * @param dashboardDb 数据库中仪表板对象
     * @return 存在返回true
     */
    boolean isDashboardByDashboardNameAndBidNot(Dashboard dashboardDb);

    /**
     * 根据视图名称和主键查询
     *
     * @param visualizeDb 数据库中视图对象
     * @return 存在返回true
     */
    boolean isVisualizeByVisualizenameAndVidNot(Visualize visualizeDb);


    /**
     * 获取数据库中表列表
     *
     * @param dbId    数据库id
     * @param tabName 筛选表名称
     * @return 数据库名称列表
     * @throws Exception
     */
    List<String> tableList(Integer dbId, String tabName) throws Exception;


    /**
     * 获取表字段列表
     *
     * @param tablename 表名
     * @param dbid      数据库id
     * @param vid       视图id
     * @return 列对象列表
     * @throws Exception
     */
    List<ColumnDto> columnList(String tablename, Integer dbid, Integer vid) throws Exception;

    /**
     * 获取数据库列表
     *
     * @param valid 测试是否通过标志位
     * @return 数据库列表
     * @throws Exception
     */
    List<Database> databaseList(Integer valid) throws Exception;

    /**
     * 查询是图对应字段列表
     *
     * @param vid 视图主键
     * @return 列对应关系列表
     */
    List<ColumnMap> columnMapList(Integer vid);

    /**
     * 判断列是否已经存在
     *
     * @param columnMap 列对应关系实体
     * @return 存在返回true
     */
    boolean isSameColumn(ColumnMap columnMap);

    /**
     * 更新列
     *
     * @param columnMap 列对应关系实体
     */
    void columnMapUpdate(ColumnMap columnMap);

    /**
     * 新建表时获取tableManager分配表名
     *
     * @param type 视图类型
     * @return 新建表名称
     */
    String getTableName(String type);

    /**
     * 验证数据库链接
     *
     * @param dbId 数据库ID
     * @return 连接成功返回true
     * @throws Exception
     */
    Boolean validateDatabase(Integer dbId) throws Exception;

    /**
     * 添加数据库
     *
     * @param database 数据库实体
     * @throws Exception
     */
    void databaseAdd(Database database) throws Exception;

    /**
     * 更新数据库配置
     *
     * @param database 数据库实体
     * @throws Exception
     */
    void databaseUpdate(Database database) throws Exception;


    /**
     * 判断删除视图是否被仪表板使用
     *
     * @param integerValue visualize主键ID
     * @return 仪表板对象
     */
    Dashboard visualizeHasUsed(Integer integerValue);

    /**
     * 数据库删除接口
     *
     * @param integerValue 数据库ID主键
     */
    void databaseDelete(Integer integerValue);

}
