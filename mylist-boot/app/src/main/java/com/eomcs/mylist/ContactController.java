
package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 클라이언트 요청을 처리하는 역할
public class ContactController {
  String[] contacts =new String[5];
  int size=0;
  @RequestMapping("/contact/list")
  public Object list() {
    String[] contacts = {
        "aaa1,aaa@test.com,1111,비트캠프",
        "aaa1,aaa@test.com,1111,비트캠프",
        "aaa1,aaa@test.com,1111,비트캠프",
        "aaa1,aaa@test.com,1111,비트캠프",
        "aaa1,aaa@test.com,1111,비트캠프"
    };
    return contacts;
  }
  @RequestMapping("/contact/add")
  public Object add(String name,String email,String tel, String company) {
    String contact = name + ","+ email + "," + tel + "," + company;
    contacts[size++] = contact;
    return contact; 
  }
  @RequestMapping("/contact/get")
  public Object get(String email) {
    for(int i=0; i<size; i++) {
      if(contacts[i].split(",")[1].equals(email)) {
        return contacts[i]; 
      }

    }
    return "";
  } 
}  

