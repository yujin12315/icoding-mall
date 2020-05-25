package com.coding.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coding.mall.entity.Product;
import com.coding.mall.mapper.ProductMapper;
import com.coding.mall.query.ProductQuery;
import com.coding.mall.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Coding
 * @since 2020-01-08
 */
@Service
public class ProductService extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Override
    public void pageQuery(Page<Product> pageParam, ProductQuery productQuery) {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("id"); //排序

        if (productQuery==null){
            baseMapper.selectPage(pageParam,queryWrapper);
            return;
        }

        String productTitle = productQuery.getProductTitle();
        Integer status = productQuery.getStatus();
        String begin = productQuery.getBegin();
        String end = productQuery.getEnd();

        // 原来你们都是在SQL 中使用动态SQL实现
        if (!StringUtils.isEmpty(productTitle)){
            //column 数据库中的列
            queryWrapper.like("product_title",productTitle);
        }

        if (!StringUtils.isEmpty(status)){
            //column 数据库中的列
            queryWrapper.eq("status",status);
        }

        if (!StringUtils.isEmpty(begin)){
            //column 数据库中的列
            queryWrapper.ge("create_time",begin);
        }

        if (!StringUtils.isEmpty(end)){
            //column 数据库中的列
            queryWrapper.le("update_time",end);
        }

        baseMapper.selectPage(pageParam,queryWrapper);
    }
}
