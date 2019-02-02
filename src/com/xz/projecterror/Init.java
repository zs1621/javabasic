package com.xz.projecterror;

/**
 *
 * @author zs
 */
public class Init {


    private void test1() throws MemoryException {
        throw new MemoryException("内存有误异常");
    }

    private void test2() {
        try {
            test1();
        } catch ( MemoryException e) {
            RuntimeException newExc = new RuntimeException("test2补获异常");
            newExc.initCause(e);
            throw newExc;
        }
    }

    public static void main(String[] strings) {
        MemoryException memExecption = new MemoryException("内存溢出");
        System.out.println(memExecption.getMessage());

        Init chainTest = new Init();
        chainTest.test2();
    }
}
