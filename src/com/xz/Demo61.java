package com.xz;

import java.util.Arrays;

/**
 * 数组语法
 *
 * @author zs
 */
public class Demo61 {
    public static int minArray(int[] arrays) {
        int minValue = 0;
        for (int i=0; i < arrays.length; i++) {
            if (arrays[i] < minValue) {
                minValue = arrays[i];
            }
        }
        return minValue;
    }
    public static void main(String[] strings) {
        int[] scores = {1, 9, 4, 5, 6};
        System.out.println("数组中的第2个成绩为：" + scores[2]);

        String[] subjects = new String[5];
        subjects[1] = "JAVA";
        System.out.println("subjects第二个元素为: "+ subjects[1]);
        System.out.println("数组长度为: " + subjects.length);
        for (int i=0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("scores最小值为: " + minArray(scores));


       Arrays.sort(scores);
        for (int i=0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("数组转化为string后: " + Arrays.toString(scores));
        int idx = 0;
        for(int score: scores) {
            System.out.println(score);
            System.out.println(idx);
            idx += 1;
        }

        String[][] names={
                {"tom","jack","mike"},
                {"zhangsan","lisi","wangwu"}
        };
        for (String []i: names) {
            for (String j: i) {
                System.out.println(j);
            }
            System.out.println("");
        }
    }
}
