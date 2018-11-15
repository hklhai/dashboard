package com.hxqh.dashboard.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Lin
 */
@Entity
@Table(name = "tb_orienty")
public class OrientY implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orientyid;
    private String yname;
    private String yAxisLabel;
    @Column(name = "yaxisline", columnDefinition = "bool default true")
    private Boolean yAxisLine;
    @Column(name = "ysplitline", columnDefinition = "bool default true")
    private Boolean ySplitLine;
    @Column(name = "yinverse", columnDefinition = "bool default false")
    private Boolean yInverse;

    @ManyToOne
    @JoinColumn(name = "VID", referencedColumnName = "vid")
    private Visualize visualize;

    @Transient
    private Integer vid;

    public Integer getOrientyid() {
        return orientyid;
    }

    public void setOrientyid(Integer orientyid) {
        this.orientyid = orientyid;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public String getyAxisLabel() {
        return yAxisLabel;
    }

    public void setyAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
    }

    public Boolean getyAxisLine() {
        return yAxisLine;
    }

    public void setyAxisLine(Boolean yAxisLine) {
        this.yAxisLine = yAxisLine;
    }

    public Boolean getySplitLine() {
        return ySplitLine;
    }

    public void setySplitLine(Boolean ySplitLine) {
        this.ySplitLine = ySplitLine;
    }

    public Boolean getyInverse() {
        return yInverse;
    }

    public void setyInverse(Boolean yInverse) {
        this.yInverse = yInverse;
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
}
