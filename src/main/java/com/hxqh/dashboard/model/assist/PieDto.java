package com.hxqh.dashboard.model.assist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Ocean lin on 2018/10/25.
 *
 * @author Ocean lin
 */
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class PieDto {
    private String name;
    private Object value;
    private String clickUrl;

}
