package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.ModelDashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/24.
 *
 * @author Ocean lin
 */
@Repository
public interface ModelDashboardRepository extends JpaRepository<ModelDashboard, Integer> {
}
