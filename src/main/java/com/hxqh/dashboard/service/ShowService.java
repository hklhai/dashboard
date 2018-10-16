package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.LineDouble;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.ShowDto;

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
     * @return LineDouble List
     */
    ShowDto findLineByVid(Integer integerId);

    /**
     * @param visualize
     * @return
     */
    void addVisualize(Visualize visualize);
}
