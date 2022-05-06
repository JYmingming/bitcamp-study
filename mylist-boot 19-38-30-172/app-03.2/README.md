# 03.2 클래스 사용법 : 메서드를 분류하기

- 클래스 문법의 또 다른 용도는 유지보수하기 좋게 메서드를 분류하는 것이다.

## 백엔드 개발 실습

### 1단계 - 배열을 다루는 메서드를 별도의 클래스로 분류한다.

- com.eomcs.mylist.ArrayList 클래스 생성
  - ContactController에서 배열을 다루는 메서드를 가져온다.
  - 백업: ArrayList.java.01
- com.eomcs.mylist.ContactController 변경
  - 배열 관련 메서드를 ArrayList로 옮긴다.
  - 백업: ContactController.java.01


### 2단계 - 코드 정리

- com.eomcs.mylist.ContactController 변경
  - list() 변경: 저장된 목록을 가져오는 코드를 ArrayList.toArray()로 옮긴다.
  - add() 변경: 배열에 항목을 추가하고, 배열의 크기를 늘리는 코드를 ArrayList.add()로 옮긴다.
  - update() 변경: 배열에서 특정 항목을 다른 값으로 교체하는 코드를 ArrayList.set()으로 옮긴다.
- com.eomcs.mylist.ArrayList 변경
  - toArray() 추가: 배열에 저장된 항목들을 꺼내 새 배열에 담아 리턴한다.
  - add() 추가: 배열에 항목을 추가한다.
  - set() 추가: 배열의 특정 위치의 값을 변경한다.

## 프론트엔드 개발 실습








#
