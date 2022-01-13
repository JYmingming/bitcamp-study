package com.eomcs.oop.ex05.x3.app3;

import com.eomcs.oop.ex05.x2.CampingTrailer;

/* 애플리케이션을 만들 때 마다 Engine 클래스에 기능을 추가 
-> 한클래스가 많은 역할 수행
-> 애플리케이션을 만드는 입장에서는 불필요한 기능까지 가져가야 한다.
-> 기존 코드를 변경하다보면 버그가 추가 될 가능성이 높아진다.


 */
public class Engine {
  int cc;
  int valve;

  public void run() {

    if(trailer ==null) {
      System.out.println("엔진이 돈다!");
    }else {
      System.out.println("느릿느릿 조심히 움직인다!");
    }
  }
  public void start() {
    System.out.println("시동건다");
  }
  public void stop() {
    System.out.println("시동끈다");
  }

  CampingTrailer trailer;
  public void setTrailer(CampingTrailer trailer) {
    this.trailer = trailer;
  }



}

