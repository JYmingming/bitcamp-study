package com.eomcs.io;

import java.io.FileWriter;

//위임 기법을 사용하용하여 기존 기능을확장하기

public class FileWriter2{

  FileWriter out;
  // 
  // 이 클래스의 생성자를 통해 FileWriter 객체를 준비한다.
  public FileWriter2(String filename)throws Exception {
    out = new FileWriter(filename);
  }
  // 한 줄 단위로 출력하는 기능을 추가한다.
  public void println(String str) throws Exception{
    //실제파일로 대이터를 출력하는 일은 FileWriter 객체에게 위임한다.
    out.write(str+"\n");
  }
  //자원을 해제시키는 일은 실제파일 출력을 수행하는 객체에게넘긴디ㅏ.
  public void close() throws Exception{
    out.close();
  }
}
