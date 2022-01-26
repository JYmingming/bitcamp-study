package com.eomcs.mylist.controller;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.dao.JsonBookDao;
import com.eomcs.mylist.domain.Book;

@RestController 
public class BookController {

  JsonBookDao bookDao = new JsonBookDao();

  @RequestMapping("/book/list")
  public Object list() {
    return bookDao.findAll(); 
  }

  @RequestMapping("/book/add")
  public Object add(Book book) throws Exception {
    book.setReadDate(new Date(System.currentTimeMillis()));
    bookDao.insert(book);
    return bookDao.countAll();
  }


  @RequestMapping("/book/get")
  public Object get(int index) throws Exception {
    Book book = bookDao.findByNo(index);
    if (book == null) {
      return "";
    }
    bookDao.increaseViewCount(index);
    return book;
  }

  @RequestMapping("/book/update")
  public Object update(int index, Book book) throws Exception {
    Book old = bookDao.findByNo(index);
    if (old == null) {
      return 0;
    }




    return bookDao.update(index, book);
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) throws Exception {
    return bookDao.delete(index);
  }
}




