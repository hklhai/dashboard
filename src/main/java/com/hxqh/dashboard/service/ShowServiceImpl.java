package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.*;
import com.hxqh.dashboard.model.assist.ShowDto;
import com.hxqh.dashboard.repository.TableManagerRepository;
import com.hxqh.dashboard.repository.VisualizeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    private static Map<String, String> yTypeMap = new HashMap<String, String>() {{
        put("double", "double(10,2)");
        put("float", "float(7,2)");
        put("int", "int");
    }};

    private static Map<String, String> typeMap = new HashMap<String, String>() {{
        put("饼图", "pie");
        put("条形图", "bar");
        put("折线图", "line");
    }};

    private static final String CREATE_SQL_1 = "create table ";
    private static final String SELECT_SQL = "select * from ";
    private static final String CREATE_SQL_2 = "(`sid` int(20) NOT NULL AUTO_INCREMENT,  `showkey` varchar(20) DEFAULT NULL,  `showvalue` ";
    private static final String CREATE_SQL_3 = " DEFAULT NULL, PRIMARY KEY (`sid`))";
    private static final String DOUBLE_TYPE = "double";
    private static final String FLOAT_TYPE = "float";


    @Override
    public Visualize findByVid(Integer vid) {
        return visualizeRepository.findByVid(vid);
    }

    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public ShowDto findLineByVid(Integer integerId) {
        Visualize visualize = visualizeRepository.findByVid(integerId);
        String sql = SELECT_SQL + visualize.getTablename();
        String keyShow, valueShow;
        Session currentSession = sessionFactory.getCurrentSession();

        if (DOUBLE_TYPE.equals(visualize.getYtype())) {
            List<LineDouble> list = currentSession.createSQLQuery(sql).addEntity(LineDouble.class).list();
            keyShow = list.stream().map(LineDouble::getShowkey).collect(Collectors.toList()).toString();
            valueShow = list.stream().map(LineDouble::getShowvalue).collect(Collectors.toList()).toString();
        } else if (FLOAT_TYPE.equals(visualize.getYtype())) {
            List<LineFloat> list = currentSession.createSQLQuery(sql).addEntity(LineFloat.class).list();
            keyShow = list.stream().map(LineFloat::getShowkey).collect(Collectors.toList()).toString();
            valueShow = list.stream().map(LineFloat::getShowvalue).collect(Collectors.toList()).toString();
        } else {
            List<LineInteger> list = currentSession.createSQLQuery(sql).addEntity(LineInteger.class).list();
            keyShow = list.stream().map(LineInteger::getShowkey).collect(Collectors.toList()).toString();
            valueShow = list.stream().map(LineInteger::getShowvalue).collect(Collectors.toList()).toString();
        }
        ShowDto showDto = new ShowDto(visualize.getVisualizename(),
                visualize.getXname(), visualize.getYname(), keyShow, valueShow);

        return showDto;

    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addVisualize(Visualize visualize) {
        TableManager tableManager = tableManagerRepository.findByTablecategory(visualize.getType());
        String tableName = tableManager.getTableprefix() + tableManager.getTablemaxid();
        String yTpe = visualize.getYtype();
        String sql = CREATE_SQL_1 + tableName + CREATE_SQL_2 + yTypeMap.get(yTpe) + CREATE_SQL_3;
        sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
        visualize.setTablename(tableName);
        tableManager.setTablemaxid(tableManager.getTablemaxid() + 1);
        visualizeRepository.save(visualize);
    }
}
