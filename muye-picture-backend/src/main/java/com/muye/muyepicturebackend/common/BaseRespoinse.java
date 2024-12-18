package com.muye.muyepicturebackend.common;

import com.muye.muyepicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @className: BaseRespoinse
 * @author: limuye
 * @date: 2024/12/18 21:43
 * 全局响应封装类
 */

@Data
public class BaseRespoinse<T>  implements Serializable {

    private int code;

    private T data;

    private String message;


    public BaseRespoinse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseRespoinse(int code, T data) {
        this(code, data, "");
    }

    public BaseRespoinse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
