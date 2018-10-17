package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.DashboardVisualize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */
@Repository
public interface DashboardVisualizeRepository extends JpaRepository<DashboardVisualize, Integer> {

    List<DashboardVisualize> findByBid(Integer integerId);
}
