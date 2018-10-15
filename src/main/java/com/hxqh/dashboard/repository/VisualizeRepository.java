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

    Visualize findByVid(Integer vid);
}
