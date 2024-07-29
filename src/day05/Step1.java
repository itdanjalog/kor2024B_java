package day05; // 현재 class 가 위치한 패키지명/폴더명

import java.util.Scanner;

public class Step1 { // class s
    public static void main(String[] args) { // main s
        // 실습1 : 기본급 과 수당 을 정수타입으로 각 입력받아서 실수령액 계산하고 출력하시오.
        // - 실수령액 계산식 : 기본급 + 수당 - 세금   , 단 세금은 기본급의 10% 계산하시오.
        // 1. 입력 객체 생성
        Scanner scan = new Scanner( System.in );
        // 2. 입력 객체를 이용한 정수를 입력받아서 변수에 대입/저장하기
        System.out.print("[1] 기본급 입력 : ");
        int 기본급 = scan.nextInt();
        System.out.print("[1] 수당 입력 : ");
        int 수당 = scan.nextInt();
        // 3. 계산  , 컴퓨터는 퍼센트를 모른다.   100% -> 1 , 10% -> 0.1 , 1% -> 0.01 , 50% -> 0.5
        // int 실수령액 = 기본급 + 수당 - (기본급*0.1); // 오류가 발생하는 이유 ?  기본급(int) + 수당(int) - ( 기본급(int) * 0.1(double) )
            // - 서로 다른 타입끼리 연산시 주로 상위타입으로 자동 타입 변환이 된다. int * double => double
        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1); // 해결방안 : double 타입을 강제로 int 타입으로 변환하자.
        System.out.println("실수령액 = " + 실수령액);

    } // main e
} // class e
