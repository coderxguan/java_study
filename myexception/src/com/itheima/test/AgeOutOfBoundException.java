package com.itheima.test;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 13:13
 */
public class AgeOutOfBoundException extends RuntimeException{
    public AgeOutOfBoundException() {
    }

    public AgeOutOfBoundException(String message) {
        super(message);
    }
}
