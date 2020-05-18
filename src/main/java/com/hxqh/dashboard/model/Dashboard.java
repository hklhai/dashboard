package com.hxqh.dashboard.model;

/**
 * Created by Ocean lin on 2018/10/12.
 *
 * @author Ocean lin
 */

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_dashboard")
public class Dashboard implements Serializable {

    private static final long serialVersionUID = 1996784852462232045L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bid;
    private String dashboardname;
    private String dashboarddescription;
    private String dashboardshowname;
    private String type;
    private String businesscategory;
    private Integer refresh;

    @OneToMany(mappedBy = "dashboard", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JSONField(serialize = false)
    private List<DashboardVisualize> dashboardVisualizes;

    private String vids;
}
