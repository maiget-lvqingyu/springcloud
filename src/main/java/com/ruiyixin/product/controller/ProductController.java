package com.ruiyixin.product.controller;

import com.ruiyixin.product.model.ProductCategory;
import com.ruiyixin.product.model.ProductInfo;
import com.ruiyixin.product.service.ProductCategoryService;
import com.ruiyixin.product.service.ProductInfoService;
import com.ruiyixin.product.utils.ResultUtils;
import com.ruiyixin.product.vo.ProductInfoVO;
import com.ruiyixin.product.vo.ProductVO;
import com.ruiyixin.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mr.lvqingyu
 * @date Created in 2018/11/2512:38
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/getProductList")
    public ResultVO<ProductVO> findListProduct(){
        //获取上架商品
        List<ProductInfo> allProductInfo = productInfoService.findUpAllProductInfo();
        //获取类目列表
        List<Integer> categoryTypeList = allProductInfo.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        //根据类目列表查询类目信息
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory category:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(category.getCategoryName());
            productVO.setCategoryType(category.getCategoryType());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for(ProductInfo info:allProductInfo){
                if(category.getCategoryType().equals(info.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(info,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultUtils.success(productVOList);
    }
}
