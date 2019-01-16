package com.xz.democlass;

/**
 * 运行继承代码
 *
 * @author zs
 * @date 2019/1/16
 */
public class Init {

    public static void main(String[] strings) {
        Dog dog = new Dog();
        System.out.println("狗的年龄:" + dog.age);
        dog.name = "小黄";
        System.out.println("狗的昵称:" + dog.name);
        dog.method();

        System.out.println(dog);

        // 重写equals 判断属性值age
        Dog dog2 = new Dog();
        dog.age = 12;
        dog2.age = 12;
        System.out.println(dog.equals(dog2));


        // 关于多态
        Animal a1 = new Animal();
        Animal a2 = new Dog();

        a1.eat();
        a2.eat();
    }
}
