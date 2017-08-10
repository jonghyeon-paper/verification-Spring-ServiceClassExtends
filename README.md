# verification-Spring-ServiceClassExtends
스프링 프레임워크의 서비스 클래스를 상속받아서 구현이 가능한지 검증

0.배경
- 프로젝트를 진행중에 리팩토링을 진행했다. 그런데 리팩토링을 완료하고 서비스를 DI주입받는 과정에서 타입이 다르다는 예외가 발생했다. 다음은 예외 메시지이다.
- ERROR: org.springframework.web.servlet.DispatcherServlet - Context initialization failed
org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'hello5Controller': Unsatisfied dependency expressed through field 'hello5Service'; nested exception is org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'hello5Service' is expected to be of type 'spring.hello.service.Hello5Service' but was actually of type 'com.sun.proxy.$Proxy23'

1.검증과정
- 서비스를 다음 케이스별로 검증한다.
- 단일클래스 서비스, 인터페이스 상속받은 서비스, 추상클래스를 상속받은 서비스, 인터페이스를 상속받은 추상클래스를 상속받은 서비스.

2.검증
- 단일클래스 서비스 : 성공
- 인터페이스를 상속받은 서비스 : 성공
- 추상클래스를 상속받은 서비스 : 성공
- 인터페이스를 상속받은 추상클래스를 상속받은 서비스 : 성공

3.추론
- 동일 예외케이스 발견실패
- 기존에 사용하지 않던 추상클래스와 추상클래스에서 제너링타입을 사용하고 있었음.
- 추상클래스와 제너릭타입으로 검증.

4.검증과정
- 서비스를 다음 케이스로 검증한다.
- 제너릭타입을 사용하는 인터페이스를 상속받은 서비스, 제너릭타입을 사용하는 추상클래스를 상속받은 서비스, 제너릭타입을 사용하는 인터페이스를 상속받은 제너릭타입을 사용하는 추상클래스를 상속받은 서비스.

5.검증
- 제너릭타입을 사용하는 인터페이스를 상속받은 서비스 : 성공
- 제너릭타입을 사용하는 추상클래스를 상속받은 서비스: 성공
- 제너릭타입을 사용하는 인터페이스를 상속받은 제너릭타입을 사용하는 추상클래스를 상속받은 서비스: 성공

6.추론
- 동일 예외케이스 발견실패.
- 프로젝트는 미니멀라이즈하게 리팩토링하여 검증.

7.검증과정
- 코드라인을 제거하면서 검증.

8.결과
- 동일 예외케이스 발견.
- 원인은 인터페이스를 상속받은 서비스에서 문제가 발생했다. 단순히 인터페이스를 상속받는것은 아무 문제가 없다. 다만 여기에 다른 조건이 포함된다. 조건은 다음과 같다.
  > 조건1 : 인터페이스를 상속받은 서비스 클래스.
  > 조건2 : 클래스 메소드에 트랜잭션 어노테이션이 설정.
  > 조건3 : 서비스를 DI주입받는 곳에서 인터페이스 변수가 아닌 클래스 변수로 주입.
- 테스트케이스는 Hello5Controller, Hello5Service이다.

<hr/>

999.해당문제에 대해 관련문서를 찾아보았으나 검색능력 부족인지 정확한 원인을 찾지는 못했다. 그래서 추론하건데 어노테이션기반의 트랜잭션 처리 시 인터페이스를 상속받은 서비스를 주입하는 방식에 관련이 있는 것 같다. 우선은 이 정도에서 마치고 더 자세한 내용은 추후에 추가하도록 하겠다.

999.그리고 서비스클래스는 인터페이스든 클래스든 추상클래스든 상속을 받는데에는 아무 문제가 없다.

