# 08.3 DAO 역할 도입: 상속의 generalization을 수행하여 추상 클래스 정의하기

- 추상 클래스 문법을 활용하여 서브 클래스의 공통 코드를 유지보수 하기 쉽게
  한 클래스로 모아 둔다.

## 백엔드 개발 실습

### 1단계 - XxxBoardDao 클래스에 대해 generalization을 수행한다.

- com.eomcs.mylist.dao.AbstractBoardDao 클래스 생성
  - XxxBoardDao 클래스의 공통 코드를 가져온다.
  - BoardDao 인터페이스를 구현한다.

### 2단계 - XxxBoardDao 클래스의 수퍼 클래스를 AbstractBoardDao로 변경한다.
- com.eomcs.mylist.dao.XxxBoardDao 클래스 변경
  - AbstractBoardDao 클래스를 상속 받는다.
  - save() 추상 메서드를 구현한다.
  - 수퍼 클래스에서 상속 받은 메서드인 경우 서브 클래스에서 제거한다.

### 3단계 - BookController, ContactController, TodoController 클래스에서 데이터 처리 코드를 DAO 클래스로 분리한다.

- BookController 변경
  - com.eomcs.mylist.dao.BookDao 인터페이스 생성
  - com.eomcs.mylist.dao.AbstractBookDao 추상 클래스 생성
  - com.eomcs.mylist.dao.JsonBookDao 일반 클래스 생성
  - com.eomcs.mylist.controller.BookController 클래스 변경
- ContactController 변경
  - com.eomcs.mylist.dao.ContactDao 인터페이스 생성
  - com.eomcs.mylist.dao.AbstractContactDao 추상 클래스 생성
  - com.eomcs.mylist.dao.JsonContactDao 일반 클래스 생성
  - com.eomcs.mylist.controller.ContactController 클래스 변경
- TodoController 변경
  - com.eomcs.mylist.dao.TodoDao 인터페이스 생성
  - com.eomcs.mylist.dao.AbstractTodoDao 추상 클래스 생성
  - com.eomcs.mylist.dao.JsonTodoDao 일반 클래스 생성
  - com.eomcs.mylist.controller.TodoController 클래스 변경



## 프론트엔드 개발 실습








#
