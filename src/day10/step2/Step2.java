package day10.step2;

public class Step2 {
    public static void main(String[] args) {

        // (1) 계산기 설계도/클래스를 이용한 계산기A 객체 생성 ( 1번째 객체 )
        Calculator calA = new Calculator();
            // --- 메소드 호출/사용
        // 더하기를 처리 합니다. 더한 값(8) 를 리턴 받음
        calA.plus( 3 , 5 );
        // 더하기를 처리 합니다. , 더한 값(3) 를 리턴 받아 변수에 대입
        int result1 = calA.plus( 2 , 1 );
        System.out.println("result1 = " + result1); // 3
        // 더하기를 처리 합니다. , 더한 값(10) 를 리턴 받아 출력한다.
        System.out.println( calA.plus( 7 , 3 ) ); // ??? 10

        // (2) 계산기 설계도/클래스를 이용한 계산기B 객체 생성 ( 2번째 객체 )
        Calculator calB = new Calculator();

        // 실습2 : Calculator 클래스의 minus 함수 정의 하여 함수를 실행 하시오.
            // 매개변수 : int x , int y
            // 실행문 : x 값의 y값을 빼기
            // 반환 : int 계산결과를 반환
        int result2 = calB.minus( 10 , 3 );
        System.out.println("result2 = " + result2); // 7

    } // main end
} // class end
