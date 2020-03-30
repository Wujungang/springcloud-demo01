package com.springcloud.provider.controller;


import com.springcloud.commonutil.entity.Book;
import com.springcloud.provider.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-03-24
 */
@RestController

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/book")
    public List<Book> getAllBookInfo(){
        List<Book> allBookInfo = bookService.getAllBookInfo();
        System.out.println("${server.port}");
        return allBookInfo;
    }



}

