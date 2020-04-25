package com.xxf.algorithm.test;

import com.xxf.algorithm.sort.InsertSort;

import java.util.Arrays;

public class InsertTest {

    public static void main(String[] args) {
        Integer[] array = {8, 3, 2, 6, 10, 20, 21, 21, 23, 1};
        InsertSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
