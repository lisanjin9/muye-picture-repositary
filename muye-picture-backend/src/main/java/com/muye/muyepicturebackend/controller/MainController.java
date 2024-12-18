package com.muye.muyepicturebackend.controller;

import com.muye.muyepicturebackend.common.BaseRespoinse;
import com.muye.muyepicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: MainController
 * @author: limuye
 * @date: 2024/12/18 22:18
 */

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/main")
    public BaseRespoinse<String> hello (){
        return ResultUtils.success("ok");
    }

}
