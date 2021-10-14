package com.lngydx.algorithms.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName: InsertSort
 * @Descriptin: TODO
 * @author: lkk
 * @Date: 2021/9/30 8:21
 * @Version: 1.0
 **/
public class InsertSort {

    public static void main(String[] args) {
        int[] arry = {10, 7, 8, 6, 9, 5, 1, 3, 2, 4};
        algorithmInsertNumber(arry);

    }

    /**
     * 插入排序
     */
    public static void algorithmInsertNumber(int[] arry) {
        for (int i = 1; i < arry.length; i++) {
            for (int j = 0; j < i; j++) {
                 if (arry[i] < arry[j]) {
                     int temp = arry[i];
                     for (int k = i; k > j; k--) {
                         arry[k] = arry[k-1];
                     }
                     arry[j] = temp;
                     break;
                 }
            }
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
