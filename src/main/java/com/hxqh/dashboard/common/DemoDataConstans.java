package com.hxqh.dashboard.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ocean lin on 2020/5/15.
 *
 * @author Ocean lin
 */
public interface DemoDataConstans {




    Map<Integer, String> lineXMap = new HashMap<Integer, String>() {{
        put(1, "周一");
        put(2, "周二");
        put(3, "周三");
        put(4, "周四");
        put(5, "周五");
        put(6, "周六");
        put(7, "周日");
    }};


    Map<Integer, String> pieXMap = new HashMap<Integer, String>() {{
        put(1, "直接访问");
        put(2, "邮件营销");
        put(3, "联盟广告");
        put(4, "视频广告");
        put(5, "搜索引擎");
        put(6, "简介访问");
        put(7, "抖音广告");
    }};

    String[] EXCEL_HEADER = {"业务类别", "视图名称", "表名", "视图类型", "业务处理逻辑描述"};

    Map<Integer, String> chinaMap = new HashMap<Integer, String>() {{
        put(1, "南海诸岛");
        put(2, "北京");
        put(3, "天津");
        put(4, "上海");
        put(5, "重庆");
        put(6, "河北");
        put(7, "河南");
        put(8, "云南");
        put(9, "辽宁");
        put(10, "黑龙江");
        put(11, "湖南");
        put(12, "安徽");
        put(13, "山东");
        put(14, "新疆");
        put(15, "江苏");
        put(16, "浙江");
        put(17, "江西");
        put(18, "湖北");
        put(19, "广西");
        put(20, "甘肃");
        put(21, "山西");
        put(22, "内蒙古");
        put(23, "陕西");
        put(24, "吉林");
        put(25, "福建");
        put(26, "贵州");
        put(27, "广东");
        put(28, "青海");
        put(29, "西藏");
        put(30, "四川");
        put(31, "宁夏");
        put(32, "海南");
        put(33, "台湾");
        put(34, "香港");
        put(35, "澳门");
    }};

}