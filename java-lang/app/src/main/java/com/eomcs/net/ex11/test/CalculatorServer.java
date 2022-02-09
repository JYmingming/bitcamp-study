package com.eomcs.net.ex11.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {
  String logo;


  public CalculatorServer() {
    StringBuilder logoStr = new StringBuilder();
    try (BufferedReader welcomeIn = new BufferedReader(new FileReader("welcome.txt"));) {

      while (true) {
        String str = welcomeIn.readLine();
        if (str == null) {
          break;
        }
        logoStr.append("환영합니다! \n");
      }
    } catch (Exception e) {
      if(logoStr.length() > 0) {
        logoStr.setLength(0);
      }
      logoStr.append("환영합니다! \n");
    }
    logo = logoStr.toString();

  }//CalculatorServer

  public void lunch(int port) {
    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("서버 실행 중...");

      while (true) {
        new RequestHandler(serverSocket.accept()).start();
      }

    } catch (Exception e) {
      System.out.println("서버 소켓 생성 중 오류 발생!");
    }
  }

  class RequestHandler extends Thread{

    Socket socket;
    String logo;

    public RequestHandler(Socket socket) {
      this.socket = socket;

    }

    @Override
    public void run() {
      // TODO Auto-generated method stub
      try (
          Socket socket2 = socket;
          Scanner in = new Scanner(socket.getInputStream());
          PrintStream out = new PrintStream(socket.getOutputStream());
          ) {

        out.print(logo);
        out.println("계산식을 입력하세요!");
        out.println("예) 23 + 7 ");
        out.println();

        String str = in.nextLine();


        String[] values=str.split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[2]);
        String op = values[1];

        switch(op) {
          case "+": out.printf("%d %s %d = %d\n",a ,op ,b,a+b);break;
          case "-": out.printf("%d %s %d = %d\n",a ,op ,b,a-b);break;
          case "*": out.printf("%d %s %d = %d\n",a ,op ,b,a*b);break;
          case "/": out.printf("%d %s %d = %d\n",a ,op ,b,a/b);break;
          default: out.printf("지원하지 않는 연산자 입니다.");
        }
        out.flush();

      } catch (Exception e) {
        System.out.println("클라이언트 요청 처리 중 오류 발생!");
      }
    }

  }//RequestHandler




  public static void main(String[] args) {
    new CalculatorServer().lunch(8888);
  }


}
