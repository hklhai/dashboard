package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Visualize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/12.
 *
 * @author Ocean lin
 */
@Repository
public interface VisualizeRepository extends JpaRepository<Visualize, Integer> {

    /**
     * 根据名称查询是否存在Visualize
     * @param visualizename
     * @return Visualize对象
     */
    Visualize findByVisualizename(String visualizename);

}
