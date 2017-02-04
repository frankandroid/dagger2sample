package com.hhly.dagger2sample.bean;

/**
 * @创建者 frank
 * @时间 2017/1/22 11:50
 * @描述：${TODO}
 */

public class FirstStudent {

    public int age;
    public String name;

    public FirstStudent(String name) {
        this.name = name;
    }

    public FirstStudent(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FirstStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
