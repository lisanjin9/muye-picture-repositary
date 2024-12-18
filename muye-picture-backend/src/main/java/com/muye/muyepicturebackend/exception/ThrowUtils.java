package com.muye.muyepicturebackend.exception;

/**
 * @className: ThrowUtils
 * @author: limuye
 * @date: 2024/12/18 21:35
 *  异常抛出类
 */
public class ThrowUtils {

    public static void throwIf(boolean  condition , RuntimeException runtimeException){
        if (condition){
            throw runtimeException;
        }
    }

    public static void throwIf(boolean condition , ErrorCode errorCode){
        throwIf(condition, new BunessException(errorCode));
    }

    public static void throwIf(boolean condition , ErrorCode errorCode , String message){
        throwIf(condition, new BunessException(errorCode,message));
    }
}
