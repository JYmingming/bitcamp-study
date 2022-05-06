# 07.7 파일 API 활용: 데이터를 JSON 형식으로 읽고 쓰기

- jackson-databind 를 사용하여 JSON 형식으로 데이터를 읽고 쓰기

## 백엔드 개발 실습

### 0단계 - jackson-databind 라이브러리를 프로젝트에 추가한다.

- Spring Boot는 기본으로 포함하고 있다.

### 1단계 - ObjectMapper 클래스를 사용하여 객체를 JSON 형식으로 입출력 한다.

- com.eomcs.util.ArrayList 클래스 변경
  - addAll() 메서드 추가
  - ArrayList(Object[]) 생성자 추가
- com.eomcs.mylist.controller.XxxController 클래스 변경
  - save() 메서드 변경: ObjectMapper 도구를 사용하여 인스턴스를 JSON 형식의 문자열로 바꿔 출력한다.
  - 생성자 변경: ObjectMapper 도구를 사용하여 JSON 형식의 문자열을 객체로 전환한다.






## 프론트엔드 개발 실습








#
