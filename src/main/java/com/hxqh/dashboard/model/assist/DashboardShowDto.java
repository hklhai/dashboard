package com.hxqh.dashboard.model.assist;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class DashboardShowDto {

    private List<ShowDto> showDtoList;

    private String dashboardshowname;
    private String businesscategory;
    private Integer refresh;

    public DashboardShowDto() {
    }

    public DashboardShowDto(List<ShowDto> showDtoList, String dashboardshowname, String businesscategory) {
        this.showDtoList = showDtoList;
        this.dashboardshowname = dashboardshowname;
        this.businesscategory = businesscategory;
    }

    public Integer getRefresh() {
        return refresh;
    }

    public void setRefresh(Integer refresh) {
        this.refresh = refresh;
    }

    public List<ShowDto> getShowDtoList() {
        return showDtoList;
    }

    public void setShowDtoList(List<ShowDto> showDtoList) {
        this.showDtoList = showDtoList;
    }

    public String getDashboardshowname() {
        return dashboardshowname;
    }

    public void setDashboardshowname(String dashboardshowname) {
        this.dashboardshowname = dashboardshowname;
    }

    public String getBusinesscategory() {
        return businesscategory;
    }

    public void setBusinesscategory(String businesscategory) {
        this.businesscategory = businesscategory;
    }

}
