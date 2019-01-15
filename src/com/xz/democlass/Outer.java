package com.xz.democlass;

import java.time.chrono.MinguoChronology;

/**
 * 成员内部类
 *
 * @author zs
 * @date 2019/1/15
 */
public class Outer
{
    private int a = 99;
    /**
     * 静态变量成员  b
     */
    static int b = 0;

    public void show() {
        int c = 4;
        int d = 5;
        /**
         *
         * 方法内部类 只在该方法的内部可见
         * 不可以用 访问控制符和 static 修饰符哦
         */
        class MInner {
            int c = 3;
            public void print() {
                System.out.printf("访问方法内的变量: %d%n", d);
            }
        }

        MInner mi = new MInner();
        mi.print();
    }

    public class Inner {
        int b = 2;
        int a = 1;
        public void test() {
            // 普通内部类访问外部类的 私有变量  Outer.this.xxx
            System.out.printf("访问外部类私有变量的a:%d%n", Outer.this.a);
            System.out.printf("访问内部类的普通变量a:%d%n", a);
            System.out.printf("访问内部类种的b:%d%n", b);
            System.out.printf("访问外部类的静态成员变量b:%d%n", Outer.b);


        }
    }

    /**
     * 静态类成员
     */
    public static class StaticInner{
        int b = 3;
        public void test() {
            System.out.println("访问外部类种静态b:" + Outer.b);
            System.out.println("访问内部类的b:" + b);
            // 访问外部的私有变量 需要new 对象查看
            Outer bz = new Outer();
            System.out.println("访问外部类种的b:" + bz.a);
        }

    }

    /**
     * 测试内部类
     * @param strings
     */
    public static void main(String[] strings) {
        Outer o = new Outer();
        System.out.printf("方法内部类:-------------%n");
        o.show();
        System.out.printf("-------------%n");
        Inner i = o.new Inner();
        i.test();
        StaticInner is = new StaticInner();
        is.test();
    }
}
