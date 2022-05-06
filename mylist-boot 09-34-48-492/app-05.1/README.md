# 05.1 인스턴스 멤버 사용법: 인스턴스 필드 활용하기

- 인스턴스 필드를 사용하여 ArrayList 코드를 공유하기

## 백엔드 개발 실습

### 1단계 - ArrayList의 배열 관련 변수를 인스턴스 필드로 전환한다.

- com.eomcs.mylist.ArrayList 클래스 변경
  - 레퍼런스 배열과 size 변수를 인스턴스 필드로 바꾼다.

### 2단계 - 기존의 메서드를 인스턴스 필드로 사용하도록 변경한다.

- com.eomcs.mylist.ArrayList 클래스 변경
  - ArrayList의 인스턴스 주소를 파라미터로 넘기도록 메서드를 변경한다.
  - 기존 메서드는 파라미터로 받은 ArrayList 인스턴스 변수(list 배열과 size)를 사용한다.

### 3단계 - ArrayList 변경에 맞춰 페이지 컨트롤러 클래스를 변경한다.

- com.eomcs.mylist.ContactController 클래스 변경
  - Contact 객체의 목록을 저장할 배열을 ArrayList 설계도에 따라 만든다.
  - 클라이언트 요청을 처리하는 메서드에서 ArrayList의 메서드를 호출할 때 항상 ArrayList 인스턴스 주소를 알려준다.
- com.eomcs.mylist.TodoController 클래스 변경
  - Todo 객체의 목록을 저장할 배열을 ArrayList 설계도에 따라 만든다.
  - 클라이언트 요청을 처리하는 메서드에서 ArrayList의 메서드를 호출할 때 항상 ArrayList 인스턴스 주소를 알려준다.
- com.eomcs.mylist.BoardController 클래스 변경
  - Board 객체의 목록을 저장할 배열을 ArrayList 설계도에 따라 만든다.
  - 클라이언트 요청을 처리하는 메서드에서 ArrayList의 메서드를 호출할 때 항상 ArrayList 인스턴스 주소를 알려준다.






#
