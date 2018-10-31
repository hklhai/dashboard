package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.LineDouble;
import com.hxqh.dashboard.model.LineFloat;
import com.hxqh.dashboard.model.LineInteger;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/31.
 *
 * @author Ocean lin
 */
public class InsertInfo {

    private Integer vid;
    private List<LineDouble> lineDoubleList;
    private List<LineFloat> lineFloatList;
    private List<LineInteger> lineIntegerList;

    public InsertInfo() {
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public List<LineDouble> getLineDoubleList() {
        return lineDoubleList;
    }

    public void setLineDoubleList(List<LineDouble> lineDoubleList) {
        this.lineDoubleList = lineDoubleList;
    }

    public List<LineFloat> getLineFloatList() {
        return lineFloatList;
    }

    public void setLineFloatList(List<LineFloat> lineFloatList) {
        this.lineFloatList = lineFloatList;
    }

    public List<LineInteger> getLineIntegerList() {
        return lineIntegerList;
    }

    public void setLineIntegerList(List<LineInteger> lineIntegerList) {
        this.lineIntegerList = lineIntegerList;
    }
}
