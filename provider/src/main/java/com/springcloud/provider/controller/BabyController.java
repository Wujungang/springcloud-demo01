package com.springcloud.provider.controller;


import com.springcloud.provider.service.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-03-24
 */
@RestController
public class BabyController {
    @Autowired
    private BabyService babyService;

    @GetMapping("/baby")
    public String bby(){
        String res= babyService.insertBay();
        return res;
    }

}

