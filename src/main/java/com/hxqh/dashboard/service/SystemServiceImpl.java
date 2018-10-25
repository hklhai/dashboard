package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.*;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.model.view.ViewRoleModel;
import com.hxqh.dashboard.model.view.ViewUserModel;
import com.hxqh.dashboard.model.view.ViewUserRole;
import com.hxqh.dashboard.repository.*;
import com.hxqh.dashboard.util.GroupListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by Ocean lin on 2018/4/8.
 *
 * @author Ocean lin
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ModelRepository modelRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private RoleModelRepository roleModelRepository;

    @Autowired
    private ViewUserRoleRepository viewUserRoleRepository;
    @Autowired
    private ViewRoleModelRepository viewRoleModelRepository;
    @Autowired
    private ViewUserModelRepository viewUserModelRepository;

    @Autowired
    private ModelDashboardRepository modelDashboardRepository;
    @Autowired
    private DashboardRepository dashboardRepository;


    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public User findUserById(String name) {
        return userRepository.findUserByName(name);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isUserByName(String name) {
        User user = userRepository.findUserByName(name);
        return null != user ? true : false;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isRoleByName(String rolename) {
        Role role = roleRepository.findByRolename(rolename);
        return null != role ? true : false;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void roleAdd(Role role) {
        roleRepository.save(role);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isModelByName(String modelname) {
        Model model = modelRepository.findByModelname(modelname);
        return null != model ? true : false;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void modelAdd(Model model) {
        model.setParentid(0);
        modelRepository.save(model);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public User findUserById(Integer userId) {
        User user = userRepository.findOne(userId);
        return user;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Role findRoleById(Integer roleId) {
        Role role = roleRepository.findOne(roleId);
        return role;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Model findModelById(Integer modelId) {
        return modelRepository.findOne(modelId);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void userDelete(Integer userId) {
        userRepository.delete(userId);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void roleDelete(Integer roleId) {
        roleRepository.delete(roleId);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void modelDelete(Integer modelId) {
        modelRepository.delete(modelId);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateUser(User userDb) {
        userRepository.save(userDb);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateRole(Role roleDb) {
        roleRepository.save(roleDb);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateModel(Model modelDb) {
        modelRepository.save(modelDb);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public UserDto userList(User user, Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable);
        List<User> userList = users.getContent();
        Integer totalPages = users.getTotalPages();
        UserDto userDto = new UserDto(pageable, totalPages, userList);
        return userDto;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public RoleDto roleList(Role role, Pageable pageable) {
        Page<Role> roles = roleRepository.findAll(pageable);
        List<Role> roleList = roles.getContent();
        Integer totalPages = roles.getTotalPages();
        RoleDto roleDto = new RoleDto(pageable, totalPages, roleList);
        return roleDto;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public ModelDto modelList(Model model, Pageable pageable) {
        Page<Model> models = modelRepository.findAll(pageable);
        List<Model> modelList = models.getContent();
        Integer totalPages = models.getTotalPages();
        ModelDto modelDto = new ModelDto(pageable, totalPages, modelList);
        return modelDto;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void userRoles(UserRolesDto userRolesDto) {
        User user = userRepository.findOne(userRolesDto.getUserid());
        List<UserRoleRoleDto> userRoleList = userRolesDto.getRoleList();

        for (UserRoleRoleDto roleDto : userRoleList) {
            // insert
            if (null == roleDto.getUserroleid() || "".equals(roleDto.getUserroleid())) {
                Role role = roleRepository.findOne(roleDto.getRoleid());
                userRoleRepository.save(new UserRole(role, user));
            } else {
                // update
                Role role = roleRepository.findOne(roleDto.getRoleid());
                UserRole userRole = userRoleRepository.findOne(roleDto.getUserroleid());
                userRole.setRole(role);
                userRoleRepository.save(userRole);
            }
        }
        // delete
        List<Integer> deleteList = userRolesDto.getDeleteList();
        if (null != deleteList && deleteList.size() > 0) {
            for (int j = 0; j < deleteList.size(); j++) {
                userRoleRepository.delete(deleteList.get(j));
            }
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void roleModels(RoleModelsDto roleModelsDto) {
        Role role = roleRepository.findOne(roleModelsDto.getRoleid());
        List<RoleModelModelDto> roleModelModelDtos = roleModelsDto.getModelDtoList();

        for (RoleModelModelDto roleModelModelDto : roleModelModelDtos) {
            // insert
            if (null == roleModelModelDto.getRolemodelid() || "".equals(roleModelModelDto.getRolemodelid())) {
                Model model = modelRepository.findOne(roleModelModelDto.getModelid());
                roleModelRepository.save(new RoleModel(model, role));
            } else {
                // update
                RoleModel roleModel = roleModelRepository.findOne(roleModelModelDto.getRolemodelid());
                Model model = modelRepository.findOne(roleModelModelDto.getModelid());
                roleModel.setModel(model);
                roleModelRepository.save(roleModel);
            }
        }
        // delete
        List<Integer> deleteList = roleModelsDto.getDeleteList();
        if (null != deleteList && deleteList.size() > 0) {
            for (int j = 0; j < deleteList.size(); j++) {
                roleModelRepository.delete(deleteList.get(j));
            }
        }

    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ViewUserRole> findByUserid(Integer integerId) {
        List<ViewUserRole> vUserRoleList = viewUserRoleRepository.findByUserid(integerId);
        return vUserRoleList;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ViewRoleModel> findByRoleid(Integer roleid) {
        return viewRoleModelRepository.findByRoleid(roleid);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ViewUserModel> findModelList(User user) {
        List<ViewUserModel> userModelList = viewUserModelRepository.findByUserid(user.getUserid());
        Map<Integer, List<ViewUserModel>> listMap = GroupListUtil.group(userModelList, new GroupListUtil.GroupBy<Integer>() {
            @Override
            public Integer groupby(Object obj) {
                ViewUserModel d = (ViewUserModel) obj;
                return d.getParentid();
            }
        });

        List<ViewUserModel> topTreeModelList = listMap.get(0);
        for (ViewUserModel userModel : topTreeModelList) {
            userModel.setViewUserModelList(listMap.get(userModel.getModelid()));
        }
        return topTreeModelList;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void modelDashboards(ModelDashboardDto dashboardDto) {
        Model model = modelRepository.findOne(dashboardDto.getModelid());
        model.setBid(dashboardDto.getBid());
        modelRepository.save(model);
    }


}
