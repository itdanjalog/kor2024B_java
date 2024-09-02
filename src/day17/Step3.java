package day17;

import java.util.Scanner;

public class Step3 {
    // 1. main 함수
    public static void main(String[] args){

        // [1] 예외 떠넘기기/던지기
        try {  method1(); // 지정 메소드 호출 후 예외가 발생하면 예외처리
        }catch (Exception e ){   System.out.println(e);    }

        // 실습2 : 두수의 실수를 매개변수로 하는 나누기 결과를 반환하는 함수를 구현하시오.
            // main 함수에서 두 실수를 입력받아 divide함수를 정의하여 두 실수를 매개변수로 전달한다.
            // divide함수는 매개변수로 받은 두 실수를 나누기 하여 결과를 반환하는 함수이다.
            // 단] 나누기 했을때 예외가 발생하면 예외 던지기를 해서 함수를 호출했던 곳에서 예외 처리하시오.

        // 함수 호출
        try {
            Scanner scan = new Scanner(System.in); // 1.입력객체
            System.out.print("x : ");
            double x = scan.nextDouble(); // 2. 실수 입력받기
            System.out.print("y : ");
            double y = scan.nextDouble(); // 2. 실수 입력받기
            double result = divide(x, y); // 3. 함수를 호출 하고 반환된 결과를 result 변수에 대입 한다.
            System.out.println("result = " + result); // 4. result 변수 출력
        }catch (Exception e ){ System.out.println("예외가 발생했습니다."); }

    } // main end

    // 3. divide 메소드 정의/만들기
    public static double divide( double x , double y ) throws Exception { // throws Exception 예외 던지기
        // [접근제한자] public 키워드는 지정 함수를 모든 클래스에서 호출 가능하도록 정의하겠다는 뜻
        // [정적] static 키워드는 지정 함수를 객체(인스턴스)없이 호출 가능하도록 정의하겠다는 뜻
        // [반환타입] double 지정함수는 return 할 자료의 타입이 double 이라는 뜻 , void(반환타입이 없다는 뜻)
        // [함수명] divide 함수이름은 아무거나 # 카멜표기법 권장
        // [매개변수] ( double x , double y ) 함수 호출 했을때 전달받은 인자값을 각 x 와 y에 대입 받겠다는 뜻
        // { } : 함수 호출 시 실행되는 구역
        double result = x / y ; // 두 매개변수를 나누기 하고 결과를 result 변수에 대입
        // [리턴/반환] return 함수가 종료되면서 반환/리턴/복귀 할 자료
        return result;
    }

    // 2. method1 메소드 정의
    public static void method1( ) throws ClassNotFoundException {
        // [접근제한자-멤버변수/메소드]  public 공적인 : 모든 클래스 호출 가능하다는뜻 vs private 사적인 : 현재 클래스에서만 호출 가능하다는뜻
        // [정적-멤버변수/메소드] static 정적인 : 변수나 메소드는 객체(인스턴스)없이 사용가능한 정적(전역)변수 또는 메소드 선언
        // void : 메소드의 반환타입이 없다는 뜻
        // method1 : 메소드명/이름 , 임의
        // ( ) : 매개변수
        // 예외가 발생했을때 예외발생 처리 방법 : 1. 직접 try{}catch(){} 2. 던지기 throws
        try { Class.forName("java.lang.String"); }
        catch ( Exception e ){ System.out.println( e ); }
        // 예외가 발생했을때 해당 함수를 호출했던 곳으로 예외를 전달하기 : throws ClassNotFoundException
        Class.forName("java.lang.String2"); // 해당 메소드에서 예외 던지기
    } // method1 end

} // class end
