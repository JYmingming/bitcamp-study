package com.eomcs.app1;

public class App {
  public static void main(String[] args) {
    if (args[0].equals("add")) {
      int v1 = Integer.parseInt(args[1]);
      int v2 = Integer.parseInt(args[2]);
      System.out.printf("%d + %d = %d\n", v1, v2, (v1 + v2));
    }
  }
}
