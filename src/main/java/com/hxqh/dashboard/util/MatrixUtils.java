package com.hxqh.dashboard.util;

/**
 * Created by Ocean lin on 2018/11/14.
 *
 * @author Ocean lin
 */
public class MatrixUtils {

    public static void transpose(Object[][] source, int x, int y, Object[][] target) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                target[j][i] = source[i][j];
            }
        }
    }
}
