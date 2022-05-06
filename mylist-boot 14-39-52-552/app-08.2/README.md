# 08.2 DAO 역할 도입: 인터페이스 도입하여 DAO 사용 규칙을 통일하기

- DAO 사용 규칙을 정의하여 프로그래밍의 일관성을 확보한다.

## 백엔드 개발 실습

### 1단계 - 인터페이스로 DAO 사용 규칙을 정의한다.

- com.eomcs.mylist.dao.BoardDao 인터페이스 정의
  - DAO 객체에 대해 호출하는 메서드의 시그너처를 정의한다.
  - 일관된 호출이 가능

### 2단계 - 기존의 XxxBoardDao를 인터페이스 규칙에 따르도록 변경한다.
- com.eomcs.mylist.dao.XxxBoardDao 클래스 변경
  - BoardDao 규칙에 따라 클래스를 작성한다.

### 3단계 - XxxBoardDao를 사용할 때 인터페이스 규칙에 따라 사용한다.

- com.eomcs.mylist.controller.BoardController 클래스 변경
  - BoardDao 규칙에 따라 DAO 객체를 사용한다.

### 4단계 - JSON 형식으로 데이터를 저장하고 읽는 DAO를 인터페이스 규칙에 따라 작성한다.

- com.eomcs.mylist.dao.JsonBoardDao 클래스 생성
  - BoardDao 인터페이스 규칙에 따라 작성한다.
- com.eomcs.mylist.controller.BoardController 클래스 변경
  - JsonBoardDao 를 BoardDao 구현체로 사용한다.


### 5단계 - BoardDao 구현체를 Spring Boot가 주입하도록 변경한다.

- com.eomcs.mylist.dao.JsonBoardDao 클래스 변경
  - 클래스 선언부에 @Repository 애노테이션을 붙인다.
- com.eomcs.mylist.controller.BoardController 클래스 변경
  - BoardDao 필드 선언에 @Autowired 애노테이션을 붙인다.



## 프론트엔드 개발 실습








#
