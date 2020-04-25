package com.xxf.algorithm.test;

import com.xxf.algorithm.sort.BubbleSort;

import java.util.Arrays;

public class BubbleTest {

    public static void main(String[] args) {
        Integer[] ints = {3,7,5,10,4,2};
        BubbleSort.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
