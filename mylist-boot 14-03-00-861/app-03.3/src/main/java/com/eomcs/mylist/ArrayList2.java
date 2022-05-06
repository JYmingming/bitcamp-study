package com.eomcs.mylist;

public class ArrayList2 {

  static Todo[] list = new Todo[5];
  static int size = 0;

  static Todo remove(int index) {
    Todo old = list[index];
    for (int i = index + 1; i < size; i++) {
      list[i - 1] = list[i];
    }
    size--;
    return old;
  }

  static Todo[] grow() {
    Todo[] arr = new Todo[newLength()];
    copy(list, arr);
    return arr;
  }

  static int newLength() {
    return list.length + (list.length >> 1);
  }

  static void copy(Todo[] source, Todo[] target) {
    int length = source.length;
    if (target.length < source.length) {
      length = target.length;
    }
    for (int i = 0; i < length; i++) {
      target[i] = source[i];
    }
  }

  static Todo[] toArray() {
    Todo[] arr = new Todo[size]; 
    for (int i = 0; i < size; i++) { 
      arr[i] = list[i]; 
    }
    return arr; 
  }

  static void add(Todo contact) {
    if (size == list.length) { 
      list = grow();
    }
    list[size++] = contact;
  }

  static Todo set(int index, Todo contact) {
    if (index < 0 || index >= size) { // 값이 저장된 위치가 무효한 인덱스라면 
      return null;
    }
    Todo old = list[index];
    list[index] = contact;
    return old;
  }
}










