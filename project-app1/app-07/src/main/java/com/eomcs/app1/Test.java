package com.eomcs.app1;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    String str = "aaa bbb ccc ddd";

    String[] values = str.split(" ");
    System.out.println(values.length);
    String[] values2 = Arrays.copyOfRange(values, 1, values.length);
    for (String v : values2) {
      System.out.println(v);
    }

  }

}
