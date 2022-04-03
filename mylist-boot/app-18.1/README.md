### 18.1 세션과 쿠키의 활용 : 회원가입/로그인/로그아웃 처리하기

- 회원가입 후 세션을 이용한 로그인/로그아웃을 다룬다.

## 백엔드 개발 실습

### 1단계 - 회원 테이블을 추가한다.

```
create table ml_member (
  no int not null,
  name varchar(50) not null,
  email varchar(100) not null,
  password varchar(255) not null,
  regist_date datetime default now()
);

alter table ml_member
  add constraint primary key (no),
  modify column no int not null auto_increment;
```

### 2단계 - 회원 데이터를 표현할 도메인 클래스를 정의한다.

- com.eomcs.mylist.domain.Member 클래스 정의


### 3단계 - 회원 데이터를 다룰 DAO 인터페이스를 정의한다.

- com.eomcs.mylist.dao.MemberDao 인터페이스 정의
  - insert(Member)메서드 추가

### 4단계 - DAO가 사용할 SQL 매퍼 파일을 추가한다.

- /src/main/resources/com/eomcs/mylist/dao/MemberDao.xml 파일 추가
  - `insert` SQL 추가

### 5단계 - 서비스 객체를 추가한다.

- com.eomcs.mylist.service.MemberService 인터페이스 추가
- com.eomcs.mylist.service.impl.DefaultMemberService 클래스 추가

### 6단계 - 페이지 컨트롤러를 추가한다.

- com.eomcs.mylist.controller.MemberController 클래스 추가
  - `signup()` 메서드 추가

### 7단계 - 로그인 기능을 추가한다.

- com.eomcs.mylist.dao.MemberDao 인터페이스 변경
  - `findByEmailAndPassword()` 메서드 추가
- /src/main/resources/com/eomcs/mylist/dao/MemberDao.xml 파일 변경
  - `findByEmailAndPassword` select 문 추가
- com.eomcs.mylist.service.MemberService 인터페이스 변경
  - `get(String,String)` 메서드 추가
- com.eomcs.mylist.service.impl.DefaultMemberService 클래스 변경
  - `get(String,String)` 메서드 구현
- com.eomcs.mylist.controller.MemberController 클래스 변경
  - `signin()` 메서드 추가

### 8단계 - 로그인 사용자 정보를 조회한다.

- com.eomcs.mylist.controller.ResultMap 클래스 추가
  - JSON 형식의 데이터를 리턴할 때 사용할 클래스
  - 작업 성공 유무와 결과를 저장한다.
- com.eomcs.mylist.controller.MemberController 클래스 변경
  - `getLoginUser()` 메서드 추가

### 9단계 - 로그아웃 기능을 추가한다.

- com.eomcs.mylist.controller.MemberController 클래스 변경
  - `signout()` 메서드 추가

## 프론트엔드 개발 실습

### 1단계 - 회원 가입 화면을 만든다.

- /src/main/resources/static/member/form.html 페이지 추가

### 2단계 - 로그인 화면을 만든다.

- /src/main/resources/static/member/signin.html 페이지 추가

### 3단계 - 상단 메뉴바를 추가한다.

- /src/main/resources/static/index.html 페이지 변경

#
