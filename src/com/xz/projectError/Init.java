package com.xz.projectError;

/**
 *
 * @author zs
 */
public class Init {
    public static void main(String[] strings) {
        MemoryException memExecption = new MemoryException("内存溢出");
        System.out.println(memExecption.getMessage());
    }
}
