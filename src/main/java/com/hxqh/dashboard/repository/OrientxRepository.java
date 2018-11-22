package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.OrientX;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/11/21.
 *
 * @author Ocean lin
 */
@Repository
public interface OrientxRepository extends JpaRepository<OrientX, Integer> {
}
