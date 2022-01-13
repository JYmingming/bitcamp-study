package com.eomcs.oop.ex05.x2;

/* 애플리케이션을 만들 때 마다 Engine 클래스에 기능을 추가 
-> 한클래스가 많은 역할 수행
-> 애플리케이션을 만드는 입장에서는 불필요한 기능까지 가져가야 한다.
-> 기존 코드를 변경하다보면 버그가 추가 될 가능성이 높아진다.


 */
public class Engine {
  int cc;
  int valve;

  public void run() {
    //하이브리드 전기차 기능을 추가
    if(kwh >0 ) {
      System.out.println("전기로 간다!");
      return;
    }

    if(trailer ==null) {
      System.out.println("씽씽달린다 !");
    }else {
      System.out.println("느릿느릿 조심히 움직인다!");
    }
  }


  //트레일러를 달고 움직이는 경우는 좀 복잡하니까 구분한다.
  //그래서 트레일러를 이용 할 경우를 고려해서 새로 run2() 메서드를 추가한다.
  public void run2() {

  }
  public void start() {
    System.out.println("시동건다");
  }
  public void stop() {
    System.out.println("시동끈다");
  }


  // 트럭기능 추가
  public void dump() {
    System.out.println("짐 내린다");
  }


  CampingTrailer trailer;
  public void setTrailer(CampingTrailer trailer) {
    this.trailer = trailer;
  }

  //하이브리드기능 추가
  int kwh;
  public void ChargeBattery(int kwh) {
    this.kwh=kwh;
  }



}


