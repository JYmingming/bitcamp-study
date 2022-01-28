package com.eomcs.app1;

import java.io.PrintStream;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.Scanner;

public class Worker extends Thread{

  Socket socket;

  public Worker(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {

    try {
      Scanner in = new Scanner(socket.getInputStream());
      PrintStream out = new PrintStream(socket.getOutputStream());



      String requestLine = in.nextLine();
      System.out.println(requestLine);
      // 나머지 데이터는 버린다.
      while(true) {
        String str  =in.nextLine();
        if(str.length()==0) {
          break;
        }
      }

      String requertUri = requestLine.split(" ")[1]; // 예) GET/plus/100/200 HTTP/1.1 
      String[] values= requertUri.split("/");





      if(values.length == 4) {
        String op = URLDecoder.decode(values[1],"UTF-8");
        int a =Integer.parseInt(values[2]);
        int b =Integer.parseInt(values[3]);
        String response= null;

        int result = 0;
        switch (op) {
          case "+": 
            result = a + b;
            out.printf("크게 고장난 계산기: %d %s %d = %d\n", a, op, b, result*3);
            break;
          case "-": 
            result = a - b; 
            out.printf("크게 고장난 계산기: %d %s %d = %d\n", a, op, b, result*3);
            break;
          case "*":
            result = a * b;
            out.printf("크게 고장난 계산기: %d %S %d = %d\n", a, op, b, result*3);
          case "/":
            result = a / b;
            out.printf("크게 고장난 계산기: %d %S %d = %d\n", a, op, b, result*3);
          default: 
            out.println("크게 고장난 계산기: 지원하지 않는 연산자입니다.");
        }
      }
      else {
        out.println("양식이 틀렸습니다.");

      }





      socket.close();
      System.out.println("클라이언트 연결 종료!");
    }catch(Exception e) {
      e.printStackTrace();
    }
  }



  // HTTP 응답 데이터 보내기 
  private void writeResponse(PrintStream out,String messegeBody)throws Exception {
    out.println("HTTP/1.1 200 OK");
    out.println("Content-Type: text/plain; charset=UTF-8");
    out.println();
    out.println(messegeBody);
    out.flush();
  }
}


