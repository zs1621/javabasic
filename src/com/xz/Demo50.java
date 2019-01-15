package com.xz;

import java.util.Scanner;

/**
 * 添加分数
 *
 * @author zs
 */
public class Demo50 {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入考试成绩: ");
        int score = input.nextInt();
        int count = 0;
        final int maxValue = 60;
        System.out.println("加分前成绩:" + score);
        for (;score < maxValue; count++) {
            score += 1;
        }
        System.out.println("加分后成绩:" + score);
        System.out.println("总共加了" + count + "次");
    }
}
