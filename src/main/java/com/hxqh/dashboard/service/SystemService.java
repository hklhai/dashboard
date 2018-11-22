package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.Model;
import com.hxqh.dashboard.model.Role;
import com.hxqh.dashboard.model.User;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.model.view.ViewRoleModel;
import com.hxqh.dashboard.model.view.ViewUserModel;
import com.hxqh.dashboard.model.view.ViewUserRole;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
public interface SystemService {

    /**
     * 根据用户名获取User对象
     *
     * @param name 用户名
     * @return 用户对象
     */
    User findUserById(String name);


    /**
     * 是否存在User
     *
     * @param name 用户名
     * @return 存在返回true
     */
    boolean isUserByName(String name);


    /**
     * 是否存在User
     *
     * @param user 用户实体类
     * @return 存在返回true
     */
    boolean isUserByNameAndID(User user);

    /**
     * 添加User
     *
     * @param user 用户实体类
     */
    void addUser(User user);


    /**
     * 是否存在Role
     *
     * @param rolename 角色名称
     * @return 存在返回true
     */
    boolean isRoleByName(String rolename);

    /**
     * 根据角色名称、角色主键判断是否存在
     *
     * @param roleDb 角色实体类
     * @return 存在返回true
     */
    boolean isRoleByNameAndRoleid(Role roleDb);


    /**
     * 添加Role
     *
     * @param role 剧社实体类
     */
    void roleAdd(Role role);


    /**
     * 是否存在Model
     *
     * @param modelname 模块名称
     * @return 存在返回true
     */
    boolean isModelByName(String modelname);

    /**
     * 根据模块名称和模块主键查询
     *
     * @param modelDb 模块实体类
     * @return 存在返回true
     */
    boolean isModelByNameAndModelid(Model modelDb);

    /**
     * 添加Model
     *
     * @param model 模块实体类
     */
    void modelAdd(Model model);


    /**
     * 通过主键查找User
     *
     * @param userId 用户主键
     * @return User对象
     */
    User findUserById(Integer userId);

    /**
     * 通过主键查找Role
     *
     * @param roleId 角色主键
     * @return Role对象
     */
    Role findRoleById(Integer roleId);

    /**
     * 通过主键查找Model
     *
     * @param modelId 模块主键
     * @return Model对象
     */
    Model findModelById(Integer modelId);

    /**
     * 删除用户
     *
     * @param userId 用户主键
     */
    void userDelete(Integer userId);

    /**
     * 删除角色
     *
     * @param roleId 角色主键
     */
    void roleDelete(Integer roleId);


    /**
     * 删除Model
     *
     * @param modelId 模块主键
     */
    void modelDelete(Integer modelId);


    /**
     * 更新用户
     *
     * @param userDb 用户实体类
     */
    void updateUser(User userDb);


    /**
     * 更新角色
     *
     * @param roleDb 角色实体类
     */
    void updateRole(Role roleDb);


    /**
     * 更新model
     *
     * @param modelDb 模块实体类
     */
    void updateModel(Model modelDb);


    /**
     * 用户列表
     *
     * @param user     用户实体类
     * @param pageable 分页工具类
     * @return 返回用户列表
     */
    UserDto userList(User user, Pageable pageable);


    /**
     * 角色列表
     *
     * @param role     角色实体类
     * @param pageable 分页工具类
     * @return 角色列表
     */
    RoleDto roleList(Role role, Pageable pageable);


    /**
     * model列表
     *
     * @param model    模块实体类
     * @param pageable 分页工具类
     * @return 模块列表
     */
    ModelDto modelList(Model model, Pageable pageable);


    /**
     * 设置用户的属于角色
     *
     * @param userRolesDto 包含用户主键、角色主键DTO
     */
    void userRoles(UserRolesDto userRolesDto);

    /**
     * 设置角色管理的模块信息
     *
     * @param roleModelsDto 包含模块主键、角色主键DTO
     */
    void roleModels(RoleModelsDto roleModelsDto);


    /**
     * 通过userid查询用户角色绑定关系
     *
     * @param userid 用户主键
     * @return 用户角色绑定关系
     */
    List<ViewUserRole> findByUserid(Integer userid);

    /**
     * 通过roleid查询角色模块绑定关系
     *
     * @param roleid 角色主键
     * @return 角色模块绑定关系
     */
    List<ViewRoleModel> findByRoleid(Integer roleid);

    /**
     * 查询用户管理模块信息
     *
     * @param user 用户对象
     * @return 用户模块绑定关系
     */
    List<ViewUserModel> findModelList(User user);

    /**
     * 模块与DashBoard绑定关系
     *
     * @param dashboardDto 模块主键、仪表板主键DTO
     */
    void modelDashboards(ModelDashboardDto dashboardDto);


}
