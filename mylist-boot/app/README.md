### 16.1 파일 업로드 : 자바스크립트 빌트인 객체 사용하기

- AJAX를 이용하여 파일 업로드 구현하기

## 백엔드 개발 실습

### 1단계 - 도서록 테이블에 책 사진 파일 이름을 저장할 컬럼을 추가한다.

```
alter table ml_book
  add column photo varchar(255);
```

### 2단계 - 도메인 클래스(값 객체; Value Object; VO)에 책 사진 파일 이름을 저장할 필드를 추가한다.

- com.eomcs.mylist.domain.Book 클래스 변경


### 3단계 - SQL Mapper 파일을 변경한다.

- /src/main/resources/com/eomcs/mylist/dao/BookDao.xml 파일 변경
  - `resultMap` 태그에 phoho 컬럼 매핑 정보 추가
  - `findAll`, `findByNo`, `update`, `insert` SQL 문에 `phoho` 컬럼 추가

### 4단계 - 사진 파일 업로드 기능을 페이지 컨트롤러에 추가한다.

- com.eomcs.mylist.controller.BookController 클래스 변경
  - `add()`, `update()` 메서드에 파일업로드 기능 추가



## 프론트엔드 개발 실습

### 1단계 - 입력 화면에 사진 항목을 추가한다.

- /static/book/form.html 변경
  - 사진 파일을 업로드할 input 태그 추가
  - POST 요청으로 책 정보 및 사진 파일을 업로드 한다.

#
