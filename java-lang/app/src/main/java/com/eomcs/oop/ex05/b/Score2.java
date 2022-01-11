// 기존의 클래스에 코드를 추가한다.
package com.eomcs.oop.ex05.b;

public class Score2 extends Score{

  public int music;
  public int art;

  // 기존 코드를 변경한다.
  public void computa() {
    this.sum = this.kor + this.eng + this.math + this.music + this.art + this.art + this.music;
    this.aver = this.sum / 5f;
  }
}







