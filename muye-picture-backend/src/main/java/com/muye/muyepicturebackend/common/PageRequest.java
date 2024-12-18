package com.muye.muyepicturebackend.common;

import lombok.Data;

/**
 * @className: PageRequest
 * @author: limuye
 * @date: 2024/12/18 22:02
 */

@Data
public class PageRequest {

    /**
     * 当前页码
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序
     */
    private String sortOrder = "descend";
}
