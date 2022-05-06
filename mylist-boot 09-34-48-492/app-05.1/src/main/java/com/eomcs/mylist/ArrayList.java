package com.eomcs.mylist;

public class ArrayList {

  // 인스턴스 필드(변수)
  // => 인스턴스 필드는 new 명령을 통해 생성한다.
  Object[] list = new Object[5];
  int size = 0;

  static void add(ArrayList that, Object obj) {
    if (that.size == that.list.length) { 
      that.list = grow(that);
    }
    that.list[that.size++] = obj;
  }

  static Object[] grow(ArrayList that) {
    Object[] arr = new Object[newLength(that)];
    copy(that.list, arr);
    return arr;
  }

  static int newLength(ArrayList that) {
    return that.list.length + (that.list.length >> 1);
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

  static Object[] toArray(ArrayList that) {
    Object[] arr = new Object[that.size]; 
    for (int i = 0; i < that.size; i++) { 
      arr[i] = that.list[i]; 
    }
    return arr; 
  }

  static Object remove(ArrayList that, int index) {
    if (index < 0 || index >= that.size) { // 값이 저장된 위치가 무효한 인덱스라면 
      return null;
    }
    Object old = that.list[index];
    for (int i = index + 1; i < that.size; i++) {
      that.list[i - 1] = that.list[i];
    }
    that.size--;
    return old;
  }

  static Object set(ArrayList that, int index, Object obj) {
    if (index < 0 || index >= that.size) { // 값이 저장된 위치가 무효한 인덱스라면 
      return null;
    }
    Object old = that.list[index];
    that.list[index] = obj;
    return old;
  }
}










