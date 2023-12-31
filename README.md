# java
Java 문법 - 초급 예제, 중급 예제,  고급 예제



**<java 초급 강좌 >**

<배치 템플릿 만들기>

***. 환경 설정 .***
   - java : jdk 11 & Gradle Groovy
   - Spring Boot 2.7.13
   - Spring Batch 5.0.2
   - Database : MySQL 5.6, JPA 2.2
   - Schedule : quartz 2.3.0



<배치프레임워크 관련 테이블>
   - DDL.sql 파일에 있는 쿼리로 테이블 생성을 권장합니다.


0. 예제
    - MainTaskletJob    : 기본 템플릿 (Job -> Step)
    - DeptTableCopyJob  : 원천테이블(Dept)을 select해서, 목적테이블(Dept2) 에 insert 한다.

1. Dummy Reader -> Dummy Processor -> Dummy Writer
    - DummyToDummyBatch              : 완료 (20230628)

2. Memory Reader -> Text Processor -> Console Writer
    - MemoryToConsoleBatch           : Reader / Processor / Writer 분리해서 처리하기.
    - MemoryToFileDelimitedTxtBatch  : "|" 구분자로 Text파일 생성하기. (-> /files/out/customerw.txt)
    - MemoryToFileFormattedTxtBatch  : 고정길이 Text파일 생성하기.     (-> /files/out/clientFomatted.txt)

3. File Reader -> text Processor -> Console Writer
    - FileJsonToConsoleBatch         : JSON 파일 읽고 콘솔에 쓰기
    - FileDelimitedCsvToConsoleBatch : CSV 파일 읽고 콘솔에 쓰기
    - FileFormattedTxtToConsoleBatch :

4. DB Reader -> text Processor -> DB writer
    - DBToDBSynchronizedBatch        : 완료 (20230628)
    - DBToJsonFileBatch              : 완료 (20230628)
    - DBToXMLFileBatch               : 완료 (20230628)

5. DB to Json_File to DB
    - DBToJsonToDBBatch              : 완료 (20230629)


6. File Reader -> text Processor -> DB Writer
    - FileJsonToDBBatch
    - FileDelimitedToDBBatch
    - FileFormattedToDBBatch

7. 추가 할일
    - 스케줄 확정
    - 개별 실행 방법



<CLI에서 애플리케이션으로 실행하는 방식>
D:\JpaNQueryDsl\springbatch\build\libs>
 : java -jar springbatch-0.0.1-SNAPSHOT.jar name=anakin seq(LONG)=2L creatdDt(date)=2023-06-20 age(double)=3.14



<java 초급 강좌 >

1. 자바란? 자바변수, 연산자
    - 01. Prologue
    - 02. 자바가 무엇일까?
    - 03. 자바의 역사
    - 04. JDK의 설치-실습
    - 05. Intelli-J
    - 06. 변수란?변수의 타입
    - 07. 명명 규칙변수, 상수, 리터럴
    - 08. 연산자의 개념과 종류
    - 09. Epilogue

02. 조건문, 반복문, 배열
    01. Prologue
    02. 조건문의 개념과 if문, switch문
    03. Math.random() & 메서드 연습
    04. 반복문의 for, while, do-while
    05. 배열의 개념과 메모리구조, 선언과 초기화
    06. Epilogue



<java 중급 강좌 >

01. 클래스와 객체-1
    - 객체지향언어의 개념
    - 클래스와 인스턴스의 개념
    - 사용자 정의 클래스
    - 메서드와 return문
    - Call Stack과 매개변수
    - 재귀 호출
    - 인스턴스 멤버와 정적 멤버
    - 메서드 오버로딩
    - final필드와 static final필드

02. 생성자, 상속, 오버라이딩
    - 생성자의 개념과 종류
    - this, this()와 인스턴스 복제 생성자
    - 멤버변수의 초기화 순서와 초기화 블록
    - 싱글톤 패턴
    - 계좌 프로그램 작성
    - 상속과 포함
    - Object클래스와 오버라이딩
    - super와 super()

03. 제어자와 다형성 - 제어자(Modifier)와 다형성(Polymorphism)
    - 제어자와 다형성
    - 다형성의 형변환
    - 매개변수의 다형성과 Vector클래스

    - 제어자 : 접근제어(Access Modifier) : private < default < protected < public
               private    : 나만 접근 가능
               default    : 같은 패키지 내에만 접근 가능
               protected  : 상속관계 패키지에서 접근 가능
               public     : 모두 접근 가능
            : 기타 제어자 - static(정적), final(마지막), abstract(추상메소드-body가 없는 메소드, 추상클래스-추상메소드가 1개 이상 있는 클래스)
                         , synchronized(동기화, 쓰레드 작업 시), transient(직렬화)

    - 다형성 : 조상의 참조변수로 자손타입의 객체를 다룰 수 있다.          (예 : Product p1 = new Tv(); (O) )
              반대로, 자손의 참조변수로 조상타입의 객체를 다룰 수는 없다.  (예 : Tv v = new Product(); (X) )
              단, 자손에만 있고 조상에 없는 객체는 사용할 수 없다.
              자식이 많을수록 유리하다.
              java에서 제일 중요한 이론 중 하나이다.
              다형성을 알아야 추상, 인터페이스를 이해할 수 있다.

              1). 매개변수의 다형성  :  buy(Product p)  <--  buy(Tv t)
                                     buy(Product p)  <--  buy(Auido a)
                                     buy(Product p)  <--  buy(Computer a)

              2). 필드의 다형성     : Product p1 = new Tv();
                                    Product p2 = new Audio();
                                    Product p3 = new Computer();

              3). 메소드 오버라이딩 시에는 근본을 벗어나서 자손클래스 메소드를 사용하는 예외가 있다
                  - 예 : toString() 같은 메소드...


04. 추상클래스와 인터페이스
    - 추상클래스
    - 인터페이스

     <추상클래스>
         - 추상메소드를 하나 이상 가지고 있는 클래스
         - 추상메소드 : 선언부만 존재하고, 구현부가 없는 클래스
         - 추상클래스는 인스턴스를 절대로 생성할 수가 없다.

     <인터페이스 - Interface>
         - *** 표준을 제시 *** 하여 규칙에 맞게 구현하도록 한다.
         - ** 객체 사용 설명서
         - ** 추상 메소드가 인터페이스의 본질이다.
             : 정적 메소드
             : 디폴트 메소드
         - ** 생성자가 없다.
         - ** 인스턴스를 만들 수 없다.
         - 일종의 추상클래스
         - 구현된건 아무것도 없다
         - 클래스가 아니다.
         - 클래스 작성에 도움을 준다.
         - ~able(~할 수 있는) 으로 해석된다.

         public insterface aInterface() {
             // int a = 10;     // 아래와 같은 의미지만 "static final" 생략 가능
             static final int a = 0;

             // void method();  // 아래와 같은 의미지만 "abstract" 생략 가능
             abstract void method();
         }

     <인터페이스의 다형성>
         - 인터페이스 필드의 다형성
            A a1 = new Member();
            A a2 = new Person();
         - 인터페이스 매개변수의 다형성
            public void method (A a1) { }
            public void method (A a2) { }
         - 인터페이스 리턴타입 사용
            public A method3() { }

     <인터페이스 종류>
     1. static final
     2. abstract
     3. default
     4. static


05. 중첩클래스, 예외처리
    - 중첩클래스
    - 중첩인터페이스
    - 익명클래스
    - ArrayIndexOutOfBoundsException
    - NullPointerException
    - NumberFormatException
    - ArithmeticException
    - ClassCastException
    - ClassNotFoundException
    - CustomException
    - Exception


06. java.lang.cloneable
    01. java.lang.cloneable
        - Object  (중요) - 11개 메소드 :  equals, String()
        - System
        - Class
        - String (중요) / String Buffer / String Builder
        - Math
        - Wrapper
    02. java.lang.string
        - EUC-KR / UTF-8
        - Scanner
        - charAt
        - replace()
        - trim()
        - substring()
        - toUpperCase()
        - toLowerCase()
        - equalsIgnoreCase()
        - valudOf()


    03. java.lang
        - StringBuffer, StringBuilder
        - Math
        - Wrapper
            : Boxing    -->   Integer obj = 100; (자동 박싱)
            : UnBoxing  -->   int num = obj;     (자동 언박싱)
        - System
            : In/Out
            : exit
            : currentTimeMillis()  = 1/1,000     초
            : nanoTime()           = 1/1,000,000 초
            : getProperty()

        - Class 클래스
            : 메타데이터 관리
            : 클래스명칭등을 String으로 관리
            : getClass()
            : forName()
            : Reflection
            : 동적 객체 생성
    04. java.util.Objects  <정적 메소드>
        - Objects 의 "s"는  static이다.
        - compararator를 바탕으로 sort 할 수 있다.
        - hashCode()

        - 1. Arrays.copyOf
          2. Arrays.copyOfRange
          3. System.arraycopy (제일 빠름)

        - 1. Array.equals()      - 1차원 배열 비교
          2. Array.deepEquals()  - 2차원 배열 비교가능
          3. Arrays.sort
          4. Arrays.binarySearch - find  (반드시 sort 후에 진행해야)

        - 정규표현식, Pattern
          1. 전화번호 정규표현식
          2. 이메일 정규표현식
          3. 비밀번호 정규표현식
          4. pattern.matcher()
          5. pattern.compile()

        - Date Format
          1. yyyyMMdd, yyyy-MM-dd
          2. yyyy-MM-dd HH:mm:ss
          3. yyyy-MM-dd HH:mm:ss-Z

        - String Format
          1. split
          2. token



<java 고급 강좌 >

01. 제네릭(Generic)
    - 제네릭 타입이란 타입을 파라미터화하여, 실행 시에 구체적으로 해당하는 타입으로 결정이 되는 것을 의미한다.
    - 제네릭을 사용하면 컴파일 시에 강한 타입 체크 뿐만 아니라, 타입변환(Casting)을 사전에 제거할 수가 있다.
        : public class Person<T>

    - <멀티 타입 파라미터>
        : 제네릭은 2개 이상의 타입 파라메터를 사용해서 선언할 수가 있으며, 각 타입 파라메터는 콤마(,)로 구분한다.
        : public class Product<T,M>

    - <제네릭 메서드>는 리턴 타입 앞에 꺽쇠 기호를 추가하고, 타입 파라메터를 기술하며, 타입 파라메터를 리턴 타입과 매개변수에 사용한다.
        : public static<T> Person<T> changing(T t)
        : Person<Integer> p1 = Util.<Integer>changing(new Integer(100));

    - 타입 파라메터의 제한
        : 메서드의 타입 파라메터를 구체적으로 타입을 제한하고자 할 때 사용한다.
        : 상속이나 구현 관계를 이용하여 타입 파라메터를 제한할 수 있다.
            public static void registerCourse(Course<T> course) {                          // 제한 없음
            public static void registerCourseStudent(Course<T extends Student> course) {   // 익상 : 상위 클래스 제한
            public static void registerCourseWorker(Course<T super Worker> course) {       // 수하 : 하위 클래스 제한.

        : 와일드 카드. ?
            public static void registerCourse(Course<?> course) {                          // 제한 없음
            public static void registerCourseStudent(Course<? extends Student> course) {   // 익상 : 상위 클래스 제한
            public static void registerCourseWorker(Course<? super Worker> course) {       // 수하 : 하위 클래스 제한.

    - 제네릭 타입의 상속과 구현
        : 조상이 제네릭이면 자손도 제네릭타입이어야 한다.
          public class Student<T,M,C> extends Person<T,M>{


02. 멀티 쓰레드

    - 프로세스(process)란
        : 보통 프로세스라고 함은 실행 중인 하나의 프로그램을 칭한다.

    - 멀티 태스킹(multi tasking)
        : 멀티 태스킹은 통상 두 가지 이상의 작업을 동시에 처리하는 것을 칭한다.

        멀티 프로세스 : 독립적 프로그램을 여러 번 실행하고 작업을 처리하는 것
        멀티 스레드   : 하나의 프로그램을 실행하여, 내부적으로 여러 가지 작업을 처리하는 것

    - 메인 스레드(main thread)
        : 모든 자바 프로그램은 JVM의 메인스레드가 main()를 실행하면서 시작한다.

    - 작업 스레드
        : 메인 스레드는 작업 스레드들을 만들어서 병렬로 코드를 실행할 수 있으며, 그것이 곧, 멀티 태스킹을 수행하는 것이다.

    - 프로세스의 종료
        ▶ 싱글 스레드: 메인 스레드가 종료하면 프로세스도 함께 종료됨.
        ▶ 멀티 스레드: 실행 중인 스레드가 하나라도 있다면, 프로세스 종료되지 않는다.
            ☞ 메인 스레드가 작업 스레드보다 먼저 종료되더라도, 작업 스레드가 계속 실행 중이라면, 프로세스는 종료되지 않는다.

    - 작업 스레드 생성과 실행
        ▶ 몇 개의 작업을 병렬로 실행해야 할지 설계 단에서 결정해야 한다
            ☞ Thread 클래스로부터 직접 생성한다.
            ☞ Thread 하위 클래스로부터 생성한다.

    - Thread클래스로부터 직접 생성
        ▶ 방법 1(인터페이스를 통한 구현객체 이용) ☞ 가장 많이 이용함
        ▶ 방법 2(익명 구현객체 이용)            ☞ 간단히 이용
        ▶ 방법 3(람다(함수적 인터페이스)식 이용)  ☞ 코드 최소화

    - 동시성과 병렬성
        ▶ 동시성
            ☞ 멀티작업 위해 하나의 코어에서 멀티 스레드가 번갈아 가며 실행하는 성질
        ▶ 병렬성
            ☞ 멀티작업을 위해 멀티 코어에서 개별 스레드를 동시에 실행하는 성질

    - 스레드 우선 순위
        ▶ thread.setPriority(Thread.MAX_PRIORITY);
        ▶ thread.setPriority(Thread.MIN_PRIORITY);
        ▶ thread.setPriority(Thread.NORM_PRIORITY);

    - 동기화 메서드와 동기화 블록


/**
 *   <스레드의 상태제어>
 *       - 실행중에 있는 쓰레드의 상태를 변경할 수 있다.
 *     * - sleep()     : 주어진 시간 동안 일시 정지  (단위 : 밀리세컨드, 1/1,000초)
 *       - yield()     : 다른 쓰레드에게 실행 양보.
 *       - join()      : 다른 쓰레드의 종료를 기다림.
 *       <쓰레드 간의 협업 - 동기화 쓰레드에서만 사용 가능>
 *        * - wait()   : notify() 가 호출되기 전까지 무제한 잠을 자고 있음. Toggle 개념.
 *          - notify() : wait() 하고 있는 쓰레드를 깨워서 일을 시킴.
 *          - notifyAll()
 *     * - interrupt()  : 일시정지 상태를 만나면, InterruptException 에러를 발생시킴.
 *       - Deprecated 됨 : resume() / suspend() / - stop()
 *
 * */


    - 데몬 쓰레드 (Daemon Thread)
        : 메인 쓰레드 밑에 데몬 쓰레드를 실행시킬 수 있는데,
          메인이 종료되면, 데몬도 종료된다.

    - 쓰레드 그룹 (Thread Group)
        : 그룹으로 관리하면, 그룹단위로 실행 종료시킬 수 있다.
        : 일괄 Interrupt() 시 유용함.
			System.out.println("소속 그룹   : " + thread.getThreadGroup().getName());
			System.out.println("스레드 이름 : " + thread.getName() + ((thread.isDaemon() ? " (데몬스레드)" : " (주스레드)")));

                소속 그룹   : main
                스레드 이름 : AutoSaveThread (데몬스레드)


		System.out.println("[메인 스레드 그룹의 list()메서드 호출 후 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

		//메인그룹 포함 하위그룹까지 모든 정보가 출력됨.
		mainGroup.list();

            java.lang.ThreadGroup[name=main,maxpri=10]           // ThreadGroup 정보, 최대우선순위 :10
                Thread[main,5,main]                              // 메인에 5개의 쓰레드 실행 중
                Thread[Monitor Ctrl-Break,5,main]                //
                Thread[Attach API wait loop,10,main]             //
                java.lang.ThreadGroup[name=myGroup,maxpri=10]    // 하위 그룹정보.
                    Thread[workThreadA,5,myGroup]                // 하위 그룹1 : 우선순위 =5
                    Thread[workThreadB,5,myGroup]                // 하위 그룹2 : 우선순위 =5



    - 스레드 풀 (Thread Pool)
        : 작업 처리에 사용되는 스레드들 제한된 개수 만큼 미리 생성
          작업 큐에 들어오는 순서대로 하나씩 쓰레드가 처리한다.

        ======================================================================================
          메소드명(매개변수)                    초기 쓰레드 수  | 코어 쓰레드 수  | 최대 쓰레드 수
        --------------------------------------------------------------------------------------
        ▶ newCachedThreadPool()            ☞           0  |            0  | Integer.MAX_VALUE
        ▶ newFixedThreadPool(int nThreads) ☞           0  |     nThreads  | nThreads
        ======================================================================================





03. Collection




04. File I/O







<람다식 5가지 함수적 인터페이스>

1. Consumer (T, U) : 소비자
    - void로 리턴값이 없다.
    - 접미사 Consumer 사용
    - 추상메소드 : accept()

2. Supplier (공급자)
    - 매개변수가 없다.
    - 접미사 Supplier 사용
    - 추상메소드 : get(), getAsInt()

3. Function (함수)
    - 매개변수와 반환값이 있다.
    - 접미사 Function을 사용.
    - 추상메소드 : apply(), applyAsDouble()

4. Operator (연산자)
 - 매개변수와 반환값이 있다.
    - 접미사 Function을 사용.
    - 추상메소드 : apply(), applyAsDouble()

5. Predicate (논리자)

6. andThen() , compose()

7. and(), or(), negate()

8. isEqula()

9. 메소드 참조
   - 정적 메소드    :  클래스::메소드   = 클래스명으로 직접 호출이 가능하다.
   - 인스턴스 메소드 :  참조변수::메소드 = 반드시 new로 참조변수(인스턴스)를 만들어야 호출이 가능하다.
   - Math::min                    <--  (x, y) -> Math.min(x, y)

10. 매개변수의 메소드 참조
   - ToIntBiFunction
   - 클래스::compareToIgnoreCase;  <-- (a, b) -> a.compareToIgnoreCase(b);

11. 생성자 참조
   - 클래스:: new                  <--   (a, b) -> { return new 클래스(a, b) }









<알고리즘 12개>

합계 알고리즘: SumAlgorithm
개수 알고리즘: CountAlgorithm
평균 알고리즘: AverageAlgorithm
최댓값 알고리즘: MaxAlgorithm, 결괏값, 변숫값
최솟값 알고리즘: MinAlgorithm
근삿값 알고리즘: NearAlgorithm, 가까운 값
순위 알고리즘: RankAlgorithm, 등수
정렬 알고리즘: SortAlgorithm, 선택 정렬(Selection Sort), Bubble Sort, Quick Sort, ...
검색 알고리즘: SearchAlgorithm, 순차 검색, 이진 검색(Binary Search; 이분 탐색)
병합 알고리즘: MergeAlgorithm, 병합 정렬
최빈값 알고리즘: ModeAlgorithm
그룹 알고리즘: GroupAlgorithm


