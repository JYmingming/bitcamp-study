package com.eomcs.study.lang.variable;

import java.util.Scanner;

public class test {
  static int[] stack;
  static int size = 0;


  public static void main(String[] args) throws Exception{
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    stack = new int[in.nextInt()];

    for(int i =0; i < stack.length; i++){
      String str = in.next();
      switch (str) {
        case "push":
          push(in.nextInt());
          break;
        case "pop":
          sb.append(pop()).append('\n');
          break;
        case "size":
          sb.append(size()).append('\n');
          break;
        case "empty":
          sb.append(empty()).append('\n');
          break;
        case "top":
          sb.append(top()).append('\n');
          break;
      }

    }
    System.out.println(sb);
  }






  static void push(int item) {
    stack[size] = item;
    size++;
  }
  static int pop() {
    if(size == 0) {
      return -1;
    }
    int result = stack[size - 1];
    stack[size - 1] = 0;
    size--;
    return result;

  }
  static int size() {
    return size;
  }

  static int empty() {
    if(size == 0) {
      return 1;
    }
    return 0;
  }
  static int top() {
    if(size == 0) {
      return -1;
    }
    return stack[size - 1];
  }
}




