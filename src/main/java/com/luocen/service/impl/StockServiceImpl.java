package com.luocen.service.impl;

import com.luocen.entity.Stock;
import com.luocen.mapper.StockMapper;
import com.luocen.service.IStockService;
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
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

}
