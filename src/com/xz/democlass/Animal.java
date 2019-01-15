package com.xz.democlass;

/**
 * 动物父类
 *
 * @author zs
 * @date 2019/1/16
 */
public class Animal {
    public Animal() {
        System.out.println("Animal执行----");
    }

    int age = 10;
    String name;

    public void eat() {
        System.out.println("Animal可以吃东西!");
    }
}
