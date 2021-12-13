package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My1Controller {
  String[] contacts = new String[5];
  int size = 0;

  @RequestMapping("/my1/list")
  public Object list() {
    String[] arr = new String[size]; // 배열에 저장된 값만 복사할 새 배열을 만든다.
    for (int i = 0; i < size; i++) { 
      arr[i] = contacts[i]; // 전체 배열에서 값이 들어 있는 항목만 복사한다.
    }
    return arr; // 복사한 항목들을 담고 있는 새 배열을 리턴한다.
  }


  @RequestMapping("my1/add")
  public Object add(String userId, String tier, String position,String champ) {
    String contact = userId + "," + tier + "," + position +","+ champ;
    contacts[size++] = contact;
    return size;

  }
  @RequestMapping("/my1/get")
  public Object get(String userId) {
    for (int i = 0; i < size; i++) {
      if (contacts[i].split(",")[0].equals(userId)) { // 예) "u1@test.com"
        return contacts[i];
      }
    }
    return "";
  }
  @RequestMapping("/my1/update")
  public Object update(String userId, String tier, String position,String champ) {
    String contact = userId + "," + tier + "," + position +","+ champ;
    return 0;
  }


  @RequestMapping("/my1/delete")
  public Object delete(String userId) {
    for (int i = 0; i < size; i++)
      if (contacts[i].split(",")[0].equals(userId)) { 
        for (int j = i + 1; j < size; j++) {
          contacts[j - 1] = contacts[j];
        }
        size--;
        return 1;
      }

    return 0;
  }


}//end class







