package com.xxf.algorithm.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Comparable<Student> {

    private int age;
    private String name;

    @Override
    public int compareTo(Student o) {
        return this.age - o.getAge();
    }
}
