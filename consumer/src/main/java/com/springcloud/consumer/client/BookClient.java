package com.springcloud.consumer.client;


import com.springcloud.consumer.handler.BookClientExceptionHandlerService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Book;
import java.util.List;

@FeignClient(value="springcloudProvider",fallback = BookClientExceptionHandlerService.class)
@Component
public interface BookClient {
    @GetMapping("/book")
    public List getAllBookInfo();
}
