package day13.step2;

// [1] 인터페이스 : 서로 다른 객체들을 하나의 타입으로 조작하기 위해 주로 사용됨
public interface KeyBoard {
    // [2] final static 상수 : 고정값 , 초기화가 필수이다.
    final static String CNAME = "코리아회사"; // 상수명은 대문자. , 회사명

    // [3] abstract 추상메소드 : 메소드를 선언부만 작성하고 {}구현부는 작성하지 않는다.
        // 반환타입 , 메소드명 , 매개변수 만 선언하고 { } 구현부는 없다.
        // - 각 클래스들이 해당 추상메소드를 구현할 예정이다.
    // (1) A키
    abstract void pushA( );
    // (2) S키
    abstract void pushS( );
    // (3) D키
    abstract void pushD( );

}
