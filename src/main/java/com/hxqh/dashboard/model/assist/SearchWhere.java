package com.hxqh.dashboard.model.assist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by Ocean lin on 2020/5/9.
 *
 * @author Ocean lin
 */
@NoArgsConstructor
@Setter
@Getter
public class SearchWhere {

    private Integer bid;

    private List<VidWhere> qList;

}
