package com.hxqh.dashboard.crawler;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ocean lin on 2018/1/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class URLTest {
    private static final Integer PAGE_NUM = 1;
    private static final String URL = "<a data-searchpingback-elem=\"link\" data-searchpingback-param=\"target=3964b0adbecf7fe307271420f47339a6&amp;ptype=1&amp;site=iqiyi&amp;pos=1\" rseat=\"bigTitle\" title=\"前任2：备胎反击战\" href=\"http://www.iqiyi.com/v_19rrkih1u4.html#vfrm=2-4-0-1\" target=\"_blank\">前任2：备胎反击战</a>\n";

    // 所有待爬取URLList
    List<String> allStartURLList = new ArrayList<>();

    ArrayList<String> allHrefList = new ArrayList();
    ArrayList<String> hrefList = new ArrayList();


    /**
     * 从一行字符串中读取链接
     *
     * @return
     */
    private String getHref(String str) {
        Pattern pattern = Pattern.compile("<a .* href=.*</a>");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }


}
