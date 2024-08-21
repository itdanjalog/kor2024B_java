package day13.step1;

// [인터페이스]
public interface ExampleInterFace {
    // 인터페이스 구성 멤버
    // 1. 멤버변수X / 필드X , [ 상수 O ]
    // int var1; // ??? 오류 ???
    int var1 = 10; // 오류 해결 , 상수 , 코드는 없지만 자동으로 final static
    final static int var2 = 20; // final static 생략해도 된다.

    // 2. 생성자X
    // ExampleInterFace() {} // ??? 오류 ??? 사용안함 ,
    // 생성자없 으면 객체도 못만드는데..
    // 즉] 인터페이스 타입은 클래스와 다르게 자체적인 객체 생성이 불가능하다.

    // 3. 메소드X , [ 추상메소드 O ]
    //int method1(int a) { return a*2; }// ??? 오류 ???
    int method1(int a); // 오류 해결 , { } 지우기 , 코드에는 없지만 자동으로 abstract
    abstract int method2( int a ); // abstract 생략해도 된다.
}
