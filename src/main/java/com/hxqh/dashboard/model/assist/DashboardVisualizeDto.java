package com.hxqh.dashboard.model.assist;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class DashboardVisualizeDto implements Serializable {

    private static final long serialVersionUID = -8660809140651525041L;
    private Integer bid;

    private List<Location> locationList;

    private List<Integer> deleteList;

    public DashboardVisualizeDto() {
    }

    public DashboardVisualizeDto(Integer bid, List<Location> locationList) {
        this.bid = bid;
        this.locationList = locationList;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public List<Integer> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<Integer> deleteList) {
        this.deleteList = deleteList;
    }
}
