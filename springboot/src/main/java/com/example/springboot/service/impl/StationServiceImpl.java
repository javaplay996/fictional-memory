package com.example.springboot.service.impl;

import com.example.springboot.entity.Station;
import com.example.springboot.mapper.StationMapper;
import com.example.springboot.service.IStationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2023-03-12
 */
@Service
public class StationServiceImpl extends ServiceImpl<StationMapper, Station> implements IStationService {

}
