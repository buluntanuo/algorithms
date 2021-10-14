package com.lngydx.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: MergeSort
 * @Descriptin: TODO
 * @author: lkk
 * @Date: 2021/9/30 11:45
 * @Version: 1.0
 **/
public class MergeSort {

    public static void main(String[] args) {
        Integer[] arry = {10, 7, 8, 6, 9, 5, 1, 3, 2, 4};
        System.out.println(algorithmMergeSort(Arrays.asList(arry)));
    }

    /**
     * 归并排序
     */
    public static List<Integer> algorithmMergeSort(List<Integer> array) {
        List<Integer> listA = new ArrayList<>();
        for (int i = 0; i < array.size() / 2; i++) {
          listA.add(array.get(i));
        }
        if (listA.size() > 1) {
            listA = algorithmMergeSort(listA);
        }
        List<Integer> listB = new ArrayList<>();
        for (int i = array.size() / 2; i < array.size(); i++) {
            listB.add(array.get(i));
        }
        if (listB.size() > 1) {
            listB = algorithmMergeSort(listB);
        }
        return mergeArray(listA, listB);
    }

    private static List<Integer> mergeArray(List<Integer> listA, List<Integer> listB) {
        List<Integer> array = new ArrayList<>();
        int i = 0, j = 0;
        for (; i < listA.size() && j < listB.size(); ) {
            if (listA.get(i) > listB.get(j)) {
                array.add(listB.get(j));
                j++;
            }else {
                array.add(listA.get(i));
                i++;
            }
        }
        while (i < listA.size()) {
            array.add(listA.get(i));
            i++;
        }
        while (j < listB.size()) {
            array.add(listB.get(j));
            j++;
        }
        return array;
    }
}
