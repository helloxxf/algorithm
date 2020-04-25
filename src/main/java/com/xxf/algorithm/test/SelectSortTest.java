package com.xxf.algorithm.test;

import com.xxf.algorithm.sort.SelectSort;

import java.util.Arrays;

public class SelectSortTest {

    public static void main(String[] args) {
        Integer[] array = {2, 5, 7, 4, 9, 12, 4, 1};
        SelectSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
