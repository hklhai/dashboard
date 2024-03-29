package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/12.
 *
 * @author Ocean lin
 */
@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Integer>, JpaSpecificationExecutor<Dashboard> {

    /**
     * 根据名称查询是否存在Dashboard
     *
     * @param dashboardname
     * @return Dashboard对象
     */
    Dashboard findByDashboardname(String dashboardname);


    /**
     * 根据id和名称查询是否存在
     *
     * @param dashboardname
     * @param bid
     * @return
     */
    @Query("select u from Dashboard u where u.dashboardname=?1 and u.bid<>?2")
    Dashboard findByDashboardnameAndBidNot(String dashboardname, Integer bid);
}
