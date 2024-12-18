package com.muye.muyepicturebackend.common;

import com.muye.muyepicturebackend.exception.ErrorCode;

/**
 * @className: ResultUtils
 * @author: limuye
 * @date: 2024/12/18 21:47
 */
public class ResultUtils {


    public static <T> BaseRespoinse<T> success(T data){
        return new BaseRespoinse<>(0,data,"ok");
    }

    public static <T> BaseRespoinse<T> success(T data , String message){
        return new BaseRespoinse<>(0,data,message);
    }

    public static <T> BaseRespoinse<T> error(ErrorCode errorCode){
        return new BaseRespoinse<>(errorCode.getCode(),null,errorCode.getMessage());
    }

    public static <T> BaseRespoinse<T> error(ErrorCode errorCode, String message){
        return new BaseRespoinse<>(errorCode.getCode(),null,message);
    }

    public static <T> BaseRespoinse<T> error(int code, String message){
        return new BaseRespoinse<>(code,null,message);
    }
}
