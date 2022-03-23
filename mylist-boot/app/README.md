### 15.1 Mybatis 고급 기능 활용 : 테이블 조인과 동적 SQL 다루기

- 테이블을 조인하여 select 한 결과를 객체에 한 번에 받기
- 조건문 반복문을 이용하여 SQL을 동적으로 다루기

## 백엔드 개발 실습

### 1단계 - 테이블 조인 결과를 한 번에 받는다.

- /src/main/resources/com/eomcs/mylist/dao/ContactDao.xml 변경
  - `contactMap` resultMap 변경
  - `findAll` select 문 변경
  - `findByNo` select 문 변경
- com.eomcs.mylist.service.impl.DefaultContactService 클래스 변경
  - list(), get() 메서드 변경

### 2단계 - 동적 SQL 문을 생성한다.

- /src/main/resources/com/eomcs/mylist/dao/ContactDao.xml 변경
  - `insertTels` insert 문 추가
- com.eomcs.mylist.dao.ContactDao 인터페이스 변경
  - `insertTels()` 메서드 추가
- com.eomcs.mylist.service.impl.DefaultContactService 클래스 변경
  - add(), update() 메서드 변경

## 프론트엔드 개발 실습


#
