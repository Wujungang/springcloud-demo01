package com.springcloud.provider.controller;


import com.springcloud.provider.entity.Book;
import com.springcloud.provider.service.BookService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String getAllBookInfo(){
        List<Book> books =  bookService.getAllBookInfo();
        return "123";
    }

}

