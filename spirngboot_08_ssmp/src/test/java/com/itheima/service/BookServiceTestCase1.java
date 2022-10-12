package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase1 {
    @Autowired
    private IBookService ibookService;
    @Test
    void testGetById(){
        System.out.println(ibookService.getById(4));

    }
    @Test
    void testGetByid(){
        System.out.println(ibookService.list());

    }
    @Test
    void testGetPage(){
        IPage<Book> page=new Page<>(2,5);
        ibookService.page(page);
        System.out.println(page.getCurrent());
    }
}
