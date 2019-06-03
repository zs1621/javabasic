package com.xz.Exercises;

public class FirstTwoSeven {
    public static String mysetry(String s)
    {
        int N = s.length();
        if (N <=1 ) {
            return s;
        }
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mysetry(b) + mysetry(a);
    }
}
