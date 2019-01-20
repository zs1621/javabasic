package com.xz.democlass;

/**
 * 智能电话
 *
 * @author zs
 * @date 2019/1/19
 */
public class SmartTelephone extends Telephone implements IPlayGame {
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void sendmsg() {
        System.out.println("通过语音发短信");
    }

    @Override
    public void playGame() {
        System.out.println("具有玩游戏的功能");
    }
}
