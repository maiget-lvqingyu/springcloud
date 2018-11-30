package com.ruiyixin.product.vo;

import lombok.Data;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2517:00
 */
@Data
public class ResultVO<T> {

    private Integer code;
    private String message;
    private T data;

}
