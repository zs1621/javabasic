package com.xz.democlass;

public class Init {
    public static void main(String[] strings) {
        Dog dog = new Dog();
        System.out.println("狗的年龄:" + dog.age);
        dog.name = "小黄";
        System.out.println("狗的昵称:" + dog.name);
    }
}
