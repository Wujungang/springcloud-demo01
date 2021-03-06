package com.springcloud.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springcloud.commonutil.entity.Book;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author testjava
 * @since 2020-03-24
 */
public interface BookService extends IService<Book> {

    List<Book> getAllBookInfo();
}
