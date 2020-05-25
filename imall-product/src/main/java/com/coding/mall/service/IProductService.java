package com.coding.mall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coding.mall.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coding.mall.query.ProductQuery;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Coding
 * @since 2020-01-08
 */
public interface IProductService extends IService<Product> {
    void pageQuery(Page<Product> pageParam, ProductQuery productQuery);
}
