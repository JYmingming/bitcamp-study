package com.eomcs.mylist.dao;

import java.io.File;
import org.springframework.stereotype.Repository;
import com.eomcs.mylist.domain.Todo;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository  
public class JsonTodoDao extends AbstractTodoDao {

  String filename = "todos.json";

  public JsonTodoDao() {
    try {
      ObjectMapper mapper = new ObjectMapper();
      todoList.addAll(mapper.readValue(new File(filename), Todo[].class));

    } catch (Exception e) {
      System.out.println("해야 할 일 데이터 로딩 중 오류 발생!");
    }
  }

  @Override
  protected void save() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(new File(filename), todoList.toArray());
  }
}











