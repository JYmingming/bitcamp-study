package com.eomcs.study.lang.variable;

import java.util.Scanner;

public class test2 {
  static int num;

  public static void main(String[] args) throws Exception{
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int num = Integer.parseInt(in.nextLine());

    for(int i=0;i<num; i++) {
      String str = in.nextLine();
      sb.append(okok(str)+"\n");
    }
    System.out.println(sb);

  }



  static String okok(String str) {
    String[] strs = str.split("");
    int flag=0;
    //    if(strs[0].equals(")")|| strs[strs.length-1].equals("(")) {
    //      return "NO";
    //    }
    for(int i =0; i < strs.length; i++){
      if(strs[i].equals(")")) {
        flag--;
      }else {
        flag++;
      }
      if(flag==-1) {
        return "NO";
      }
    }//end for
    if(flag>0){
      return "NO";
    }//end if
    return "YES";
  }
}

