package day13.step1;

public interface ExampleInterface {
    // 1. 상수 : public static final
    public static final int var1 = 10;
    int var2 = 20;    // 인터페이스 안에서는 변수 생성시 무조건 상수.

    // 2. 추상메소드 : abstract
    abstract int method1( int a );
    int method2( int a );
}
