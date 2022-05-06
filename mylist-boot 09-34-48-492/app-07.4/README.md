# 07.4 파일 API 활용: 데코레이터 패턴을 이용한 읽고 쓰기 기능 확장

- I/O API의 데코레이터 패턴을 활용하여 한 줄 단위로 읽고 쓰는 기능을 추가한다.

## 백엔드 개발 실습

### 1단계 - 데코레이터 BufferedReader를 사용하여 한 줄 읽기 기능을 처리한다.

- com.eomcs.io.FileReader2 클래스 삭제
- com.eomcs.mylist.controller.XxxController 클래스 변경
  - BufferedReader 데코레이터를 사용해서 한 줄의 문자열을 읽는다.

### 2단계 - 데코레이터 PrintWriter를 사용하여 한 줄 쓰기 기능을 처리한다.

- com.eomcs.io.FileWriter2 클래스 삭제
- com.eomcs.mylist.controller.XxxController 클래스 변경
  - PrintWriter 데코레이터를 사용해서 한 줄의 문자열을 출력한다.


## 프론트엔드 개발 실습








#
