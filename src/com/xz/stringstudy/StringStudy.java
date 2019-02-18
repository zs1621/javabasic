package com.xz.stringstudy;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * string study
 *
 * @author zs
 * @date 2018/2/14
 */
public class StringStudy {
    @NotNull
    @Contract(pure = true)
    public static String toStr(int a) {
        return a + "";
    }
    public static void main(String[] args){
        // 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

        // 出现次数
        int num = 0;
        byte[] b = s.getBytes();

        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (   int i = 0; i < b.length; i++ )
        {
            // 获取每个字符，判断是否是字符a
            if (  b[i] == 'a'               ) {
                // 累加统计次数
                num++;
            }
        }
        System.out.println("字符a出现的次数：" + num);

        String str = "好辛苦哦";
        System.out.println("获取索引位置为1的字符:" + str.charAt(1));
        String str1 = "好辛苦哦";
        String str2 = new String("好辛苦哦");
        System.out.println("str和str1字符串的内存地址是否相同?" + (str == str1));
        System.out.println("str和str2的内存地址是否相同?" + (str == str2));
        System.out.println("两个字符串的内容是否相同?" + str.equals(str1));


        // StringBuilder

        StringBuilder hobby=new StringBuilder("爱慕课");
        System.out.println(hobby);

        int i = 10;
        String z = "10";

        System.out.println(toStr(i));
        System.out.println(z.equals(toStr(i)));
    }


}
