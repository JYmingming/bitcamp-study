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
  - `photo()` 메서드 추가
    - URL 경로에서 지정한 파일을 찾아 클라이언트에게 전송한다.

### 5단계 - 사진 파일을 업로드할 때 썸네일 이미지를 미리 생성한다.

- com.eomcs.mylist.controller.BookController 클래스 변경
  - `add()`, `update()` 메서드에 썸네일 이미지 생성 기능 추가
    - 빌드 스클립트 파일(build.gradle)에 'Thumbnailator' 라이브러리 추가
    - `gradle eclipse` 실행
    - 이클립스 IDE에서 프로젝트 리프래시
    - 업로드 파일을 저장한 후 해당 파일의 썸네일 이미지 파일을 생성한다.

### 6단계 - 사진 데이터를 변경하지 않으면 업데이트 항목에서 제외한다.

- /src/main/resources/com/eomcs/mylist/dao/BookDao.xml 변경
  - `update` SQL 문에 동적 SQL 기능 추가

## 프론트엔드 개발 실습

### 1단계 - 입력 화면에 사진 항목을 추가한다.

- /static/book/form.html 변경
  - 사진 파일을 업로드할 input 태그 추가
  - POST 요청으로 책 정보 및 사진 파일을 업로드 한다.
- /static/book/index.html 변경
  - 목록에 책 썸네일 사진을 추가
- /static/book/view.html 변경
  - 상세 화면에 책 사진 출력
  - 책 사진 변경 기능 추가

#
