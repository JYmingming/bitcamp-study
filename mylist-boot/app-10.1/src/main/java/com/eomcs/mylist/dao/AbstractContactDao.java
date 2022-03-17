package com.eomcs.mylist.dao;

import java.util.ArrayList;
import com.eomcs.mylist.domain.Contact;

public abstract class AbstractContactDao implements ContactDao {

  protected ArrayList<Contact> contactList = new ArrayList<>(); 

  protected abstract void save() throws Exception;

  @Override
  public int countAll() {
    return contactList.size();
  }

  @Override
  public Object[] findAll() {
    return contactList.toArray();
  }

  @Override
  public void insert(Contact contact) throws Exception {
    contactList.add(contact);
    save();
  }

  @Override
  public Contact findByEmail(String email) {
    int index = indexOf(email);
    if (index == -1)
      return null;
    return contactList.get(index);
  }

  @Override
  public int update(Contact contact) throws Exception {
    int index = indexOf(contact.getEmail());
    if (index == -1)
      return 0;

    contactList.set(index, contact);
    save();
    return 1;
  }

  @Override
  public int delete(String email) throws Exception {
    int index = indexOf(email);
    if (index == -1)
      return 0;

    contactList.remove(index);
    save();
    return 1;
  }

  private int indexOf(String email) {
    for (int i = 0; i < contactList.size(); i++) {
      Contact contact =  contactList.get(i);
      if (contact.getEmail().equals(email)) { 
        return i;
      }
    }
    return -1;
  }

}











