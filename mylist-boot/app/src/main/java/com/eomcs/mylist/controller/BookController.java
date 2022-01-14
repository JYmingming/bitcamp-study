package com.eomcs.mylist.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.io.FileWriter2;
import com.eomcs.mylist.domain.Book;
import com.eomcs.util.ArrayList;

@RestController 
public class BookController {

  ArrayList bookList = new ArrayList();

  public BookController() throws Exception {
    System.out.println("BookController() 호출됨!");

    BufferedReader in2 = new BufferedReader(new FileReader("books.csv")); //주 객체에데코레이터 객체를 연결 


    String line;
    while ((line = in2.readLine()) != null) { // readLine() Null 을 리턴한다면 파일을 다 읽었다는 것이다 .
      bookList.add(Book.valueOf(line)); 
    }

    in2.close();
  }

  @RequestMapping("/book/list")
  public Object list() {
    return bookList.toArray(); 
  }

  @RequestMapping("/book/add")
  public Object add(Book book) {
    bookList.add(book);
    return bookList.size();
  }


  @RequestMapping("/book/get")
  public Object get(int index) {
    if (index < 0 || index >= bookList.size()) {
      return "";
    }
    return bookList.get(index);
  }

  @RequestMapping("/book/update")
  public Object update(int index, Book book) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }
    return bookList.set(index, book) == null ? 0 : 1;
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }
    return bookList.remove(index) == null ? 0 : 1;
  }

  @RequestMapping("/book/save")
  public Object save() throws Exception {
    
    PrintWriter out2 =new PrintWriter(new FileWriter2("books.csv"));
    
    
    Object[] arr = bookList.toArray();
    for (Object obj : arr) {
      Book book = (Book) obj;
      out.println(book.toCsvString());
    }

    out.close();
    return arr.length;
  }
}




