package day05;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        // [1] 삼항 연산자
            // 주로 조건 결과 가 true 일때 다른값 으로 대체 , false 일때 다른값으로 표현할때 사용된다.
            // 조건식 ? 참 : 거짓
            // 중첩 : 조건식1 ? 참1 : 조건식2 ? 참2 : 거짓
                // - 여러번의 중첩이 가능 하지만 가독성(읽기) 떨어진다.
                //    그러므로 다양한 조건의 제어는 IF(조건문) 주로 사용된다.
            // 항 자리에서는 함수호출 , 선언부 은 불가능하다. 리터럴 이나 수식 목적으로 사용된다.
                // 참일때 또는 거짓일때 함수호출 또는 변수생성 시 IF(조건문) 사용해야 한다.
        // 1.
        int x = 30;
        String str1 = x >= 20 ? "진실" : "거짓";
        // 2.
        int y = 14; // y값이 7의 배수이면 true 대신 '7배수입니다.' 아니면 false 대신 '7배수가 아닙니다.' 표현
        // y % 7 == 0 ? true대체 값 : false대체 값
        String str2 = y % 7 == 0 ? "7배수 입니다" : "7배수 아닙니다.";
        System.out.println("str2 = " + str2);
        // 3. 
        int age = 15; // 만약에 나이가 19세 이상이면 '성인' 아니면 '미성년자' 출력하시오
        // - 조건식 : 나이가 19세 이상
        // - 참(true) 일때 '성인'   - 거짓(false) 일때 '미성년자'
        // 1. age >= 19 : 비교연산자 사용시 결과는 true 또는 false 이다..
        String pass = age >= 19 ? "성인" : "미성년자";
        System.out.println("pass = " + pass);
        // 4. 만약에 나이가 19세 이상이면 '성인' , 6세 이상이면 '학생' 아니면 '유아' 출력하시오.
        String pass2 = age >= 19 ? "성인" : age >= 6 ? "학생" : "유아" ;
        System.out.println("pass2 = " + pass2);


         
        // [2] 조건문 : 조건 결과에 따른 코드 흐름 제어
            // if( 조건식 ){ 참일때코드;  }
            // else{ 거짓일때코드; }
            // 다양한 조건식 표현 : if ~ else if
        // 1.
        if( x >= 20 ){ String str3 = "진실"; }
        else{ String str3 = "거짓"; }

        // 3.
        if( age >= 19 ){ String pass3 = "성인"; }
        else{ String pass3 = "미성년자"; }

        // 4. 다양한 조건의 따른 if ~ else if
        if( age >= 19 ){ String pass4 = "성인"; }
        else if( age >= 6 ){ String pass4 ="학생"; }
        else{ String pass4 ="유아"; }


        // 실습1 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("[1] 정수 입력 : ");           // 1. 입력받기전에 무엇을 입력해야 되는지 안내출력 를 한다.
        int answer1 = scan.nextInt();                  // 2. 입력받은 값을 int타입으로 answer1 변수에 저장/대입 한다.
        boolean result1 = answer1 % 7 == 0 ;           // 3. 입력받은 값 이 7의 배수인지 비교 연산 결과를 result1 변수에 저장/대입한다.
        System.out.println("[1] 결과 : " + (result1 ? 'O' : 'X' ) );  // 4. result1 변수 값을 삼항연산자를 이용하여 boolean 값을 다른값으로 출력하기


    }
}






















