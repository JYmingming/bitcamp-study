// 클라이언트 + 키보드 입력
package com.eomcs.net.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender2 {

  public static void main(String[] args) throws Exception {
    System.out.println("클라이언트 실행!");

    Scanner keyScan = new Scanner(System.in);

    Socket socket = new Socket("192.168.0.3", 8888);

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    // 키보드 입력을 받아서 서버에게 전송한다.
    System.out.print("입력> ");
    String input = "111010111011000010010100111011001001110110110100111011001001100010100100111011001000101010100100001000001110110110010101101101001110110110000010101110011110110010011101100001000010000011101100100010111001110011101011100011111000010011101101100101011010100111101011100010111000100011101011100010111010010000101110";
    out.println(input);

    // 서버가 보낸 데이터를 수신한다.
    String str = in.nextLine();
    System.out.println(str);

    in.close();
    out.close();
    socket.close();
    keyScan.close();
  }

}


