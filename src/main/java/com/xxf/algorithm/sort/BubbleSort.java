package com.xxf.algorithm.sort;

/**
 * des:冒泡排序 (随着数据量变多，性能下降, O(n^2)）
 * author: xxf
 */
public class BubbleSort {

    /**
     * 冒泡排序实现
     * @param a
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (compare(a[j], a[j + 1])) {
                    exec(a, j, j + 1);
                }
            }
        }

    }

    /**
     * 大小比较
     * @param a
     * @param b
     * @return
     */
    private static boolean compare(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    /**
     * 交换数据（a[i] > a[j]
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
