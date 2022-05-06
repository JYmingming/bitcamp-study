package com.eomcs.mylist;

public class ArrayList3 {

  static Object[] list = new Object[5];
  static int size = 0;

  static void add(Object obj) {
    if (size == list.length) { 
      list = grow();
    }
    list[size++] = obj;
  }

  static Object[] grow() {
    Object[] arr = new Object[newLength()];
    copy(list, arr);
    return arr;
  }

  static int newLength() {
    return list.length + (list.length >> 1);
  }

  static void copy(Object[] source, Object[] target) {
    int length = source.length;
    if (target.length < source.length) {
      length = target.length;
    }
    for (int i = 0; i < length; i++) {
      target[i] = source[i];
    }
  }

  static Object[] toArray() {
    Object[] arr = new Object[size]; 
    for (int i = 0; i < size; i++) { 
      arr[i] = list[i]; 
    }
    return arr; 
  }

  static Object remove(int index) {
    Object old = list[index];
    for (int i = index + 1; i < size; i++) {
      list[i - 1] = list[i];
    }
    size--;
    return old;
  }

  static Object set(int index, Object obj) {
    if (index < 0 || index >= size) { // 값이 저장된 위치가 무효한 인덱스라면 
      return null;
    }
    Object old = list[index];
    list[index] = obj;
    return old;
  }
}










