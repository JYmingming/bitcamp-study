package com.eomcs.app1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[계산기 클라이언트]");

    Scanner keyScan = new Scanner(System.in);

    //1) 서버 애플리케이션과 네트워크 연결을 수행한다.
    Socket socket = new Socket("localhost", 8888);
    System.out.println("서버와 연결됨!");


    //데이터를 주고 받기 위한 입출력 스트림을 준비한다.
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    //서버에데이터를 보낸다.
    out.println("강사");
    String response = in.nextLine();
    System.out.println("==>"+ response);

    //    while (true) {
    //      System.out.print("> ");
    //      String input = keyScan.nextLine();
    //      out.println(input);
    //
    //      if (input.equals("quit") || input.equals("exit")) {
    //        break;
    //      }
    //
    //      while (true) {
    //        String result = in.nextLine();
    //        if (result.equals("")) {
    //          break;
    //        }
    //        System.out.println(result);
    //      }
    //    }

    socket.close();
    keyScan.close();
  }

}







