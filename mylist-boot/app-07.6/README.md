# 07.6 파일 API 활용: 데이터를 객체 단위로 읽고 쓰기

- 직렬화 도구를 사용하여 인스턴스를 읽고 쓴다.

## 백엔드 개발 실습

### 1단계 - 데코레이터 ObjectOutputStream을 사용하여 인스턴스를 직접 출력한다.

- com.eomcs.util.ArrayList 클래스 변경
  - 직렬화(serialization)가 가능하도록 java.io.Serializable 인터페이스를 구현한다.
- com.eomcs.mylist.domain.* 도메인 클래스 변경
  - 직렬화(serialization)가 가능하도록 java.io.Serializable 인터페이스를 구현한다.
- com.eomcs.mylist.controller.XxxController 클래스 변경
  - save() 메서드 변경: ObjectOutputStream 도구를 사용하여 인스턴스를 출력한다.

### 2단계 - 데코레이터 ObjectInputStream을 사용하여 직렬화 데이터를 읽는다.

- com.eomcs.mylist.controller.XxxController 클래스 변경
  - 생성자 변경: ObjectInputStream 도구를 사용하여 serialize 데이터를 꺼꾸로 객체로 복원한다.


## 프론트엔드 개발 실습








#
