package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.ColumnMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2018/11/14.
 *
 * @author Ocean lin
 */
@Repository
public interface ColumnMapRepository extends JpaRepository<ColumnMap, Integer> {

    @Query("select c from ColumnMap c where c.visualize.vid=?1 and c.type not like 'varchar%\' ")
    List<ColumnMap> findByVid(Integer vid);



}
