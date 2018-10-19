package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {

    /**
     * 根据模型名称查询
     * @param modelname 模型显示名称
     * @return model
     */
    Model findByModelname(String modelname);
}
