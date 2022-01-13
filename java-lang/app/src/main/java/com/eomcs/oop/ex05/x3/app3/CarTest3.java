package com.eomcs.oop.ex05.x3.app3;

// 캠핑카 만들기
// app1 에서 복제해 온 Engine 클래스에 기능 덧붙이기  


public class CarTest3 {

  public static void main(String[] args) {

    CampingTrailer trailer = new CampingTrailer();
    Engine car = new Engine();

    //car.setTrailer(trailer);
    car.start();
    car.run();
    car.stop();
  }
}
