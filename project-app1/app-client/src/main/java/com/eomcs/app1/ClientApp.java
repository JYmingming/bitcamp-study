package com.eomcs.app1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[계산기 클라이언트]");

    Scanner keyScan = new Scanner(System.in);

    System.out.print("요청 (형식: 서버주고/연산자/값1/값2 ");
    String input = keyScan.nextLine();

    if(input.equals("exit") || input.equals("quit")) {
      System.out.println("종료!");

    }



    int slashPos = input.indexOf("/"); 
    String serverAddess = input.substring(0, slashPos);
    String queryString = input.substring(slashPos+1);


    // 1) 서버 애플리케이션과 네트워크 연결을 수행한다.
    Socket socket = new Socket(serverAddess, 8888); // 서버와 연결될 때까지 객체를 생성하지 않는다.
    //    Socket socket = new Socket("localhost", 8888); 
    System.out.println("서버와 연결되었음!");

    // 데이터를 주고 받기 위한 입출력 스트림을 준비한다.
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in =new Scanner(socket.getInputStream());

    // 만약 연산자가 / 일 경우 %2f 문자로 교체한다.
    if(queryString.startsWith("/")) {
      queryString=queryString.replaceFirst("/", "%2f"); // 서버에 보내느 데이터 형식에 어긋나지 않도록 인코딩 한다 .
    }

    // 서버에 데이터를 보낸다.
    out.println(input);

    // 서버가 응답한 데이터를 읽는다.
    String response = in.nextLine(); // 서버가 한 줄의 문자열을 보낼 때까지 리턴하지 않는다.
    System.out.println("==>" + response);

    // 입출력 도구를 다 사용했으면 자원을 해제한다.
    out.close();
    in.close();

    // 서버 애플리케이션과 연결된 것을 끊는다.
    socket.close();
    System.out.println("서버와 연결 종료!");
  }

}