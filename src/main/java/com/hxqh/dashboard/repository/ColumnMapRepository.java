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

    /**
     * 查询视图对应列信息，过滤字符串
     *
     * @param vid
     * @return
     */
    @Query("select c from ColumnMap c where c.visualize.vid=?1 and c.type not like 'varchar%\' ")
    List<ColumnMap> findByVidAndType(Integer vid);


    /**
     * 查询是否存在相同字段
     *
     * @param field
     * @param vid
     * @return
     */
    @Query("select c from ColumnMap c where c.field=?1 and  c.visualize.vid=?2 ")
    ColumnMap findByFieldAndVid(String field, Integer vid);

    /**
     * 获取视图下已选定字段
     *
     * @return
     */
    @Query("select c from ColumnMap c where c.visualize.vid=?1 ")
    List<ColumnMap> findByVid(Integer vid);
}
