# 04.1 다형성의 활용 : 다형적 변수의 특징

- 기존의 ArrayList의 배열 타입을 Object 로 변경한다.

## 백엔드 개발 실습

### 1단계 - ArrayList의 레퍼런스 배열이 다양한 타입의 객체를 주소를 받을 수 있도록 Object[] 타입으로 변경한다.

- com.eomcs.mylist.ArrayList 클래스 변경
  - Contact[] 타입을 Object[] 타입으로 변경한다.
  - add()의 파라미터 타입 변경
  - grow()의 리턴 타입 변경
  - newLength()에서 레퍼런스 배열 이름 변경
  - toArray()의 리턴 타입 변경
  - remove()의 리턴 타입 변경
  - set() 파라미터 타입 변경
  - indexOf()를 ContactController로 이동한다.

- com.eomcs.mylist.ContactController 클래스 변경
  - indexOf() 메서드 추가

### 2단계 - ArrayList를 그대로 복사해서 ArrayList2 로 만든다.

- com.eomcs.mylist.ArrayList2 클래스 변경
  - ArrayList 코드를 그대로 가져온다.
  - 레퍼런스 배열의 타입을 Object로 변경하니까 ArrayList를 복사했을 때 변경할 게 없다.
