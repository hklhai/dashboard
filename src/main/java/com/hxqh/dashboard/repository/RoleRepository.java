package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    /**
     * 根据角色名称查询
     * @param rolename
     * @return Role对象
     */
    Role findByRolename(String rolename);
}
