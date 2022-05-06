### 13.3 서비스 객체 도입 : 트랜잭션이 필요한 이유와 다루는 방법

- 트랜잭션을 적용하지 않았을 때 문제점을 확인한다.
- 트랜잭션을 적용하여 문제를 해결한다.

## 백엔드 개발 실습

### 1단계 - 트랜잭션이 필요한 이유를 확인한다.

- 연락처 입력
  - 연락처 기본 정보를 입력할 때 전화 번호의 값을 20자리 넘어가게 입력한다.
  - 입력을 수행한 후 테이블에서 연락처 및 전화번호 입력 상태를 확인한다.
  - 전화번호 입력 값이 컬럼의 크기를 넘어서는 경우 오류 발생
    - 그러나 그 전에 수행했던 입력 작업은 실제 테이블에 반영되어 있다.
- 만약 오류가 발생하지 않을 경우에만 입력을 완료하고 싶다면
  - 입력 작업들을 한 단위로 묶어라!

### 2단계 - 트랜잭션을 설정한다.

- com.eomcs.mylist.App 클래스 변경
  - `@EnableTransactionManagement` 설정 추가
    - 애노테이션으로 트랜잭션을 제어할 수 있게 한다.
  - 트랜잭션 관리자 객체 준비

### 3단계 - 트랜잭션을 적용한다.

- com.eomcs.mylist.controller.ContactController 클래스 변경
  - add()/update()/delete() 메서드에 트랜잭션 적용

### 4단계 - 업무로직과 트랜잭션 제어 코드를 캡슐화 한다.

- com.eomcs.mylist.service.ContactServiceNonTransaction 클래스 생성
  - 트랜잭션 적용 전
- com.eomcs.mylist.service.ContactServiceTransaction 클래스 생성
  - 트랜잭션 적용 후 : TransactionTemplate 클래스 사용
- com.eomcs.mylist.service.ContactServiceTransaction2 클래스 생성
  - 트랜잭션 적용 후 : TransactionManager 클래스를 직접 사용
- com.eomcs.mylist.service.ContactServiceTransaction3 클래스 생성
  - 트랜잭션 적용 후 : @Transactional 애노테이션 사용
- com.eomcs.mylist.controller.ContactController 클래스 변경
  - add()/update()/delete() 메서드에 트랜잭션 적용

### 5단계 - 인터페이스를 이용하여 특정 클래스 종속에서 탈피한다.

- com.eomcs.mylist.service.ContactService 인터페이스 정의
- com.eomcs.mylist.service.ContactServiceNonTransaction 클래스 변경
  - ...service.impl.NonTransactionContactService  패키지 이동 및 클래스명 변경
- com.eomcs.mylist.service.ContactServiceTransaction 클래스 변경
  - ...service.impl.TransactionTemplateContactService  패키지 이동 및 클래스명 변경
- com.eomcs.mylist.service.ContactServiceTransaction2 클래스 변경
  - ...service.impl.TransactionManagerContactService  패키지 이동 및 클래스명 변경
- com.eomcs.mylist.service.ContactServiceTransaction3 클래스 변경
  - ...service.impl.DefaultContactService  패키지 이동 및 클래스명 변경
- com.eomcs.mylist.controller.ContactController 클래스 변경
  - 패키지 변경 및 인터페이스 정의에 맞춰 코드 변경

### 6단계 - 게시글, 독서록, To-do 에도 서비스 객체를 적용한다.

- com.eomcs.mylist.service.BoardService 인터페이스 정의
  - com.eomcs.mylist.service.impl.DefaultBoardService 클래스 생성
  - com.eomcs.mylist.controller.BoardController 클래스 변경
- com.eomcs.mylist.service.BookService 인터페이스 정의
  - com.eomcs.mylist.service.impl.DefaultBookService 클래스 생성
  - com.eomcs.mylist.controller.BookController 클래스 변경
- com.eomcs.mylist.service.TodoService 인터페이스 정의
  - com.eomcs.mylist.service.impl.DefaultTodoService 클래스 생성
  - com.eomcs.mylist.controller.TodoController 클래스 변경


## 프론트엔드 개발 실습




#
