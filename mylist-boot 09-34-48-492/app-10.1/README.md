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

### 3단계 - 게시글 데이터 처리에 DBMS를 이용한다.

JDBC Driver를 이용하여 MariaDB를 통해 데이터를 처리한다.

- com.eomcs.mylist.dao.BoardDao 인터페이스 변경
- com.eomcs.mylist.dao.XxxBoardDao 클래스 삭제
- com.eomcs.mylist.dao.JdbcBoardDao 클래스 생성
- com.eomcs.mylist.domain.Board 클래스 변경
- com.eomcs.mylist.controller.BoardController 클래스 변경

### 4단계 - DAO 클래스에서 사용자 정의 RuntimeException 예외를 던진다.

자바에서 제공하는 예외 클래스 대신 개발자가 정의한 RuntimeException 예외를 던진다.

- com.eomcs.mylist.dao.DaoException 클래스 생성
- com.eomcs.mylist.dao.BoardDao 인터페이스 변경
  - 각 메서드에서 Exception 을 던지는 선언문을 제거한다.
- com.eomcs.mylist.dao.JdbcBoardDao 클래스 변경
  - 각 메서드에서 예외가 발생하면 DaoException 런타입 예외를 던진다.
- com.eomcs.mylist.controller.BoardController 클래스 변경
  - 각 메서드의 선언부에 있는 예외 던지는 문장을 제거한다.

### 5단계 - DAO 구현 클래스를 별도의 패키지로 분리한다.

- com.eomcs.mylist.dao.mariadb 패키지 생성
- JdbcBoardDao 클래스를 mariadb 패키지로 이동
- JdbcBoardDao 클래스 이름을 BoardDaoImpl 로 변경



## 프론트엔드 개발 실습

- /src/main/resources/static/board/index.html 변경
- /src/main/resources/static/board/view.html 변경






#
