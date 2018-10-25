package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.view.ViewUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/24.
 *
 * @author Ocean lin
 */
@Repository
public interface ViewUserRoleRepository extends JpaRepository<ViewUserRole, Integer> {

    List<ViewUserRole> findByUserid(Integer integerId);
}
