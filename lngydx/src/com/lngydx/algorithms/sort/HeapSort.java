package com.lngydx.algorithms.sort;

/**
 * @ClassName: HeapSort
 * @Descriptin: TODO
 * @author: lkk
 * @Date: 2021/10/13 18:10
 * @Version: 1.0
 **/
public class HeapSort {

    public static void main(String[] args) {
        int[] array = {0, 2, 8, 7, 1, 3, 5, 6, 4};
        heapSort(array);
        for (int i = 0; i < 9; i ++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void heapSort(int[] array) {
        initHeap(array);
        int p = 1;
        int q = array.length - 1;
        for (int i = 1; i < array.length; i++) {
            int t = array[q];
            array[q] = array[1];
            array[1] = t;
            adjustHeap(array, 1, q--);
        }

    }

    private static void initHeap(int[] array) {
        for (int i = array.length / 2; i > 0; i--) {
            int k = 2 * i;
            if (2 * i + 1 < array.length && array[2 * i] < array[2 * i + 1]) {
                k = 2 * i + 1;
            }
            if (array[i] < array[k]) {
                int t = array[i];
                array[i] = array[k];
                array[k] = t;
                adjustHeap(array, k, array.length);
            }
        }
    }

    private static void adjustHeap(int[] array, int p, int q) {
        for (int i = p; i <= q / 2 && 2 * i + 1 <= q; i++) {
            int k = 2 * i;
            if (2 * i + 1 < q && array[2 * i] < array[2 * i + 1]) {
                k = 2 * i + 1;
            }
            if (array[i] < array[k]) {
                int t = array[i];
                array[i] = array[k];
                array[k] = t;
                adjustHeap(array, k, q);
            }
        }
    }
}


