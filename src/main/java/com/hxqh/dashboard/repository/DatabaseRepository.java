package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Database;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Lin
 */
@Repository
public interface DatabaseRepository extends JpaRepository<Database, Integer> {


    /**
     * 查询可用链接
     *
     * @param i
     * @return
     */
    @Query("select d from Database d where d.valid=?1")
    List<Database> findAvaliableLins(int i);
}
