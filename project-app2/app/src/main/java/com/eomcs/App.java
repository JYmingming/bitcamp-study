/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    while(true) {

      System.out.println("메뉴:");
      System.out.println("1. 등록");
      System.out.println("2. 목록");
      System.out.println("3. 상세");
      System.out.println("4. 변경");
      System.out.println("5. 삭제");

      System.out.print("명령> ");
      String input = keyScan.nextLine();
      if(input.equals("quit") || input.equals("exit")) {
        break;
      }

      switch (input) {
        case "1":
          break;
        case "2":
          break;
        case "3":
          break;
        case "4":
          break;
        case "5":
        default:
          System.out.println("올바른 입력을 해주세요");

      }

    }
    System.out.println("종료!");
    keyScan.close();
  } 
}
