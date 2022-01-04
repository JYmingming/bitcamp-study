package com.eomcs.oop.ex02;

// 1. 관련된 기능(메서드)을 묶어 분류하기 
// 2. 메서드에서 계산한 결과를 클래스 변수에 저장한다.
// 3. 인스턴스 변수로 바꿔서 결과를 개별적으로 관리한다.
// 4. 인스턴스 메서드로 바꿔서 인스턴스 주소를 this 변수에 받는다.
// 5. 클래스를 별도의 소스 파일로 분리한다.
// 6. 클래스를 패키지로 분류한다.
public class ExamTest2 {



  static class cal{

    int result =0;
    static void plus(cal c , int b) {
      c.result += b;
    }

    static void minus( cal c ,int b) {
      c.result -= b;
    }

    static void multiple(cal c ,int b) {
      c.result *= b;
    }

    static void divide(cal c , int b) {
      c.result /= b;
    }
  }





  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?

    // 계산 결과를 담을 변수를 준비한다.
    int result = 0;

    // 메서드를 호출하여 작업을 수행하고,
    // 리턴 결과는 로컬 변수에 저장한다.
    cal a1 = new cal();

    a1.plus(a1,3);


    System.out.printf("result = %d\n", result);
  }
}


// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타입 만들 때
// - 즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
// - 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.


