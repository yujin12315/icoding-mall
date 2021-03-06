package com.coding.mall.service.impl;

import com.coding.mall.entity.OrderProduct;
import com.coding.mall.mapper.OrderProductMapper;
import com.coding.mall.service.IOrderProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Coding
 * @since 2020-01-08
 */
@Service
public class OrderProductService extends ServiceImpl<OrderProductMapper, OrderProduct> implements IOrderProductService {

}
