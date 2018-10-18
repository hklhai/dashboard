package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Visualize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/12.
 *
 * @author Ocean lin
 */
@Repository
public interface VisualizeRepository extends JpaRepository<Visualize, Integer> {

    /**
     * 根据名称查询是否存在Visualize
     *
     * @param visualizename
     * @return Visualize对象
     */
    Visualize findByVisualizename(String visualizename);


    /**
     * 获取不同的Businesscategory
     *
     * @return List<String>
     */
    @Query("select distinct(u.businesscategory) from Visualize u")
    List<String> findDistinctBusinesscategory();
}
