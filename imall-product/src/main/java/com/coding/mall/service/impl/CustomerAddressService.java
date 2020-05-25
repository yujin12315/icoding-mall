package com.coding.mall.service.impl;

import com.coding.mall.entity.CustomerAddress;
import com.coding.mall.mapper.CustomerAddressMapper;
import com.coding.mall.service.ICustomerAddressService;
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
public class CustomerAddressService extends ServiceImpl<CustomerAddressMapper, CustomerAddress> implements ICustomerAddressService {

}
