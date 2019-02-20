package com.xz.DateStudy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化
 *
 * @author zs
 * @date 2019/2/21
 */
public class DateStudy {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(timeFormat("yyyy-MM-dd HH:mm:ss", d));
        try {
            System.out.println(timeParse("2018年11月11日 12:23:59"));
            System.out.println(timeParse("2018年dfdf11月11日 12:23:59"));
        } catch (ParseException e) {
            System.out.println("时间格式不是 \"2018年11月11日 12:23:59\"");
        }

    }

    /**
     * * 格式化时间
     *
     * @param format 时间格式字符串 比如 "yyyy-MM-dd HH:mm:ss"
     * @param d   时间对象
     * @return 被格式化的字符串
     */

    private static String timeFormat(String format, Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }

    /**
     * 解析时间字符串
     * @param timeString 类似 xxxx年xx月xx日 xx:xx:xx 的时间字符串转化为date对象
     * @return 时间对象
     * @throws ParseException  时间字符不符的提示
     */
    private static Date timeParse(String timeString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.parse(timeString);
    }
}
