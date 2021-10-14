package com.lngydx.algorithms.sort;

/**
 * @ClassName: QuickSort
 * @Descriptin: TODO
 * @author: lkk
 * @Date: 2021/10/12 20:48
 * @Version: 1.0
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {2, 8, 7, 1, 3, 5, 6, 4};
        quickSort(array, 0, 7);
        for (int i = 0; i < 8; i ++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static int partition(int[] array, int p, int q) {
        int t = array[q];
        int i = p;
        int j = q;
        while (i < j) {
            while (i < j && array[i] <= t) {
                i++;
            }
            if (i < j) {
                array[j--] = array[i];
            }
            while (i < j && array[j] >= t) {
                j--;
            }
            if (i < j) {
                array[i++] = array[j];
            }
        }
        array[i] = t;
        return i;
    }

    public static void quickSort(int[] array, int p, int q) {
        if (p >= q) {
            return;
        }
        int t = partition(array, p, q);
        quickSort(array, p, t -1);
        quickSort(array, t + 1, q);
    }
}
