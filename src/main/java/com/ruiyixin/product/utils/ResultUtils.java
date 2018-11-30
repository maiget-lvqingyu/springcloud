package com.ruiyixin.product.utils;

import com.ruiyixin.product.enums.ResultStatus;
import com.ruiyixin.product.vo.ResultVO;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2517:59
 */
public class ResultUtils {

    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultStatus.SUCCESS.getCode());
        resultVO.setMessage(ResultStatus.SUCCESS.getMsg());
        resultVO.setData(data);
        return resultVO;
    }
}
