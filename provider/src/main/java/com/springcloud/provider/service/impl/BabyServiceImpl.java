package com.springcloud.provider.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.commonutil.entity.Baby;
import com.springcloud.provider.mapper.BabyMapper;
import com.springcloud.provider.service.BabyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-03-24
 */
@Service
public class BabyServiceImpl extends ServiceImpl<BabyMapper, Baby> implements BabyService {
    @Autowired
    private BabyMapper babyMapper;

    @Override
    public String insertBay() {
        Baby baby = new Baby();
        baby.setName("wujg");
        int insert = babyMapper.insert(baby);
        return ""+insert;
    }
}
