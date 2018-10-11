package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.name=:name")
    User findUserById(@Param("name") String name);
}
