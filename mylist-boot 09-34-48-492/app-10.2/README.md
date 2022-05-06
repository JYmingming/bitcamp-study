# 10.2 데이터 관리를 DBMS에게 맡기기 : DB 커넥션풀을 이용하여 DB 커넥션 재활용하기

- DB 커넥션을 재활용하는 방법

## 백엔드 개발 실습

### 1단계 - application.properties 파일에 DB 연결 정보를 추가한다.

- /src/main/resources/application.properties 파일 변경
```
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://localhost:3306/studydb
spring.datasource.username=study
spring.datasource.password=1111
```

### 2단계 - DB 커넥션풀 역할을 수행할 객체를 준비한다.

- com.eomcs.mylist.App 클래스 변경
  - DataSource 객체를 생성하는 메서드를 정의한다.
  - @Bean 애노테이션을 붙여 객체 생성 메서드로 지정한다.

### 3단계 - 게시글 데이터 처리 객체(DAO)에서 DataSource를 사용하여 DB에 연결한다.

- com.eomcs.mylist.dao.mariadb.BoardDaoImpl 클래스 변경


## 프론트엔드 개발 실습







#
