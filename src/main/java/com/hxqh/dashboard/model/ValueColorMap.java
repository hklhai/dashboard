package com.hxqh.dashboard.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Lin
 */
@Entity
@Table(name = "tb_color_map")
public class ValueColorMap implements Serializable {

    private static final long serialVersionUID = -391165677144437903L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer valuecolorid;
    private Double lower;
    private Double upper;

    @ManyToOne
    @JoinColumn(name = "VID", referencedColumnName = "vid")
    private Visualize visualize;

    @Transient
    private Integer vid;


    public ValueColorMap() {
    }

    public Integer getValuecolorid() {
        return valuecolorid;
    }

    public void setValuecolorid(Integer valuecolorid) {
        this.valuecolorid = valuecolorid;
    }

    public Double getLower() {
        return lower;
    }

    public void setLower(Double lower) {
        this.lower = lower;
    }

    public Double getUpper() {
        return upper;
    }

    public void setUpper(Double upper) {
        this.upper = upper;
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
