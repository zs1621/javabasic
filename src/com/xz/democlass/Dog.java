package com.xz.democlass;


/**
 * 动物子类-🐶
 *
 * @author zs
 * @date 2019/1/16
 */
public class Dog extends Animal{
    public int age = 20;

    @Override
    public void eat() {
        System.out.println("Dog吃骨头！");
    }
    public Dog() {
        super();
        System.out.println("Dog类执行了");
    }

    /**
     * 了解super使用
     */
    public void method() {
        System.out.println(super.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Dog)) {return false;}

        Dog dog = (Dog) o;

        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
