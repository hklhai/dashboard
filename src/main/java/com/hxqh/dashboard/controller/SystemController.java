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
    @Autowired
    private ShowService showService;

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


    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public Message userUpdate(User userDb, @RequestBody User user) {
        Message message = null;
        try {
            if (systemService.isUserByName(user.getName())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                BeanUtils.copyProperties(user, userDb, ObjectUtil.getNullPropertyNames(user));
                systemService.updateUser(userDb);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITSUCCESS);
            e.printStackTrace();
        }
        return message;

    }

    @ResponseBody
    @RequestMapping(value = "/userData", method = RequestMethod.POST)
    public User userData(@RequestBody IntegerValue integerValue) {
        return systemService.findUserById(integerValue.getIntegerId());
    }


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

    @ResponseBody
    @RequestMapping(value = "/userRoleList", method = RequestMethod.POST)
    public List<ViewUserRole> userRoleList(@RequestBody IntegerValue integerValue) {
        return systemService.findByUserid(integerValue.getIntegerId());
    }


    /****************************User administration**********************/


    /****************************Role administration**********************/
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


    @ResponseBody
    @RequestMapping(value = "/role", method = RequestMethod.PUT)
    public Message roleUpdate(Role roleDb, @RequestBody Role role) {
        Message message = null;
        try {
            if (systemService.isRoleByName(role.getRolename())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                BeanUtils.copyProperties(role, roleDb, ObjectUtil.getNullPropertyNames(role));
                systemService.updateRole(roleDb);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITSUCCESS);
            e.printStackTrace();
        }
        return message;

    }

    @ResponseBody
    @RequestMapping(value = "/roleData", method = RequestMethod.POST)
    public Role roleData(@RequestBody IntegerValue integerValue) {
        return systemService.findRoleById(integerValue.getIntegerId());
    }


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
     * @param roleModelsDto
     * @return
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

    @ResponseBody
    @RequestMapping(value = "/model", method = RequestMethod.PUT)
    public Message modelUpdate(Model modelDb, @RequestBody Model model) {
        Message message = null;
        try {
            if (systemService.isModelByName(model.getModelname())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                BeanUtils.copyProperties(model, modelDb, ObjectUtil.getNullPropertyNames(model));
                systemService.updateModel(modelDb);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITSUCCESS);
            e.printStackTrace();
        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "/modelData", method = RequestMethod.POST)
    public Model modelData(@RequestBody IntegerValue integerValue) {
        return systemService.findModelById(integerValue.getIntegerId());
    }


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

    @ResponseBody
    @RequestMapping(value = "/roleModelList", method = RequestMethod.POST)
    public List<ViewRoleModel> roleModelList(@RequestBody IntegerValue integerValue) {
        // todo 是否需要分页
        return systemService.findByRoleid(integerValue.getIntegerId());
    }


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
