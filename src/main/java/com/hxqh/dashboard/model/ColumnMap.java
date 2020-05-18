package com.hxqh.dashboard.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Lin
 */
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_columnmap")
public class ColumnMap implements Serializable {

    private static final long serialVersionUID = 5712804868106444401L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer columnmid;

    @ManyToOne
    @JoinColumn(name = "VID", referencedColumnName = "vid")
    private Visualize visualize;

    private String field;
    private String type;
    private String columnshow;

    @Transient
    private Integer vid;

    private String colColor;
    private String colLabel;
    private String colLabelPos;
    @Column(name = "col_max", columnDefinition = "bool default false")
    private Boolean colMax;
    @Column(name = "col_min", columnDefinition = "bool default false")
    private Boolean colMin;
    private Integer colYIndex;
    private String colWidth;
    private String colStack;
    private String colName;

    private String colType;
    @Column(name = "col_average", columnDefinition = "bool default false")
    private Boolean colAverage;

    @Column(name = "col_gradient", columnDefinition = "bool default false")
    private Boolean colGradient;
    private String colStartColor;
    private String colEndColor;
    private String colLabelRotate;

    @Column(name = "col_area_style", columnDefinition = "bool default false")
    private Boolean colAreaStyle;
    @Column(name = "col_smooth", columnDefinition = "bool default true")
    private Boolean colSmooth;
    private String colAreaColor;
    private String sampling;
    @Column(name = "col_step", columnDefinition = "bool default false")
    private Boolean colstep;

    @Column(name = "col_rose_type", columnDefinition = "bool default false")
    private Boolean colRoseType;
    @Column(name = "col_label_line", columnDefinition = "bool default false")
    private Boolean colLabelline;
    private String colLabelLineColor;
    private String colRadius;

    private String clickUrl;

}
