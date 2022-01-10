package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ContactController {

  @RequestMapping("/contact/list")
  public Object list() {
    return ArrayList.toArray(); 
  }

  @RequestMapping("/contact/add")
  public Object add(Contact contact) {
    //    System.out.println(contact);
    ArrayList.add(contact);
    return ArrayList.size;
  }


  @RequestMapping("/contact/get")
  public Object get(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return "";
    }

    return ArrayList.list[index];
  }

  @RequestMapping("/contact/update")
  public Object update(Contact contact) {
    int index = indexOf(contact.email);
    if (index == -1) {
      return 0;
    }

    return ArrayList.set(index, contact) == null ? 0 : 1;
  }

  @RequestMapping("/contact/delete")
  public Object delete(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return 0;
    }

    ArrayList.remove(index);
    return 1;
  }

  static int indexOf(String email) {
    for (int i = 0; i < ArrayList.size; i++) {
      Contact contact =  (Contact) ArrayList.list[i];
      if (contact.email.equals(email)) { 
        return i;
      }
    }
    return -1;
  }
}




