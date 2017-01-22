package com.hhly.dagger2sample.bean;

/**
 * @创建者 frank
 * @时间 2017/1/22 15:22
 * @描述：${用于测试json解析数据的bean}
 */

public class GsonTestStudent {

    public String name;
    public int age;
    public boolean isBoy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }


    @Override
    public String toString() {
        return "GsonTestStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBoy=" + isBoy +
                '}';
    }
}
