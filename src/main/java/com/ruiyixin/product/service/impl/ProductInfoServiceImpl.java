package com.ruiyixin.product.service.impl;

import com.ruiyixin.product.dao.ProductInfoRepository;
import com.ruiyixin.product.enums.ProductStatus;
import com.ruiyixin.product.model.ProductInfo;
import com.ruiyixin.product.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2516:24
 */
@Service("productInfoService")
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findByProductStatus(Integer productStatus) {
        return productInfoRepository.findByProductStatus(productStatus);
    }

    @Override
    public List<ProductInfo> findUpAllProductInfo() {
        return productInfoRepository.findByProductStatus(ProductStatus.UP.getCode());
    }
}
