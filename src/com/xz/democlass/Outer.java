package com.xz.democlass;

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

    public class Inner {
        int b = 2;
        int a = 1;
        public void test() {
            // 普通内部类访问外部类的 私有变量  Outer.this.xxx
            System.out.println("访问外部类私有变量的a:" + Outer.this.a);
            System.out.println("访问内部类的普通变量a:" + a);
            System.out.println("访问内部类种的b:" + b);
            System.out.println("访问外部类的静态成员变量b:" + Outer.b);
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
        Inner i = o.new Inner();
        i.test();
        StaticInner is = new StaticInner();
        is.test();
    }
}
