# 13.1 서비스 객체 도입 : 데이터를 쪼개 부모 테이블과 자식테이블에 분산 저장하기

- 데이터를 여러 테이블에 분산 저장하는 방법

## 백엔드 개발 실습

### 1단계 - 연락처에 여러 개의 전화번호를 입력할 수 있도록 자식 테이블을 추가한다.

```
drop table ml_tel_type;
drop table ml_contact;
drop table ml_cont_tel;

-- 연락처
create table ml_contact(
  contact_no int not null,
  name varchar(50) not null,
  email varchar(20) not null,
  company varchar(50)
);

alter table ml_contact
  add constraint primary key (contact_no),
  modify column contact_no int not null auto_increment;

-- 전화번호 유형
create table ml_tel_type(
  tt_no int not null,
  title varchar(20) not null
);

alter table ml_tel_type
  add constraint primary key (tt_no),
  modify column tt_no int not null auto_increment;

-- 연락처 전화번호
create table ml_cont_tel(
  ct_no int not null, -- 전화번호 PK
  contact_no int not null, -- 연락처 PK
  tt_no int not null, -- 전화번호 유형 PK
  tel varchar(20) not null -- 전화번호
);

alter table ml_cont_tel
  add constraint primary key (ct_no),
  modify column ct_no int not null auto_increment;

alter table ml_cont_tel
  add constraint ml_cont_tel_fk1
      foreign key (contact_no) references ml_contact(contact_no),
  add constraint ml_cont_tel_fk2
      foreign key (tt_no) references ml_tel_type(tt_no);   

```

### 2단계 - 연락처 테이블에 예제 데이터를 넣는다.
```
-- 전화번호 유형 입력
insert into ml_tel_type(tt_no, title) values(1, '전화');
insert into ml_tel_type(tt_no, title) values(2, '팩스');
insert into ml_tel_type(tt_no, title) values(3, '휴대전화');
insert into ml_tel_type(tt_no, title) values(4, '직장전화');
insert into ml_tel_type(tt_no, title) values(5, '직장팩스');

-- 연락처 기본 정보 입력
insert into ml_contact(contact_no,name,email,company)
  values(1, '사람1', 'user1@test.com', '비트캠프');
insert into ml_contact(contact_no,name,email,company)
  values(2, '사람2', 'user2@test.com', '비트캠프');
insert into ml_contact(contact_no,name,email,company)
  values(3, '사람3', 'user3@test.com', '비트캠프');

-- 연락처에 전화번호 추가
insert into ml_cont_tel(ct_no, contact_no, tt_no, tel)
  values(1, 1, 1, '02-1111-1111');
insert into ml_cont_tel(ct_no, contact_no, tt_no, tel)
  values(2, 1, 2, '02-1111-1112');
insert into ml_cont_tel(ct_no, contact_no, tt_no, tel)
  values(3, 1, 3, '010-1111-1111');
insert into ml_cont_tel(ct_no, contact_no, tt_no, tel)
  values(4, 2, 3, '010-1111-2222');
insert into ml_cont_tel(ct_no, contact_no, tt_no, tel)
  values(5, 3, 3, '010-1111-3333');    
```

### 3단계 - 연락처 테이블 변경에 맞춰 도메인 클래스를 변경한다.

- com.eomcs.mylist.domain.ContactTel 클래스 추가
- com.eomcs.mylist.domain.Contact 클래스 변경
  - tel 필드 제거
  - ContactTel 컬렉션 필드 추가

### 4단계 - 연락처 테이블 변경에 맞춰 DAO 클래스를 변경한다.

- com.eomcs.mylist.dao.ContactDao 인터페이스 변경
  - 연락처의 전화번호를 다루는 메서드 추가
- /src/main/resources/com/eomcs/mylist/dao/ContactDao.xml 파일 변경
  - ContactDao에 추가한 메서드에 맞춰 SQL 문을 추가 및 변경한다.

### 5단계 - 연락처 테이블 변경에 맞춰 페이지 컨트롤러 클래스를 변경한다.

- com.eomcs.mylist.controller.ContactController 클래스 변경
  - add() 메서드 변경
  - list() 메서드 변경
  - get() 메서드 변경
  - update() 메서드 변경
  - delete() 메서드 변경

## 프론트엔드 개발 실습

### 1단계 - 연락처 입력 화면을 처리한다.

- /static/contact/form.html 변경

### 2단계 - 연락처 목록 화면을 처리한다.

- /static/contact/index.html 변경

### 3단계 - 연락처 상세보기 화면을 처리한다.

- /static/contact/view.html 변경



#
