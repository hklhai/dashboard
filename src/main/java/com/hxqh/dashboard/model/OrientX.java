package com.hxqh.dashboard.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2018/11/21.
 *
 * @author Ocean lin
 */
@Entity
@Table(name = "tb_orientx")
public class OrientX implements Serializable {

    private static final long serialVersionUID = -1490023987249693008L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orientxid;
    private String xname;

    private String xAxisLabel;
    @Column(name = "xaxisline", columnDefinition = "bool default true")
    private Boolean xAxisLine;
    @Column(name = "xsplitline", columnDefinition = "bool default true")
    private Boolean xSplitLine;
    @Column(name = "xinverse", columnDefinition = "bool default false")
    private Boolean xInverse;

    @ManyToOne
    @JoinColumn(name = "VID", referencedColumnName = "vid")
    private Visualize visualize;

    @Transient
    private Integer vid;

    private String xlineColor;
    private String xnameColor;
    private String xaxisLabelPos;

    public OrientX() {
    }

    public Integer getOrientxid() {
        return orientxid;
    }

    public void setOrientxid(Integer orientxid) {
        this.orientxid = orientxid;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public String getxAxisLabel() {
        return xAxisLabel;
    }

    public void setxAxisLabel(String xAxisLabel) {
        this.xAxisLabel = xAxisLabel;
    }

    public Boolean getxAxisLine() {
        return xAxisLine;
    }

    public void setxAxisLine(Boolean xAxisLine) {
        this.xAxisLine = xAxisLine;
    }

    public Boolean getxSplitLine() {
        return xSplitLine;
    }

    public void setxSplitLine(Boolean xSplitLine) {
        this.xSplitLine = xSplitLine;
    }

    public Boolean getxInverse() {
        return xInverse;
    }

    public void setxInverse(Boolean xInverse) {
        this.xInverse = xInverse;
    }

    public Visualize getVisualize() {
        return visualize;
    }

    public void setVisualize(Visualize visualize) {
        this.visualize = visualize;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getXlineColor() {
        return xlineColor;
    }

    public void setXlineColor(String xlineColor) {
        this.xlineColor = xlineColor;
    }

    public String getXnameColor() {
        return xnameColor;
    }

    public void setXnameColor(String xnameColor) {
        this.xnameColor = xnameColor;
    }

    public String getXaxisLabelPos() {
        return xaxisLabelPos;
    }

    public void setXaxisLabelPos(String xaxisLabelPos) {
        this.xaxisLabelPos = xaxisLabelPos;
    }
}
