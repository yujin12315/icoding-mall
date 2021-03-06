package com.coding.mall.service.impl;

import com.coding.mall.entity.Order;
import com.coding.mall.mapper.OrderMapper;
import com.coding.mall.service.IOrderService;
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
public class OrderService extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
