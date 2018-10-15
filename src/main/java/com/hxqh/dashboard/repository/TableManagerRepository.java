package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.TableManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Repository
public interface TableManagerRepository extends JpaRepository<TableManager, Integer> {
    TableManager findByTablecategory(String type);
}
