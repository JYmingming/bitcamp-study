package com.eomcs.mylist.domain;

import java.sql.Date;

public class Book implements java.io.Serializable {
  String title;
  String author;
  String press;
  int page;
  int price;
  Date readDate;
  String feed;

  public Book() {
    System.out.println("Book() 호출됨!");
  }

  public Book(String csvStr) {
    // 예) csvStr => "제목,저자,출판사,페이지,가격,독서일,소감"

    String[] values = csvStr.split(","); 
    this.setTitle(values[0]); 
    this.setAuthor(values[1]);
    this.setPress(values[2]);
    this.setPage(Integer.valueOf(values[3]));
    this.setPrice(Integer.valueOf(values[4]));
    if (!values[5].equals("null")) {
      this.setReadDate(Date.valueOf(values[5]));
    }
    this.setFeed(values[6]);
  }

  // 적용기술
  // => 스태틱 메서드 : 특정 인스턴스에 종속되지 않고 사용하는 메서드.
  // => GoF의 'Factory Method' 패턴
  //    객체 생성 과정이 복작할 경우 new 명령을 통해 직접 객체를 생성하는 대신에
  //    메서드를 통해 객체를 리턴 받는다.
  //    이렇게 객체를 만들어 주는 메서드를 "공장 메서드(factory method)"라 부른다.
  //    보통 스태틱 메서드로 정의한다.
  //
  public static Book valueOf(String csvStr) {
    // 예) csvStr => "제목,저자,출판사,페이지,가격,독서일,소감"

    String[] values = csvStr.split(",");

    Book book = new Book();
    book.setTitle(values[0]); 
    book.setAuthor(values[1]);
    book.setPress(values[2]);
    book.setPage(Integer.valueOf(values[3]));
    book.setPrice(Integer.valueOf(values[4]));
    if (!values[5].equals("null")) {
      book.setReadDate(Date.valueOf(values[5]));
    }
    book.setFeed(values[6]);

    return book;
  }

  // 적용 기술
  // => 인스턴스 메서드: 특정 인스턴스를 사용한다면 인스턴스 메서드로 만들라! 
  // => GRASP의 Information Expert 패턴
  //    데이터를 가공하는 기능은 그 데이터를 갖고 있는 클래스에 둬야 한다.
  public String toCsvString() {
    return String.format("%s,%s,%s,%d,%d,%s,%s", 
        this.getTitle(), 
        this.getAuthor(), 
        this.getPress(), 
        this.getPage(),
        this.getPrice(),
        this.getReadDate(),
        this.getFeed());
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getPress() {
    return press;
  }
  public void setPress(String press) {
    this.press = press;
  }
  public int getPage() {
    return page;
  }
  public void setPage(int page) {
    this.page = page;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public Date getReadDate() {
    return readDate;
  }
  public void setReadDate(Date readDate) {
    this.readDate = readDate;
  }
  public String getFeed() {
    return feed;
  }
  public void setFeed(String feed) {
    this.feed = feed;
  }


}
