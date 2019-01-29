package com.xz.projectError;


/**
 * 自定义的内存异常
 *
 * @author zs
 * @date 2019/1/29
 */
public class MemoryException extends Exception{

    public MemoryException() {}

    public MemoryException(String message) {
        super(message);
    }
}
