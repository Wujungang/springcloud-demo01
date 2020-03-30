package com.springcloud.provider.service.impl;

import com.springcloud.commonutil.entity.Book;
import com.springcloud.provider.mapper.BookMapper;
import com.springcloud.provider.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-03-24
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAllBookInfo() {
        List<Book> books = bookMapper.selectList(null);
        return books;
    }
}
