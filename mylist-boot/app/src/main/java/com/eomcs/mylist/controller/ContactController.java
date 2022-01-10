package com.eomcs.mylist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.io.FileWriter2;
import com.eomcs.mylist.domain.Contact;
import com.eomcs.util.ArrayList;

@RestController 
public class ContactController {

  ArrayList contactList;

  public ContactController() throws Exception {
    contactList = new ArrayList();
    System.out.println("ContactController() 호출됨!");

    com.eomcs.io.FileReader2 in = new com.eomcs.io.FileReader2("contacts.csv");

    StringBuilder buf = new StringBuilder();
    int c;
    while ((c = in.read()) != -1) {// 파일에서 한 문자를 읽는다. 더이상 읽을 문자가 없으면 반복문을 종료하다.
      if (c == '\n') { // 만약 읽은 문자가 줄바꿈 명령이라면, 지금까지 읽은 CSV 데이터를 분석하여 Contact 객체에 담는다.
        contactList.add(Contact.valueOf(buf.toString())); // 파일에서 읽은 CSV 데이터로 객체를 초기화시킨후 목록에 등록한다.

      }else if(c=='\r'){
        //무시 ! 
      } else { // 문자를 읽을 때 마다 버퍼이 임시 보관한다.
        buf.append((char) c);
      }
    }

    in.close();
  }

  @RequestMapping("/contact/list")
  public Object list() {
    return contactList.toArray(); 
  }

  @RequestMapping("/contact/add")
  public Object add(Contact contact) {
    //    System.out.println(contact);
    contactList.add(contact);
    return contactList.size();
  }


  @RequestMapping("/contact/get")
  public Object get(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return "";
    }
    return contactList.get(index);
  }

  @RequestMapping("/contact/update")
  public Object update(Contact contact) {
    int index = indexOf(contact.getEmail());
    if (index == -1) {
      return 0;
    }

    return contactList.set(index, contact) == null ? 0 : 1;
  }

  @RequestMapping("/contact/delete")
  public Object delete(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return 0;
    }

    contactList.remove(index);
    return 1;
  }

  @RequestMapping("/contact/save")
  public Object save() throws Exception {
    FileWriter2 out = new FileWriter2("contacts.csv"); // 따로 경로를 지정하지 않으면 파일은 프로젝트 폴더에 생성된다.

    Object[] arr = contactList.toArray();
    for (Object obj : arr) {
      Contact contact = (Contact) obj;
      out.println(contact.toCsvString());
    }

    out.close();
    return arr.length;
  }

  int indexOf(String email) {
    for (int i = 0; i < contactList.size(); i++) {
      Contact contact =  (Contact) contactList.get(i);
      if (contact.getEmail().equals(email)) { 
        return i;
      }
    }
    return -1;
  }
}




