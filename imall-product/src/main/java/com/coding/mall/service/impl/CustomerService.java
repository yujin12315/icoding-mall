package com.coding.mall.service.impl;

import com.coding.mall.entity.Customer;
import com.coding.mall.mapper.CustomerMapper;
import com.coding.mall.service.ICustomerService;
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
public class CustomerService extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
