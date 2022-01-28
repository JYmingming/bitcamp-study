package com.eomcs.app1;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[계산기 서버]");

    // 1) 클라이언트 App의 연결을 준비한다.
    ServerSocket serverSocket = new ServerSocket(8888);

    while (true) {

      // 2) 클라이언트의 연결 요청을 승인한다.
      //    - 리턴 값은 클라이언트와 연결된 정보
      System.out.println("클라이언트의 연결을 기다림!");
      Socket socket = serverSocket.accept(); // 클라이언트가 연결될 때까지 리턴하지 않는다. 기다린다.
      System.out.println("클라이언트와 연결됨!");

      Worker worker = new Worker(socket);
      worker.start();
      System.out.println("작업자에게 클라이언트 요청을 맡겼");
    }
    // 클라이언트와의 연결을 끊음
  }

}

