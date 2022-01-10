package com.eomcs.oop.ex05.x1.test4;


//곱하기 계산 기능을 수행
public class CalculatorTest {

  public static void main(String[] args) {
    Calculator2 c = new Calculator2();
    c.plus(100);
    c.minus(200);
    c.multiple(2);
    System.out.println(c.result);
  }

}  

// 상속(Ingeritance)
// 1)특징
//  - 기존코드를 재사용 할 수 있다.
//  - ₩