package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam3")
public class Exam3 {

  @GetMapping("/test1")
  public String test1(){
    return "정수 : " + 21_0000_0000;
    //문자열과 숫자를 더하면? 
    //=>문자열 + (숫자 --> 문자열)= 한개의 문자열로 합친 다.
  }
  @GetMapping("/test2")
  public String test2(){
    return "정수 : " +  -21_0000_0000;
    //문자열과 숫자를 더하면? 
    //=>문자열 + (숫자 --> 문자열)= 한개의 문자열로 합친다.
  }


}



