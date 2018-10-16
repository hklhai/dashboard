package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.LineDouble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Repository
public interface LineDoubleRepository extends JpaRepository<LineDouble, Integer> {
}
