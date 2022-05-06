# 08.1 DAO 역할 도입: 데이터 보관 처리 코드를 별도의 클래스로 분리

- 데이터 보관처리를 수행하는 코드를 별도의 클래스로 분리한다.

## 백엔드 개발 실습

### 1단계 - BoardController 클래스에서 데이터 보관 처리 코드를 분리하여 CsvBoardDao 클래스로 정의한다.

- com.eomcs.mylist.dao.CsvBoardDao 클래스 생성
  - BoardController 에서 데이터 보관 처리와 관련된 코드를 가져온다.
  - 등록, 변경, 삭제할 때 즉시 저장한다.
- com.eomcs.mylist.controller.BoardController 클래스 변경
  - 데이터 처리 코드를 CsvBoardDao 클래스로 옮긴다.
  - save() 메서드 삭제

### 2단계 - 데이터를 저장할 때 CSV 포맷 대신 바이너리 형식으로 저장한다.

- com.eomcs.mylist.dao.BinaryBoardDao 클래스 생성
  - 인스턴스의 각 필드를 바이트 배열로 저장한다.
- com.eomcs.mylist.controller.BoardController 클래스 변경
  - CsvBoardDao를 BinaryBoardDao로 교체한다.

### 3단계 - 데이터를 저장할 때 serialize/deserialize 방식을 사용한다.

- com.eomcs.mylist.dao.SerialBoardDao 클래스 생성
  - 인스턴스를 통째로 직렬화하여 저장한다.
  - insert() 메서드 명을 create()로 변경
  - update() 메서드 명을 modify()로 변경
  - delete() 메서드 명을 remove()로 변경
- com.eomcs.mylist.controller.BoardController 클래스 변경
  - BinaryBoardDao를 SerialBoardDao로 교체한다.
  - 기존의 DAO와 메서드 이름이 다르기 때문에 그에 맞춰 코드를 변경해야 한다.



## 프론트엔드 개발 실습








#
