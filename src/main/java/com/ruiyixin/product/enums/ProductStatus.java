package com.ruiyixin.product.enums;

import lombok.Getter;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2516:41
 */
@Getter
public enum ProductStatus {
    UP(0,"上架"),
    DOWN(1,"下架");

    private Integer code;
    private String message;

    ProductStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
