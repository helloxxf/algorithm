package com.xxf.algorithm.test;

import com.xxf.algorithm.sort.Student;

public class ComparableTest {

    private static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result >= 0) {
            return c1;
        } else {
            return c2;
        }

    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        Student student1 = new Student();
        student1.setAge(28);
        Comparable max = getMax(student, student);
        System.out.println(max);
    }
}
