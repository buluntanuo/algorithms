package com.lngydx.algorithms.preamble;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: PrimeNumber
 * @Descriptin: TODO
 * @author: lkk
 * @Date: 2021/9/30 8:10
 * @Version: 1.0
 **/
public class PrimeNumber {

    public static void main(String[] args) {
        algorithmFindPrimeNumber1(100);
        algorithmFindPrimeNumber2(100);
    }

    /**
     * 查找2-100之间的所有质数(升级版）
     */
    public static void algorithmFindPrimeNumber2(int n) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            listB.add(i);
        }
        Iterator<Integer> iteratorB = listB.iterator();
        while (iteratorB.hasNext()) {
            Integer x = iteratorB.next();
            boolean flag = true;
            Iterator<Integer> iteratorA = listA.iterator();
            while (iteratorA.hasNext()) {
                Integer y = iteratorA.next();
                if (x % y == 0) {
                    iteratorB.remove();
                    flag = false;
                    break;
                }
            }
            double p = Math.pow(n, 0.5);
            if (!flag || x > p) {
                continue;
            }
            double q = Math.pow(x, 0.5);
            for (int i = 2; i < q; i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                listA.add(x);
            }
        }
        System.out.println(listA);
        System.out.println(listB);
    }

    /**
     * 查找2-100之间的所有质数(第一版）
     */
    public static void algorithmFindPrimeNumber1(int n) {
        List<Integer> listA = new ArrayList<>();
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            listA.add(i);
        }
        List<Integer> listB = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            listB.add(i);
        }
        for (int i = 0 ; i < listA.size(); i++) {
            Integer x = listA.get(i);
            boolean flag = true;
            for (int j = 2; j <= Math.pow(x, 0.5); j++) {
                if (x % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                Iterator<Integer> iteratorA = listA.iterator();
                while (iteratorA.hasNext()) {
                    Integer y = iteratorA.next();
                    if (y > x && y % x == 0) {
                        iteratorA.remove();
                    }
                }
                Iterator<Integer> iteratorB = listB.iterator();
                while (iteratorB.hasNext()) {
                    Integer z = iteratorB.next();
                    if (z > x && z % x == 0) {
                        iteratorB.remove();
                    }
                }
            }
        }
        System.out.println(listB);
    }
}
