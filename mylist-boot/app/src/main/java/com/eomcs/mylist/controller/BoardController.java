package com.eomcs.mylist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Board;
import com.eomcs.mylist.service.BoardService;

@RestController 
public class BoardController {

  @Autowired
  BoardService boardService;


  @RequestMapping("/board/add")
  public Object add(Board board) {
    return boardService.add(board);
  }

}




