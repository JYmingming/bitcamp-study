package com.eomcs.mylist.service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.eomcs.mylist.domain.Board;

public interface BoardService {

  int add(Board board);

  List<Board> FindAll(@Param("rowCount")int rowCount ,@Param("offset")int offset);

  Board get(int no);

  int update(Board board);

  int delete(Board board);
  int size();
}






