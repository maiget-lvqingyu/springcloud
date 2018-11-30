package com.ruiyixin.product.service;

import com.ruiyixin.product.model.ProductCategory;

import java.util.List;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2516:36
 */
public interface ProductCategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
