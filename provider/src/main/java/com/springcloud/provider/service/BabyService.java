package com.springcloud.provider.service;

import com.springcloud.commonutil.entity.Baby;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author testjava
 * @since 2020-03-24
 */
public interface BabyService extends IService<Baby> {

    String insertBay();
}
