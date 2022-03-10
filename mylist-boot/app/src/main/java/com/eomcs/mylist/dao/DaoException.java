package com.eomcs.mylist.dao;

public class DaoException extends RuntimeException{

  private static final long serialVersionUID = 1L;

  //runtimeException은 unchecked exeption 이다.
  // 즉 이타입의 예외를 던질경우 메서드 선언부에 어떤 예외를 던지지 선얼할 필요가 없다.
  // 컴파일러는 RuntimeException 예욍[ 대해서는 올바르게 처리하였느지 검사하지않는다.
  // 그래서 RuntimeException 계열의 예외를 unchecked exception 이라 부른다 .
  public DaoException() {
    super();
    // TODO Auto-generated constructor stub
  }

  public DaoException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  public DaoException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  public DaoException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  public DaoException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }

}
