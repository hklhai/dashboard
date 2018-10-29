package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Repository
public interface ModelRepository extends JpaRepository<Model, Integer>, JpaSpecificationExecutor<Model> {

    /**
     * 根据模型名称查询
     *
     * @param modelname 模型显示名称
     * @return model对象
     */
    Model findByModelname(String modelname);


    /**
     * 根据模型名称和主键查询
     *
     * @param modelname 模型名称
     * @param modelid   主键
     * @return model对象
     */
    @Query("select u from Model u where u.modelname=:modelname and u.modelid<>:modelid")
    Model findByModelnameAndModelidNot(String modelname, Integer modelid);
}
