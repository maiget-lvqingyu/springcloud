package com.ruiyixin.product.enums;

import lombok.Getter;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2517:35
 */
@Getter
public enum ResultStatus {
    SUCCESS(0,"成功"),
    FAIL(1,"失败");

    private Integer code;
    private String msg;

    ResultStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
