package com.eomcs.oop.ex05.x1.test3;


//곱하기 계산 기능을 수행
public class CalculatorTest {

  public static void main(String[] args) {
    Calculator3 c = new Calculator3();
    c.plus(100);
    c.minus(200);
    c.multiple(2);
    System.out.println(c.result);
  }

}

// 기존 코드를 복제한 후 기능을 추가하는 방식의 문제점;;
// 1_ 같은 ㅗㅋ드가 여러클래스에 중복된다.
//  => 기능을 변경할 때  복제해서 만든 모든 코드를 변경해야 하는 번거로움이 있다.
//  => 예를 들어 원본 클래스에서 버그가 발견되을 때 ,
//      그 클래스를 복제해서 만든 모든 클래스에도 버그가 존재하기 때문에
//      원본 클래스 뿐만 아니라 복제해서 만든 모든 클래스를 수정해 줘야한다.

// 새 기능을 추가하기 위해 기존코드를 수정하는 경우 오류가 날 수있다.

