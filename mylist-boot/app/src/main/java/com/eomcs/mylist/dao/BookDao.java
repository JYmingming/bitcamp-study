package com.eomcs.mylist.dao;

import org.apache.ibatis.annotations.Mapper;
import com.eomcs.mylist.domain.Book;

@Mapper // Mybatis 는 다음 인터페이스의 구현체를 자동으로 생성한다.

public interface BookDao {

  int countAll();

  Object[] findAll();

  void insert(Book book);

  Book findByNo(int no);

  int update(Book book);

  int delete(int no);
}











