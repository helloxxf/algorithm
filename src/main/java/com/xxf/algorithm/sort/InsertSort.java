package com.xxf.algorithm.sort;

/**
 * 插入排序 O(n^2)
 *
 */
public class InsertSort {

    /**
     * 排序
     *
     * @param a
     * @return
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (compare(a[j], a[j - 1])) {
                    break;
                } else {
                    exec(a, j-1, j);
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

    private static void exec(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
