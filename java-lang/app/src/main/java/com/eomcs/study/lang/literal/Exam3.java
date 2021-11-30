package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam3")
public class Exam3 {

  @GetMapping("/test1")
  public String test1() {
    //return "정수: " + 21_4748_3648; // 컴파일 오류! 4 byte 메모리에 저장 X
    return "정수: " + 21_4748_3647;
    // 문자열과 숫자를 더하면?  문자열 + (숫자 -> 문자열) = 한 개의 문자열로 합침
  }

  @GetMapping("/test2")
  public String test2() {
    //  return "정수: " + -21_4748_3648; // 컴파일 오류! 4 byte 메모리에 저장 X
    return "정수: " + -21_4748_3648;
  }

  @GetMapping("/test3")
  public String test3() {
    return "정수: " + -21_4748_3649L; // OK! 리터럴을 저장할 때 8byte 메모리 사용하라고 표시
  }

  @GetMapping("/test4")
  public String test4() {
    return "정수: " + -21_4748_3649l; // OK!
  }

  @GetMapping("/test5")
  public String test5() {
    return "정수: " + 922_0000_0000_4748_3648L; // OK!
  }

  @GetMapping("/test6")
  public String test6() {
    return "정수: " + -922_0000_0000_4748_3648L; // OK!
  }

}