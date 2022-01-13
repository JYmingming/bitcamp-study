package com.eomcs.oop.ex05.x2;

//기존 코드에 기능을 덧붙여 자동차를 만든다.

// 1)기존 코드에 기능 덧붙이기
// 

public class CarTest4 {

  public static void main(String[] args) {

    Engine car = new Engine();

    car.ChargeBattery(100);
    car.start();
    car.run();
    car.stop();
  }
}
