package com.muye.muyepicturebackend.exception;

/**
 * @className: BunessException
 * @author: limuye
 * @date: 2024/12/18 21:27
 * 自定义异常类
 */

import lombok.Getter;

@Getter
public class BunessException extends RuntimeException{

    private final int code;


    public BunessException(int code , String message) {
        super(message);
        this.code = code;
    }

    public BunessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BunessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
