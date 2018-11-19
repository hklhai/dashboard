package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.*;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.model.view.ViewRoleModel;
import com.hxqh.dashboard.model.view.ViewUserModel;
import com.hxqh.dashboard.model.view.ViewUserRole;
import com.hxqh.dashboard.repository.*;
import com.hxqh.dashboard.util.GroupListUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
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

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isUserByNameAndID(User dbUser) {
        User user = userRepository.findUserByNameAndUseridNot(dbUser.getName(), dbUser.getUserid());
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

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isRoleByNameAndRoleid(Role roleDb) {
        Role role = roleRepository.findRoleByNameAndRoleidNot(roleDb.getRolename(), roleDb.getRoleid());
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

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public boolean isModelByNameAndModelid(Model modelDb) {
        Model model = modelRepository.findByModelnameAndModelidNot(modelDb.getModelname(), modelDb.getModelid());
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
        Specification<User> specification = (root, query, cb) -> {
            List<Predicate> list = new ArrayList<>(5);

            if (StringUtils.isNotBlank(user.getName())) {
                list.add(cb.equal(root.get("name").as(String.class), user.getName()));
            }
            if (StringUtils.isNotBlank(user.getUsername())) {
                list.add(cb.like(root.get("username").as(String.class), "%" + user.getUsername() + "%"));
            }

            Predicate[] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        };

        Page<User> users = userRepository.findAll(specification, pageable);
        List<User> userList = users.getContent();
        Integer totalPages = users.getTotalPages();
        UserDto userDto = new UserDto(pageable, totalPages, users.getTotalElements(), userList);
        return userDto;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public RoleDto roleList(Role role, Pageable pageable) {

        List<ViewUserRole> hashRoleList = viewUserRoleRepository.findByUserid(role.getUserid());

        Specification<Role> specification = (root, query, cb) -> {
            List<Predicate> list = new ArrayList<>(5);
            if (StringUtils.isNotBlank(role.getRolename())) {
                list.add(cb.like(root.get("rolename").as(String.class), "%" + role.getRolename() + "%"));
            }
            if (StringUtils.isNotBlank(role.getRoledesc())) {
                list.add(cb.like(root.get("roledesc").as(String.class), "%" + role.getRoledesc() + "%"));
            }
            Predicate[] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        };

        Page<Role> roles = roleRepository.findAll(specification, pageable);
        List<Role> roleList = roles.getContent();
        Integer totalPages = roles.getTotalPages();
        RoleDto roleDto = new RoleDto(pageable, totalPages, roles.getTotalElements(), roleList, hashRoleList);
        return roleDto;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public ModelDto modelList(Model model, Pageable pageable) {

        List<ViewRoleModel> hasModelList = viewRoleModelRepository.findByRoleid(model.getRoleid());

        Specification<Model> specification = (root, query, cb) -> {
            List<Predicate> list = new ArrayList<>(5);

            if (StringUtils.isNotBlank(model.getModelname())) {
                list.add(cb.like(root.get("modelname").as(String.class), "%" + model.getModelname() + "%"));
            }
            if (StringUtils.isNotBlank(model.getModeldesc())) {
                list.add(cb.like(root.get("modeldesc").as(String.class), "%" + model.getModeldesc() + "%"));
            }
            Predicate[] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        };

        Page<Model> models = modelRepository.findAll(specification, pageable);
        List<Model> modelList = models.getContent();
        Integer totalPages = models.getTotalPages();
        ModelDto modelDto = new ModelDto(pageable, totalPages, models.getTotalElements(), modelList, hasModelList);
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
            deleteList.stream().map(ele -> {
                userRoleRepository.delete(ele);
                return null;
            });
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
            deleteList.stream().map(e -> {
                roleModelRepository.delete(e);
                return null;
            });
        }
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ViewUserRole> findByUserid(Integer userId) {
        List<ViewUserRole> viewUserRoleList = viewUserRoleRepository.findByUserid(userId);
        return viewUserRoleList;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ViewRoleModel> findByRoleid(Integer roleId) {
        return viewRoleModelRepository.findByRoleid(roleId);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public List<ViewUserModel> findModelList(User user) {
        List<ViewUserModel> userModelList = viewUserModelRepository.findByUserid(user.getUserid());
        Map<Integer, List<ViewUserModel>> listMap = GroupListUtil.group(userModelList, (obj) -> {
            ViewUserModel d = (ViewUserModel) obj;
            return d.getParentid();
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
