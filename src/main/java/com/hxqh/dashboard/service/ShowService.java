package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.Line;
import com.hxqh.dashboard.model.Visualize;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
public interface ShowService {
    /**
     * 查询Visualize
     *
     * @param vid Visualize主键
     * @return Visualize实体
     */
    Visualize findByVid(Integer vid);

    /**
     * 查询展示数据
     *
     * @param integerId
     * @return Line List
     */
    List<Line> findLineByVid(Integer integerId);

    /**
     * @param visualize
     * @return
     */
    void addVisualize(Visualize visualize);
}
