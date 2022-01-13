package com.eomcs.oop.ex05.x3.app4;

public class CarTest4 {

  public static void main(String[] args) {
    // Engine클래스에하이브리드 추가하기
    // =>kwh 변수 추가
    // =>chargeBattery() 메서드 추가
    // =>run() 메서드 변경
    Engine car = new Engine();
    car.ChargeBattery(100);
    car.start();
    car.run();
    car.stop();
  }
}
