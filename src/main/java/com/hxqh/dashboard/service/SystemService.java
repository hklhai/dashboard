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
     * @param name
     * @return 存在返回true
     */
    boolean isUserByName(String name);

    /**
     * 添加User
     *
     * @param user
     */
    void addUser(User user);


    /**
     * 是否存在Role
     *
     * @param rolename
     * @return 存在返回true
     */
    boolean isRoleByName(String rolename);

    /**
     * 添加Role
     *
     * @param role
     */
    void roleAdd(Role role);


    /**
     * 是否存在Model
     *
     * @param modelname
     * @return 存在返回true
     */
    boolean isModelByName(String modelname);

    /**
     * 添加Model
     *
     * @param model
     */
    void modelAdd(Model model);


    /**
     * 通过主键查找User
     *
     * @param userId
     * @return User对象
     */
    User findUserById(Integer userId);

    /**
     * 通过主键查找Role
     *
     * @param roleId
     * @return Role对象
     */
    Role findRoleById(Integer roleId);

    /**
     * 通过主键查找Model
     *
     * @param modelId
     * @return Model对象
     */
    Model findModelById(Integer modelId);

    /**
     * 删除用户
     *
     * @param userId
     */
    void userDelete(Integer userId);

    /**
     * 删除角色
     *
     * @param roleId
     */
    void roleDelete(Integer roleId);


    /**
     * 删除Model
     *
     * @param modelId
     */
    void modelDelete(Integer modelId);


    /**
     * 更新用户
     *
     * @param userDb
     */
    void updateUser(User userDb);


    /**
     * 更新角色
     *
     * @param roleDb
     */
    void updateRole(Role roleDb);


    /**
     * 更新model
     *
     * @param modelDb
     */
    void updateModel(Model modelDb);


    /**
     * 用户列表
     *
     * @param user
     * @param pageable
     * @return
     */
    UserDto userList(User user, Pageable pageable);


    /**
     * 角色列表
     *
     * @param role
     * @param pageable
     * @return
     */
    RoleDto roleList(Role role, Pageable pageable);


    /**
     * model列表
     *
     * @param model
     * @param pageable
     * @return
     */
    ModelDto modelList(Model model, Pageable pageable);


    /**
     * 设置用户的属于角色
     *
     * @param userRolesDto
     */
    void userRoles(UserRolesDto userRolesDto);

    /**
     * 设置角色管理的模块信息
     *
     * @param roleModelsDto
     */
    void roleModels(RoleModelsDto roleModelsDto);

    List<ViewUserRole> findByUserid(Integer integerId);

    List<ViewRoleModel> findByRoleid(Integer integerId);

    List<ViewUserModel> findModelList(User user);

    void modelDashboards(ModelDashboardDto dashboardDto);
 }
