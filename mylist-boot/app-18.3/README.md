### 18.3 세션과 쿠키의 활용 : 페이스북 로그인 연동하기

- 페이스북 로그인과 연동하기

## 백엔드 개발 실습

### 1단계 - 페이스북 로그인을 처리하는 기능을 추가한다.

- com.eomcs.mylist.controller.MemberController 클래스 변경
  - `facebookLogin()` 메서드 추가
- com.eomcs.mylist.service.MemberService 인터페이스 변경
  - `get(String email)` 메서드 추가
- com.eomcs.mylist.service.impl.DefaultMemberService 클래스 변경
  - `get(String email)` 메서드 구현  
- com.eomcs.mylist.dao.MemberDao 인터페이스 변경
  - `findByEmail(String email)` 메서드 추가
- `/src/main/resources/com/eomcs/mylist/dao/MemberDao.xml` 파일 변경
  - `findByEmail` SQL 문 추가

## 프론트엔드 개발 실습

### 1단계 - 로그인 화면에 페이스북 로그인 버튼을 추가한다.

- /src/main/resources/static/member/signin.html 변경



#
