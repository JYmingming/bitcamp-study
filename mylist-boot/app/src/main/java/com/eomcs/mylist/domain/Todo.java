package com.eomcs.mylist.domain;

public class Todo implements java.io.Serializable {
  String title;
  boolean done;

  public Todo() {
    System.out.println("Todo() 호출됨!");
  }

  public Todo(String csvStr) {
    // 예) csvStr => "제목,완료여부"

    String[] values = csvStr.split(","); 
    this.setTitle(values[0]); 
    this.setDone(Boolean.valueOf(values[1]));
  }

  // 적용기술
  // => 스태틱 메서드 : 특정 인스턴스에 종속되지 않고 사용하는 메서드.
  // => GoF의 'Factory Method' 패턴
  //    객체 생성 과정이 복작할 경우 new 명령을 통해 직접 객체를 생성하는 대신에
  //    메서드를 통해 객체를 리턴 받는다.
  //    이렇게 객체를 만들어 주는 메서드를 "공장 메서드(factory method)"라 부른다.
  //    보통 스태틱 메서드로 정의한다.
  //
  public static Todo valueOf(String csvStr) {
    // 예) csvStr => "제목,완료여부"

    String[] values = csvStr.split(",");

    Todo todo = new Todo();
    todo.setTitle(values[0]); 
    todo.setDone(Boolean.valueOf(values[1]));

    return todo;
  }

  // 적용 기술
  // => 인스턴스 메서드: 특정 인스턴스를 사용한다면 인스턴스 메서드로 만들라! 
  // => GRASP의 Information Expert 패턴
  //    데이터를 가공하는 기능은 그 데이터를 갖고 있는 클래스에 둬야 한다.
  public String toCsvString() {
    return String.format("%s,%s", 
        this.getTitle(), 
        this.isDone());
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public boolean isDone() {
    return done;
  }
  public void setDone(boolean done) {
    this.done = done;
  }
  @Override
  public String toString() {
    return "Todo [title=" + title + ", done=" + done + "]";
  }


}
