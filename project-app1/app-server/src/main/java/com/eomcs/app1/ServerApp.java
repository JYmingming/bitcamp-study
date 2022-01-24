package com.eomcs.app1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ServerApp {

  public static void main(String[] args) throws Exception {

    ServerSocket serverSocket = new ServerSocket(9999);
    System.out.println("서버 실행!");
    System.out.println("클라이언트 연결을 기다리는 중...");

    Socket socket = serverSocket.accept();
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

    socket.close();
    serverSocket.close();
    System.out.println("Goodbye!");
  }

}







