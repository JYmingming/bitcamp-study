# 04.2 다형성의 활용 : 게시글 목록 만들기

- 게시글 목록 기능을 추가한다.

## 백엔드 개발 실습

### 1단계 - 게시글 요청을 처리할 REST API를 만든다.

- com.eomcs.mylist.Board 클래스 생성
  - 게시글 데이터를 저장할 수 있는 메모리를 설계한다.
  - 게시글 데이터 타입을 정의한다.
- com.eomcs.mylist.ArrayList3 클래스 생성
  - Board 배열을 다룰 클래스를 정의한다.
  - ArrayList 클래스를 복사한다.
- com.eomcs.mylist.BoardController 클래스 생성
  - ContactController를 복사해서 변경한다.

## 프론트엔드 개발 실습

### 1단계 - 게시글 관리 화면을 만든다.

- /index.html 변경
  - 게시글 메뉴 추가
- /board/form.html 생성
  - /contact/form.html을 복사해서 변경한다.
- /board/index.html 생성
  - /contact/index.html을 복사해서 변경한다.
- /board/view.html 생성
  - /contact/view.html을 복사해서 변경한다.
