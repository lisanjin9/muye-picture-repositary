package com.muye.muyepicturebackend.exception;

import com.muye.muyepicturebackend.common.BaseRespoinse;
import com.muye.muyepicturebackend.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @className: GlobalExceptionHandler
 * @author: limuye
 * @date: 2024/12/18 21:58
 */


@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(BunessException.class)
    public BaseRespoinse<?> bunnessExceptionHandler(BunessException e){
        log.error("BunessException",e);
        return ResultUtils.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseRespoinse<?> bunnessExceptionHandler(RuntimeException e){
        log.error("RuntimeException",e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR,"系统错误");
    }
}
