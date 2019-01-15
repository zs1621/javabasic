package com.xz;

/**
 * 静态方法 静态变量使用
 *
 * @author zs
 * @date 2019/1/15
 */
public class DemoStaticFunc {
    static String staticHehe ="我是静态变量";
    String normalHehe = "我是普通成员变量";
    public static void show(){
        System.out.println("静态方法调用静态变量:" + staticHehe);
        DemoStaticFunc dstatic = new DemoStaticFunc();
        System.out.println("静态方法调用普通成员变量:" + dstatic.normalHehe);
    }

    public static void main(String[] strings) {
        show();
    }
}
