package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class TodoController {

  // Todo 객체 목록을 저장할 메모리를 준비한다.
  ArrayList todoList = new ArrayList();

  @RequestMapping("/todo/list")
  public Object list() {
    return ArrayList.toArray(todoList); 
  }

  @RequestMapping("/todo/add")
  public Object add(Todo todo) {
    ArrayList.add(todoList, todo);
    return todoList.size;
  }

  @RequestMapping("/todo/update")
  public Object update(int index, Todo todo) {
    if (index < 0 || index >= todoList.size) {
      return 0;
    }

    return ArrayList.set(todoList, index, todo) == null ? 0 : 1;
  }

  @RequestMapping("/todo/check")
  public Object check(int index, boolean done) {
    if (index < 0 || index >= todoList.size) {
      return 0;  // 인덱스가 무효해서 설정하지 못했다.
    }

    ((Todo) todoList.list[index]).done = done;
    return 1; // 해당 항목의 상태를 변경했다.
  }

  @RequestMapping("/todo/delete")
  public Object delete(int index) {
    if (index < 0 || index >= todoList.size) {
      return 0;
    }

    ArrayList.remove(todoList, index);
    return 1;
  }
}




