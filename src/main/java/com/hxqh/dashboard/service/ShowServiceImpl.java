package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.Line;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.repository.VisualizeRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Service("showService")
public class ShowServiceImpl implements ShowService {

    @Autowired
    private VisualizeRepository visualizeRepository;
    @Resource
    protected SessionFactory sessionFactory;

    @Override
    public Visualize findByVid(Integer vid) {
        return visualizeRepository.findByVid(vid);
    }

    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public List<Line> findLineByVid(Integer integerId) {
        Visualize visualize = visualizeRepository.findByVid(integerId);
        String sql = "select * from " + visualize.getTablename();
        List<Line> list = sessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(Line.class).list();
        return list;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addVisualize(Visualize visualize) {
        visualizeRepository.save(visualize);
    }
}
