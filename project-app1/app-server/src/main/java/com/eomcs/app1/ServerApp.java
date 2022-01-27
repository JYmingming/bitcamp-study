package com.eomcs.app1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ServerApp {

  public static void main(String[] args) throws Exception {


    //1) 클라이언트 App의 연결을 준비한다
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행!");

    //2) 클라이언트의 연결 요청을 승인한다.
    // - 리턴값은 클라이언트와 연결된 정보 
    System.out.println("클라이언트 연결을 기다리는 중...");
    Socket socket = serverSocket.accept(); // 클라이언트가 연결될 때까지 리턴하지 않는다.
    System.out.println("클라이언트와 연결됨!");



    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());

    CommandHandler commandHandler = new CommandHandler(out);

    while (true) {

      String[] values = in.nextLine().split(" "); 
      Command command = new Command(values[0], Arrays.copyOfRange(values, 1, values.length));

      if (command.getName().equals("quit") || command.getName().equals("exit")) {
        break;

      } else if (command.getName().equals("")) {
        continue;

      } else if (command.getName().equals("help")) {
        commandHandler.doHelp();

      } else if (command.getName().equals("add")) {
        commandHandler.doAdd(command);

      } else if (command.getName().equals("minus")) {
        commandHandler.doMinus(command);

      } else if (command.getName().equals("multiple")) {
        commandHandler.doMultiple(command);

      } else {
        out.println("지원하지 않는 연산자입니다.");
      }
      out.println();
    }


    //클라이언트와의 연결을 끊음
    socket.close();
    System.out.println("클라이언트 연결종료!");

    //서버쪽 연결도구 종료!
    serverSocket.close();
    System.out.println("서버 종료!");
  }

}







