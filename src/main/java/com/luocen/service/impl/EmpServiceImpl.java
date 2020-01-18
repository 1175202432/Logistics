package com.luocen.service.impl;

import com.luocen.entity.Emp;
import com.luocen.mapper.EmpMapper;
import com.luocen.service.IEmpService;
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
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
