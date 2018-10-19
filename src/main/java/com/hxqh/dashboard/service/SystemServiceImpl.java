package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.Model;
import com.hxqh.dashboard.model.Role;
import com.hxqh.dashboard.model.User;
import com.hxqh.dashboard.model.assist.ModelDto;
import com.hxqh.dashboard.model.assist.RoleDto;
import com.hxqh.dashboard.model.assist.UserDto;
import com.hxqh.dashboard.repository.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Ocean lin on 2018/4/8.
 *
 * @author Ocean lin
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Resource
    protected SessionFactory sessionFactory;

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
        modelRepository.save(model);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public User findUserById(Integer userId) {
        return userRepository.findOne(userId);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public Role findRoleById(Integer roleId) {
        return roleRepository.findOne(roleId);
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


}
