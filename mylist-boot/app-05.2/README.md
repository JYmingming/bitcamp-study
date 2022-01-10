# 05.2 인스턴스 멤버 사용법: 인스턴스 메서드 활용하기

- 인스턴스 메서드를 사용하여 ArrayList의 인스턴스 필드 다루기

## 백엔드 개발 실습

### 1단계 - ArrayList 메서드를 호출할 때 인스턴스 주소를 파라미터로 넘기지 않고 메서드 호출 앞 부분에 넘긴다.

- com.eomcs.mylist.ContactController 클래스 변경
  - ArrayList의 메서드 호출할 때 인스턴스 주소를 앞쪽에 넘긴다.
- com.eomcs.mylist.TodoController 클래스 변경
  - ContactController와 동일하게 변경한다.
- com.eomcs.mylist.BoardController 클래스 변경
  - ContactController와 동일하게 변경한다.

### 2단계 - ArrayList의 메서드를 인스턴스 메서드로 전환한다.

- com.eomcs.mylist.ArrayList 클래스 변경
  - 메서드를 호출할 때 앞쪽에서 전달한 인스턴스 주소를 받을 수 있도록 인스턴스 메서드로 선언한다.
  - 메서드 정의에서 static 키워드를 제거한다.
  - 파라미터로 인스턴스 주소를 받는 대신에 빌트인 변수 this를 사용한다.
