package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.Database;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lin
 */
@Repository
public interface DatabaseRepository extends JpaRepository<Database, Integer> {
}
