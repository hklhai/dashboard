package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/12.
 *
 * @author Ocean lin
 */
@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Integer> {

    /**
     * 根据名称查询是否存在Dashboard
     *
     * @param dashboardname
     * @return Dashboard对象
     */
    Dashboard findByDashboardname(String dashboardname);
}