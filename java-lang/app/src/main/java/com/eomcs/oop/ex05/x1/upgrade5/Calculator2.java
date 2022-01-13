package com.eomcs.oop.ex05.x1.upgrade5;

import com.eomcs.oop.ex05.x1.Calculator;

// 5) 계산기 기능 확장 방법 5- 의존 객체주입 방식을 적용하여 기능 확장




public class Calculator2{

  com.eomcs.oop.ex05.x1.Calculator origin;


  public Calculator2(Calculator origin) {
    this.origin = origin;
  }

  public void plus(int value) {
    //이 클래스가 포함하고 있는 객체에게 실행을 위임한다.

    origin.plus(value);
  }
  public void minus(int value) {
    origin.minus(value);
  }
  public int getResult() {
    return origin.result; 
  }

  public void multiple(int value) {
    origin.result *= value; 
  }
}

