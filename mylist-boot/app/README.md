# 07.7 파일 API 활용: 데이터를 JSON 형식으로 읽고 쓰기

- jackson-databind 를 사용하여 JSON 형식으로 데이터를 읽고 쓰기

## 백엔드 개발 실습

### 0단계 - jackson-databind 라이브러리를 프로젝트에 추가한다.

- Spring Boot는 기본으로 포함하고 있다.

### 1단계 - ObjectMapper 클래스를 사용하여 객체를 JSON 형식으로 출력한다.

- com.eomcs.mylist.controller.XxxController 클래스 변경
  - save() 메서드 변경: ObjectMapper 도구를 사용하여 인스턴스를 JSON 형식의 문자열로 바꿔 출력한다.

### 2단계 - 데코레이터 ObjectInputStream을 사용하여 직렬화 데이터를 읽는다.

- com.eomcs.util.ArrayList 클래스 변경
  - jackson-databind의 ObjectMapper는 프로퍼티만 입출력한다.
  - 현재 ArrayList 클래스에는 프로퍼티가 없다.
  - 
- com.eomcs.mylist.controller.XxxController 클래스 변경
  - 생성자 변경: ObjectInputStream 도구를 사용하여 serialize 데이터를 꺼꾸로 객체로 복원한다.


## 프론트엔드 개발 실습








#
