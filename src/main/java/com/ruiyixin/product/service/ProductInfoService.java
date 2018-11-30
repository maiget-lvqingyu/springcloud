package com.ruiyixin.product.service;

import com.ruiyixin.product.model.ProductInfo;

import java.util.List;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2516:23
 */
public interface ProductInfoService {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    /**
     * 查询所有上架商品
     * @return
     */
    List<ProductInfo> findUpAllProductInfo();

}
