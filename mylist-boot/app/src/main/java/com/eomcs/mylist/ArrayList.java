package com.eomcs.mylist;

public class ArrayList {
  static Contact[] contacts = new Contact[5];
  static int size = 0;


  // 기능:
  // - 이메일로 연락처 정보를 찾는다.
  // - 찾은 연락처의 배열 인덱스를 리턴한다.
  static int indexOf(String email) {
    for (int i = 0; i < size; i++) {
      Contact contact = contacts[i];
      if (contact.email.equals(email)) { 
        return i;
      }
    }
    return -1;
  }

  // 기능:
  // - 배열에서 지정한 항목을 삭제한다.
  //
  static Contact remove(int index) {
    Contact old = contacts[index];
    for (int i = index + 1; i < size; i++) {
      contacts[i - 1] = contacts[i];
    }
    size--;
    return old;
  }

  // 기능:
  // - 배열의 크기를 늘린다.
  // - 기존 배열의 값을 복사해온다.
  //
  static Contact[] grow() {
    Contact[] arr = new Contact[newLength()];
    copy(contacts, arr);
    return arr;
  }

  // 기능:
  // - 주어진 배열에 대해 50% 증가시킨 새 배열의 길이를 알려준다.
  //
  static int newLength() {
    return contacts.length + (contacts.length >> 1);
  }


  // 기능: 
  // - 배열을 복사한다.
  // 
  static void copy(Contact[] source, Contact[] target) {
    int length = source.length;
    if (target.length < source.length) {
      length = target.length;
    }
    for (int i = 0; i < length; i++) {
      target[i] = source[i];
    }
  }



}
