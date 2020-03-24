package com.springcloud.consumer.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Book;
import java.util.List;

@FeignClient("springcloud-provider")
@Component
public interface BookClient {
    @GetMapping("/book")
    public String getAllBookInfo();
}
