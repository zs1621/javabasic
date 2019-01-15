package com.xz;
import java.util.Random;
import java.util.Arrays;

/**
 * 创建指定长度的 int 型数组，并生成 100 以内随机数为数组中的每个元素赋值，然后输出数组
 *
 * @author zs
 */
public class DemoFuncPractice {

    public int[] arrayGen(int count) {
        /**
         * @params count int
         * @return  int[]
         */
        int[] arr = new int[count];
        for (int i=0; i < count; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void main(String[] strings) {

        DemoFuncPractice arrayData = new DemoFuncPractice();
        System.out.println(Arrays.toString(arrayData.arrayGen(10)));
    }
}
