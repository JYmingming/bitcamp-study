package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/lang/literal/exam4")
public class Exam4 {


  @GetMapping("/test1")
  public String test1() {

    float value = 987.654321f;
    // 문자열을 표현하는 방법
    return "부동수점 :" +value;
  }

  @GetMapping("/test2")
  public String test2() {
    float value = 9876543.21f;
    // 문자열을 표현하는 방법
    return "부동수점 :" +value*100;
  }


}
