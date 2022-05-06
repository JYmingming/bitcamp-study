package com.eomcs.mylist.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.dao.ContactDao;
import com.eomcs.mylist.domain.Contact;
import com.eomcs.mylist.domain.ContactTel;

@RestController 
public class ContactController {

  @Autowired
  ContactDao contactDao;

  @RequestMapping("/contact/list")
  public Object list() {
    List<Contact> contacts = contactDao.findAll();
    for (Contact contact : contacts) {
      contact.setTels(contactDao.findTelByContactNo(contact.getNo()));
    }
    return contacts;
  }

  @RequestMapping("/contact/add")
  public Object add(Contact contact, String[] tel) throws Exception {
    contactDao.insert(contact);
    for (int i = 0; i < tel.length; i++) {
      String[] value = tel[i].split("_");
      if (value[1].length() == 0) {
        continue;
      }
      contactDao.insertTel(new ContactTel(contact.getNo(), Integer.parseInt(value[0]), value[1]));
    }
    return 1;
  }

  @RequestMapping("/contact/get")
  public Object get(int no) {
    Contact contact = contactDao.findByNo(no);
    if (contact == null) {
      return "";
    }
    contact.setTels(contactDao.findTelByContactNo(no));
    return contact;
  }

  @RequestMapping("/contact/update")
  public Object update(Contact contact, String[] tel) throws Exception {
    int count = contactDao.update(contact);
    if (count > 0) {
      contactDao.deleteTelByContactNo(contact.getNo());
      for (int i = 0; i < tel.length; i++) {
        String[] value = tel[i].split("_");
        if (value[1].length() == 0) {
          continue;
        }
        contactDao.insertTel(new ContactTel(contact.getNo(), Integer.parseInt(value[0]), value[1]));
      }
    }
    return count;
  }

  @RequestMapping("/contact/delete")
  public Object delete(int no) throws Exception {
    contactDao.deleteTelByContactNo(no);
    return contactDao.delete(no);
  }

}




