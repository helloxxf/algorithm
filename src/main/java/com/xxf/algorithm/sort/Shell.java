package com.xxf.algorithm.sort;

/**
 * 希尔排序
 */
public class Shell {

    /**
     * 排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        //根据数组a的长度确定增长量
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;
        }
        //排序
        while (h >= 1) {
            //找到带插入的元素， 第一个待插入的值的索引等于h
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (compare(a[j - h], a[j])) {
                        exec(a, j - h, j);
                    } else {
                        break;
                    }
                }
            }
            //减小h的值
            h = h / 2;
        }

    }

    /**
     * 比较
     *
     * @param a
     * @param b
     * @return
     */
    private static boolean compare(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    /**
     * 交换
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exec(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
