package day13.step1;
// 클래스 사용처 : 1. 객체설계도 클래스 2. 실행클래스( main 메소드 )
// 클래스 구성멤버
    // 1. 멤버변수/필드 : 객체의상태의 값을 저장하는 변수 역할
    // 2. 생성자 : new 연산자 이용한 객체 생성시 객체의 멤버변수를 초기화(처음에값대입) 담당 역할
    // 3. 메소드/멤버함수 : 객체의 행동( 여러개 ;세미콜론 기준들의 코드들이 모여있는 구역 - 여러 코드를 묶음 ) 역할
// 2. 실행클래스
public class Step1 {
    public static void main(String[] args) {
        // [1] ExampleClass 클래스(설계도) 의 객체(인스턴스/실체) 생성
        ExampleClass ec1 = new ExampleClass();
        // ExampleClass : 변수에 타입을 선정, 왜?? ExampleClass 객체를 저장할려고
            // 타입종류 1.기본타입(8개) 2.참조타입( 8개외 모두 )
            // int a = 10; - '10' 정수를 저장하기 위해서 int 타입의 변수 선언
            // new ExampleClass() 객체를 저장하기 위해서 ExampleClass 타입의 변수 선언
        // ec1 : 변수명 , 카멜표기법( dataTime , studentType 등등 )
        // = : 대입
        // new : 인스턴스(객체) 생성 연산자 , 뒤로 생성자가 온다.
        // ExampleClass(); : 클래스의 생성자 멤버, 객체를 만들어서 왼쪽에 객체가 위치한 주소를 반환한다.
            // int a = 10; // --- 10를 호출해서 a변수에 저장
            // 10; // 10를 호출만.
            // ExampleClass ec1 = new ExampleClass(); // 객체를 생성해서 ec1변수에 객체 위치를 대입/저장
            // new ExampleClass(); // 객체를 생성

        // [2] ExampleInterFace 인터페이스 의 객체 생성
        // ExampleInterFace ei1 = new ExampleInterFace(); // 오류 발생
            // - 인터페이스는 생성자가 존재하지 않는다. 그러므로 객체를 만들수 없다.
        // [3] 인터페이스의 상수 호출 , 인터페이스명.상수명
        System.out.println( ExampleInterFace.var1 );
        // [4] 인터페이스의 추상메소드 호출 , 추상 메소드를 구현한 구현(객)체 가 필요하다.
        new InterFaceClass(); // (인터페이스의 추상메소드를)구현(한 객체)체
        ExampleInterFace ei1 = new InterFaceClass();
        ei1.method1( 10 );
        // ExampleInterFace 의 method1 추상메소드를
        // InterFaceClass가 method1 구현( {} )해서 메소드를 호출
    }
}

















