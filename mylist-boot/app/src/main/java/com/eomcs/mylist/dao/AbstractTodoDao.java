package com.eomcs.mylist.dao;

import com.eomcs.mylist.domain.Todo;
import com.eomcs.util.ArrayList;

public abstract class AbstractTodoDao implements TodoDao {

  protected ArrayList todoList = new ArrayList(); 

  protected abstract void save() throws Exception;

  @Override
  public int countAll() {
    return todoList.size();
  }

  @Override
  public Object[] findAll() {
    return todoList.toArray();
  }

  @Override
  public void insert(Todo todo) throws Exception {
    todoList.add(todo);
    save();
  }

  @Override
  public Todo findByNo(int no) {
    if (no < 0 || no >= todoList.size()) {
      return null;
    }
    return (Todo) todoList.get(no);
  }

  @Override
  public int update(int no, Todo todo) throws Exception {
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }
    todoList.set(no, todo);
    save();
    return 1;
  }

  @Override
  public int updateDone(int no, boolean done) throws Exception {
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }
    ((Todo) todoList.get(no)).setDone(done);
    save();
    return 1;
  }

  @Override
  public int delete(int no) throws Exception {
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }
    todoList.remove(no);
    save();
    return 1;
  }

}











