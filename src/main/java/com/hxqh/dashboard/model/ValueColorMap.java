package com.hxqh.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private String min;
    private String max;
    private String description;

    @JsonIgnore
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

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
