package com.xz.democlass;

/**
 * 手提电话
 *
 * @author zs
 * @date 2019/1/19
 */
public class CellPhone extends Telephone {
    @Override
    public void call() {
        System.out.println("通过键盘打电话");
    }

    @Override
    public void sendmsg() {
        System.out.println("通过键盘发短信");
    }
}