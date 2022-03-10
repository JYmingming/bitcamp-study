# 10.1 데이터 관리를 DBMS에게 맡기기 : JDBC API 사용

- DBMS를 사용하여 데이터를 저장하고 조회하기

## 백엔드 개발 실습

### 1단계 - 프로젝트에 JDBC Driver 추가한다.

- 그래이들 빌드 스크립트 파일(build.gradle) 변경
  - mariadb jdbc driver 추가
  - `$ gradle eclipse` 실행
  - 이클립스 IDE에서 프로젝트 정보 갱신

### 2단계 - 게시글을 저장할 테이블 생성

- mariadb 클라이언트를 사용하여 테이블을 생성한다.
  - primary key 제약조건과 자동 증가 설정을 추가한다.

```
create table ml_board (
    board_no int not null,
    title varchar(255) not null,
    content text not null,
    created_date datetime default now(),
    view_count int default 0
);

alter table ml_board
  add constraint primary key(board_no);

alter table ml_board
  modify column board_no int not null auto_increment;
```

### 3단계 - JdbcXxxDao 클래스를 생성한다.

- JDBC Driver를 이용하여 MariaDB를 통해 데이터를 처리한다.


## 프론트엔드 개발 실습








#
