package com.eomcs.mylist.dao;

import com.eomcs.mylist.domain.Todo;

public interface TodoDao {

  int countAll();

  Object[] findAll();

  void insert(Todo todo) throws Exception;

  Todo findByNo(int no);

  int update(int no, Todo todo) throws Exception;

  int updateDone(int no, boolean done) throws Exception;

  int delete(int no) throws Exception;
}











