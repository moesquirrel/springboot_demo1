package cn.yaya.controller;

import cn.yaya.pojo.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
public class BookController {
    @GetMapping("/showBook")
    public Book showBook(){
        Book book = new Book();
        book.setAuthor("张牙牙");
        book.setName("牙牙历险记");
        book.setPrice(20f);
        book.setPublicationDate(new Date());
        return book;
    }
}
