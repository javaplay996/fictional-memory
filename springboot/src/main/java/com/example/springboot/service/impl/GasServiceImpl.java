package com.example.springboot.service.impl;

import com.example.springboot.entity.Gas;
import com.example.springboot.mapper.GasMapper;
import com.example.springboot.service.IGasService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2023-03-13
 */
@Service
public class GasServiceImpl extends ServiceImpl<GasMapper, Gas> implements IGasService {

}
