package com.xxf.algorithm.sort;

/**
 * des:选择排序O(n^2)
 * author:xxf
 */
public class SelectSort {


    /**
     * 排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (compare(a[i], a[j])) {
                    exec(a, i, j);
                    continue;
                }
            }
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
