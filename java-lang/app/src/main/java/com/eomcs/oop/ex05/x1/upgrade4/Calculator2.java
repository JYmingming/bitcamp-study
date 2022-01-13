package com.eomcs.oop.ex05.x1.upgrade4;


public class Calculator2{

  com.eomcs.oop.ex05.x1.Calculator origin = new com.eomcs.oop.ex05.x1.Calculator();



  public void plus(int value) {
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

