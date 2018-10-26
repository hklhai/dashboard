package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.view.ViewRoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/24.
 *
 * @author Ocean lin
 */
@Repository
public interface ViewRoleModelRepository extends JpaRepository<ViewRoleModel, Integer>, JpaSpecificationExecutor<ViewRoleModel> {

    /**
     * 根据roleid查询
     *
     * @param roleId
     * @return
     */
    List<ViewRoleModel> findByRoleid(Integer roleId);
}
