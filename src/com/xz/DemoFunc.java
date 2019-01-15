package com.xz;

/**
 * 方法
 *
 * @author zs
 * @date 2019-1-8
 */
public class DemoFunc {
    public void show(String name) {
        System.out.println(name);
    }

    public int calSum() {
        int a = 1;
        int b = 3;
        return a + b;
    }

    public static void main(String[] strings) {
        DemoFunc demoFunc = new DemoFunc();
        demoFunc.show("哈哈哈哈");
        System.out.println(demoFunc.calSum());
    }
}
