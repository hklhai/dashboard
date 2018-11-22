package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.common.Account;
import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.common.ObjectUtil;
import com.hxqh.dashboard.model.Model;
import com.hxqh.dashboard.model.Role;
import com.hxqh.dashboard.model.User;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.model.base.Message;
import com.hxqh.dashboard.model.base.SessionInfo;
import com.hxqh.dashboard.model.view.ViewRoleModel;
import com.hxqh.dashboard.model.view.ViewUserModel;
import com.hxqh.dashboard.model.view.ViewUserRole;
import com.hxqh.dashboard.service.ShowService;
import com.hxqh.dashboard.service.SystemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    @ModelAttribute
    public void getUser(@RequestParam(value = "userid", required = false) Integer userid,
                        @RequestParam(value = "roleid", required = false) Integer roleid,
                        @RequestParam(value = "modelid", required = false) Integer modelid,
                        Map<String, Object> map) {
        if (null != userid) {
            // 从数据库中获取对象
            User user = systemService.findUserById(userid);
            map.put("user", user);
        }
        if (null != roleid) {
            Role role = systemService.findRoleById(roleid);
            map.put("role", role);
        }
        if (null != modelid) {
            Model model = systemService.findModelById(modelid);
            map.put("model", model);
        }
    }

    /**
     * 登录Function
     *
     * @param loginDto 登录dto
     * @param map      前台返回信息
     * @return Message
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Message login(@RequestBody LoginDto loginDto, Map<String, Object> map) {
        User user = systemService.findUserById(loginDto.getName());
        Message message = webLogin(user, loginDto, map, systemService);
        return message;
    }

    /**
     * 登录接口
     *
     * @param user          数据库用户信息
     * @param loginDto      用户传入凭证信息
     * @param map
     * @param systemService
     * @return 登录是否成功
     */
    private Message webLogin(User user, LoginDto loginDto, Map<String, Object> map, SystemService systemService) {
        Message message = new Message(0, "");
        Message success = new Message(1, "LoginSuccess");
        if (null != user) {
            String password = null;
            try {
                password = Account.encrypt(loginDto.getPassword());
                if (user.getPassword().toUpperCase().equals(password)) {
                    //加入Session中
                    SessionInfo sessionInfo = new SessionInfo();
                    sessionInfo.setName(user.getName());
                    map.put("sessionInfo", sessionInfo);

                    // 模块信息
                    List<ViewUserModel> modelList = systemService.findModelList(user);
                    success.setModelList(modelList);
                    return success;
                } else {
                    message.setMessage(Constants.USERNAME_PASSWORD_INCORRECT);
                    return message;
                }
            } catch (Exception e) {
                message.setMessage("System exception, please contact the administrator！");
                e.printStackTrace();
                return message;
            }
        } else {
            //用户名不存在
            message.setMessage(Constants.USERNAME_PASSWORD_INCORRECT);
            return message;
        }
    }

    /****************************User administration**********************/

    /**
     * 用户添加
     *
     * @param user 用户信息
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/userAdd", method = RequestMethod.POST)
    public Message userAdd(@RequestBody User user) {
        Message message;
        try {
            if (systemService.isUserByName(user.getName())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                String password = Account.encrypt(user.getPassword());
                user.setPassword(password);
                systemService.addUser(user);
                message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


    /**
     * 用户删除
     *
     * @param integerValue 用户主键id
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public Message userDelete(@PathVariable("id") Integer integerValue) {
        Message message = null;
        try {
            systemService.userDelete(integerValue);
            message = new Message(Constants.SUCCESS, Constants.DELETESUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.DELETEFAIL);
            e.printStackTrace();
        }
        return message;

    }


    /**
     * 用户修改
     *
     * @param userDb 用户数据库信息
     * @param user   用户前台传入信息
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public Message userUpdate(User userDb, @RequestBody User user) {
        Message message = null;
        try {
            BeanUtils.copyProperties(user, userDb, ObjectUtil.getNullPropertyNames(user));
            if (systemService.isUserByNameAndID(userDb)) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                systemService.updateUser(userDb);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITFAIL);
            e.printStackTrace();
        }
        return message;

    }

    /**
     * 用户信息获取接口
     *
     * @param integerValue 用户主键id
     * @return 用户实体类
     */
    @ResponseBody
    @RequestMapping(value = "/userData", method = RequestMethod.POST)
    public User userData(@RequestBody IntegerValue integerValue) {
        return systemService.findUserById(integerValue.getIntegerId());
    }


    /**
     * 用户列表分页接口
     *
     * @param user 用户查询可能传入查询条件
     * @param page 页码
     * @param size 页容量
     * @return 用户列表
     */
    @ResponseBody
    @RequestMapping(value = "/userList", method = RequestMethod.POST)
    public UserDto userList(@RequestBody User user,
                            @RequestParam(value = "page", defaultValue = "0") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size) {
        UserDto userDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "userid");
        try {
            Pageable pageable = new PageRequest(page, size, sort);
            userDto = systemService.userList(user, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userDto;
    }

    /**
     * 用户绑定角色接口
     *
     * @param userRolesDto 包含用户主键、角色主键DTO
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/userRoles", method = RequestMethod.POST)
    public Message userRoles(@RequestBody UserRolesDto userRolesDto) {
        Message message;
        try {
            systemService.userRoles(userRolesDto);
            message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }

    /**
     * 用户具有角色列表
     *
     * @param integerValue 用户ID
     * @return 用户角色列表
     */
    @ResponseBody
    @RequestMapping(value = "/userRoleList", method = RequestMethod.POST)
    public List<ViewUserRole> userRoleList(@RequestBody IntegerValue integerValue) {
        return systemService.findByUserid(integerValue.getIntegerId());
    }


    /****************************User administration**********************/


    /****************************Role administration**********************/
    /**
     * 角色添加
     *
     * @param role 角色实体类
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/roleAdd", method = RequestMethod.POST)
    public Message roleAdd(@RequestBody Role role) {
        Message message;
        try {
            if (systemService.isRoleByName(role.getRolename())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                systemService.roleAdd(role);
                message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }

    /**
     * 角色删除
     *
     * @param integerValue 角色ID主键
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/role/{id}", method = RequestMethod.DELETE)
    public Message roleDelete(@PathVariable("id") Integer integerValue) {
        Message message = null;
        try {
            systemService.roleDelete(integerValue);
            message = new Message(Constants.SUCCESS, Constants.DELETESUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.DELETEFAIL);
            e.printStackTrace();
        }
        return message;
    }


    /**
     * 角色更新
     *
     * @param roleDb 数据库角色实体
     * @param role   前台角色实体
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/role", method = RequestMethod.PUT)
    public Message roleUpdate(Role roleDb, @RequestBody Role role) {
        Message message = null;
        try {
            BeanUtils.copyProperties(role, roleDb, ObjectUtil.getNullPropertyNames(role));

            if (systemService.isRoleByNameAndRoleid(roleDb)) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                systemService.updateRole(roleDb);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITFAIL);
            e.printStackTrace();
        }
        return message;

    }

    /**
     * 角色信息获取
     *
     * @param integerValue 角色主键ID
     * @return 角色对象
     */
    @ResponseBody
    @RequestMapping(value = "/roleData", method = RequestMethod.POST)
    public Role roleData(@RequestBody IntegerValue integerValue) {
        return systemService.findRoleById(integerValue.getIntegerId());
    }


    /**
     * 角色分页
     *
     * @param role 前台带条件查询
     * @param page 页数
     * @param size 也容量
     * @return 角色列表
     */
    @ResponseBody
    @RequestMapping(value = "/roleList", method = RequestMethod.POST)
    public RoleDto roleList(@RequestBody Role role,
                            @RequestParam(value = "page", defaultValue = "0") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size) {
        RoleDto roleDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "roleid");
        try {
            Pageable pageable = new PageRequest(page, size, sort);
            roleDto = systemService.roleList(role, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roleDto;
    }

    /**
     * 角色绑定多个model   新增集成删除、修改
     *
     * @param roleModelsDto 角色主键、模块主键
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/roleModels", method = RequestMethod.POST)
    public Message roleModels(@RequestBody RoleModelsDto roleModelsDto) {
        Message message;
        try {
            systemService.roleModels(roleModelsDto);
            message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }
    /****************************Role administration**********************/

    /***************************Model administration**********************/
    /**
     * 模块添加
     *
     * @param model 前台模块实体
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/modelAdd", method = RequestMethod.POST)
    public Message modelAdd(@RequestBody Model model) {
        Message message;
        try {
            if (systemService.isModelByName(model.getModelname())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                systemService.modelAdd(model);
                message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


    /**
     * 模块删除
     *
     * @param integerValue 模块ID主键
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/model/{id}", method = RequestMethod.DELETE)
    public Message modelDelete(@PathVariable("id") Integer integerValue) {
        Message message = null;
        try {
            systemService.modelDelete(integerValue);
            message = new Message(Constants.SUCCESS, Constants.DELETESUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.DELETEFAIL);
            e.printStackTrace();
        }
        return message;
    }

    /**
     * 模块更新
     *
     * @param modelDb 数据库模块
     * @param model   前台模块信息
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/model", method = RequestMethod.PUT)
    public Message modelUpdate(Model modelDb, @RequestBody Model model) {
        Message message = null;
        try {
            BeanUtils.copyProperties(model, modelDb, ObjectUtil.getNullPropertyNames(model));

            if (systemService.isModelByNameAndModelid(modelDb)) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                systemService.updateModel(modelDb);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITFAIL);
            e.printStackTrace();
        }
        return message;
    }

    /**
     * 模块数据
     *
     * @param integerValue 模块ID主键
     * @return 模块信息
     */
    @ResponseBody
    @RequestMapping(value = "/modelData", method = RequestMethod.POST)
    public Model modelData(@RequestBody IntegerValue integerValue) {
        return systemService.findModelById(integerValue.getIntegerId());
    }


    /**
     * 模块分页接口
     *
     * @param model 前天传入带条件查询实体
     * @param page  页数
     * @param size  页容量
     * @return 模块列表
     */
    @ResponseBody
    @RequestMapping(value = "/modelList", method = RequestMethod.POST)
    public ModelDto modelList(@RequestBody Model model,
                              @RequestParam(value = "page", defaultValue = "0") int page,
                              @RequestParam(value = "size", defaultValue = "10") int size) {
        ModelDto modelDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "modelid");
        try {
            Pageable pageable = new PageRequest(page, size, sort);
            modelDto = systemService.modelList(model, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelDto;
    }

    /**
     * 角色模块列表
     *
     * @param integerValue 角色ID主键
     * @return 角色模块列表
     */
    @ResponseBody
    @RequestMapping(value = "/roleModelList", method = RequestMethod.POST)
    public List<ViewRoleModel> roleModelList(@RequestBody IntegerValue integerValue) {
        return systemService.findByRoleid(integerValue.getIntegerId());
    }


    /**
     * 模块仪表板绑定接口
     *
     * @param dashboardDto 模块ID、仪表板ID DTO
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/modelDashBoards", method = RequestMethod.POST)
    public Message modelDashBoards(@RequestBody ModelDashboardDto dashboardDto) {
        Message message;
        try {
            systemService.modelDashboards(dashboardDto);
            message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


    /***************************Model administration**********************/


}
