package com.eomcs.app1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

  public static void main(String[] args) throws Exception {

    Scanner keyScan = new Scanner(System.in);

    Socket socket = new Socket("localhost", 9999);
    System.out.println("서버와 연결됨!");

    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());

    while (true) {
      System.out.print("> ");
      String input = keyScan.nextLine();
      out.println(input);

      if (input.equals("quit") || input.equals("exit")) {
        break;
      }

      while (true) {
        String result = in.nextLine();
        if (result.equals("")) {
          break;
        }
        System.out.println(result);
      }
    }

    socket.close();
    keyScan.close();
  }

}







