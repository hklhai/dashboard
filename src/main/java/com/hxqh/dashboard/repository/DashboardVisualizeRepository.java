package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.DashboardVisualize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */
@Repository
public interface DashboardVisualizeRepository extends JpaRepository<DashboardVisualize, Integer> {
}
