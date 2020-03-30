package com.springcloud.consumer.controller;


import com.springcloud.commonutil.entity.Book;
import com.springcloud.consumer.client.BookClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping
public class conController {
    @Autowired
    private BookClient bookClient;

    @GetMapping("/get")
    public List getinfo(){
        List<Book> allBookInfo = bookClient.getAllBookInfo();
        return allBookInfo;

    }

}
