package com.eomcs.web.javascript;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex01Controller {


  @RequestMapping("/javascript/ex01/exam05_1")
  public Object exam05_1() {
    return "window.alert('okok')";

  }
  @RequestMapping("/javascript/ex01/exam05_2")
  public Object exam05_2() {
    return "window.alert('nono')";

  }

}
