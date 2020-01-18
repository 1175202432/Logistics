package com.luocen.service.impl;

import com.luocen.entity.Orders;
import com.luocen.mapper.OrdersMapper;
import com.luocen.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
