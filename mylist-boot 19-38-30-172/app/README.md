### 18.2 세션과 쿠키의 활용 : 세션 활용하기

- 로그인과 세션을 활용하여 사용자 별로 데이터 처리하기

## 백엔드 개발 실습

### 1단계 - 게시글 테이블에 작성자 정보를 추가한다.

```
delete from ml_board;

alter table ml_board
  add column writer int not null,
  add constraint ml_board_fk foreign key (writer) references ml_member(no);
```

### 2단계 - 게시글을 다루는 도메인 클래스에 회원 번호를 담는 필드를 추가한다.

- com.eomcs.mylist.domain.Board 클래스 변경
  - `int writer` 필드 추가

### 3단계 - 게시글 데이터를 다룰 때 작성자 번호도 함께 다룬다.

- /src/main/resources/com/eomcs/mylist/dao/BoardDao.xml 파일 변경
  - `insert` SQL 문 변경
  - `update` SQL 문 변경
  - `delete` SQL 문 변경

### 4단계 - 게시글 입력할 때 로그인 사용자 번호를 추가한다.

- com.eomcs.mylist.controller.BoardController 클래스 변경
  - `add()` 메서드 변경
  - `update()` 메서드 변경
  - `delete()` 메서드 변경
- com.eomcs.mylist.service.BoardService 인터페이스 변경
  - `delete()` 메서드의 파라미터 변경
- com.eomcs.mylist.service.impl.DefaultBoardService 클래스 변경
  - `delete()` 메서드 변경
- com.eomcs.mylist.dao.BoardDao 인터페이스 변경
  - `delete()` 메서드의 파라미터 변경
- /src/main/resources/com/eomcs/mylist/dao/BoardDao.xml 파일 변경
  - `delete` SQL 문 변경. 파라미터 타입을 int 대신에 board로 교체한다.

### 5단계 - 게시글 조회할 때 로그인 사용자의 이름을 함께 조회한다.

- com.eomcs.mylist.domain.Board 클래스 변경
  - `writer` 필드의 타입을 `int` 대신에 `Member`로 교체한다.
- /src/main/resources/com/eomcs/mylist/dao/BoardDao.xml 파일 변경
  - `resultMap` 에 Member 객체를 가져오는 코드를 추가
  - `findAll`, `findByNo` SQL 문 변경: `ml_member` 테이블과 조인한다.
  - `insert`, `update`, `delete` SQL 문 변경: writer 필드의 타입이 int에서 Member 변경된 것을 적용한다.
- com.eomcs.mylist.controller.BoardController 클래스 변경
  - `add()` 메서드 변경: Board 객체에 로그인 회원의 정보를 담은 Member 객체를 주입한다.
  - `update()` 메서드 변경: Board 객체에 로그인 회원의 정보를 담은 Member 객체를 주입한다.
  - `delete()` 메서드 변경: Board 객체에 로그인 회원의 정보를 담은 Member 객체를 주입한다.

## 프론트엔드 개발 실습

### 1단계 - 게시글에 로그인 사용자 정보를 적용한다.

- /src/main/resources/static/board/form.html 페이지 변경
  - 로그인 하지 않았을 경우 로그인 페이지로 이동시킨다.
- /src/main/resources/static/board/index.html 페이지 변경
  - 게시글 정보를 출력할 때 작성자 이름도 함께 출력한다.
- /src/main/resources/static/board/view.html 페이지 변경
  - 게시글 정보를 출력할 때 작성자 이름도 함께 출력한다.


  
#
