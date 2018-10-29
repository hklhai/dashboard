package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>, JpaSpecificationExecutor<Role> {

    /**
     * 根据角色名称查询
     *
     * @param rolename
     * @return Role对象
     */
    Role findByRolename(String rolename);


    /**
     * 根据角色名称和主键查询
     *
     * @param rolename
     * @param roleid
     * @return Role对象
     */
    @Query("select u from Role u where u.rolename=?1 and u.roleid<>?2")
    Role findRoleByNameAndRoleidNot(String rolename, Integer roleid);
}
