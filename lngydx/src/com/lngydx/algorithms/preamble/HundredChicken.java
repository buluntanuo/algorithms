package com.lngydx.algorithms.preamble;

/**
 * @ClassName: HundredChicken
 * @Descriptin: TODO
 * @author: lkk
 * @Date: 2021/9/30 8:09
 * @Version: 1.0
 **/
public class HundredChicken {

    public static void main(String[] args) {
        algorithmHundredChicken();
    }

    /**
     * 鸡翁一，钱值五，鸡母一，钱值三，鸡雏三，钱值一。
     * 百鸡值百钱，问鸡翁，鸡母，鸡雏各几何？
     */
    public static void algorithmHundredChicken() {
        for (int x = 0; x < 20; x++) {
            if ((100 - 7 * x) % 4 == 0) {
                int y = (100 - 7 * x) / 4;
                int z = 100 - x -y;
                if (y >= 0 && z >= 0 && 15 * x + 9 * y + z == 300) {
                    System.out.println("鸡翁=" + x + "--鸡母=" + y + "--鸡雏=" + z);
                }
            }
        }
    }
}
