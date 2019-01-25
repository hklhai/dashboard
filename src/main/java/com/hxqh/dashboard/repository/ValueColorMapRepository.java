package com.hxqh.dashboard.repository;

import com.hxqh.dashboard.model.ValueColorMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValueColorMapRepository extends JpaRepository<ValueColorMap, Integer> {

    /**
     * @param vid
     * @return
     */
    @Query("select u from ValueColorMap u where u.visualize.vid =?1")
    List<ValueColorMap> findByVid(Integer vid);
}
