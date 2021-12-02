package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;


public class Excam6 {


  //\n - Line Feed(LF), 0x0a
  //\r - Carrage Return(CR), 0x0d
  //\f - Form Feed, 0x0c
  //\t - Tab, 0x09
  //\b - Backspace, 0x08
  //\' - Single Quote, 0x27
  //\" - Double Quote, 0x22
  //\\ - Backslash, 0x5c
  @GetMapping("/test1")
  public String test1() {


  }
  @GetMapping("/test2")
  public String test2() {


  }
  @GetMapping("/test3")
  public String test3() {


  }
  @GetMapping("/test4")
  public String test4() {


  }
  @GetMapping("/test5")
  public String test5() {
    return "012\b - Backspace, 0x08";

  }

}
