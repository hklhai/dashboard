package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.Line;
import com.hxqh.dashboard.model.TableManager;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.repository.TableManagerRepository;
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
    @Resource
    protected TableManagerRepository tableManagerRepository;

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
        TableManager tableManager = tableManagerRepository.findByTablecategory(visualize.getType());
        String tableName = tableManager.getTableprefix() + tableManager.getTablemaxid();
        String sql = "create table  \t" + tableName + "\t(`sid` int(20) NOT NULL AUTO_INCREMENT,  `key` varchar(20) DEFAULT NULL,  `value` double(10,2) DEFAULT NULL, PRIMARY KEY (`sid`))";
        sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
        visualize.setTablename(tableName);
        tableManager.setTablemaxid(tableManager.getTablemaxid()+1);
        visualizeRepository.save(visualize);
    }
}
