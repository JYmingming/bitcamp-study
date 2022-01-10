package com.eomcs.io;

import java.io.FileReader;

// 기존 코드를 자신의 코드인양 사용하기위해 해당 클래스를 포함한다.
public class FileReader2 {


  FileReader in;

  public FileReader2(String filename) throws Exception {

    in = new FileReader(filename); 

  }
  public String readLine() throws Exception{
    StringBuilder buf = new StringBuilder();
    int c;
    while ((c = in.read()) != -1 ) {  // 파일에서 한 문자를 읽는다. 더이상 읽을 문자가 없으면 반복문을 종료한다.
      if(c == '\n') {   // 만약 읽은 문자가 줄바꿈 명령이라면 , 지금까지 버퍼에 저잦ㅇ한 문자를 리턴한다.
        return buf.toString();
      }else if (c == '\r') {
        // 무시! CR (Carrage Return ; \r) 코드는 버퍼에 담지말고 버린다.
      }else {
        buf.append((char) c);
      }
    }
    return buf.toString();

  }
  public void close() throws Exception{
    in.close();
  }


}

