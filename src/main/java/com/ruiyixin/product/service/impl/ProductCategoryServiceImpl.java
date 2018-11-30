package com.ruiyixin.product.service.impl;

import com.ruiyixin.product.dao.ProductCategoryRepository;
import com.ruiyixin.product.model.ProductCategory;
import com.ruiyixin.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2516:36
 */
@Service("productCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return categoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
