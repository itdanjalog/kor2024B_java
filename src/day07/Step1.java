package day07;

import java.util.Scanner;

public class Step1 { // class s
    public static void main(String[] args) { // main s

        // 제어문( 반복문 )
            // - 반복(되풀이) 한다.
            // - +추가기능 : 조건에 따른 true 일때 반복(되풀이) 한다.
            // - 문법
                // - for( 초기값 ; 조건문 ; 증감식 ) {   }
                // 초기값(반복변수) : 반복문이 실행될때 처음에 변수를 선언해서 반복문에 사용되는 변수
                // 조건문 : 특정 조건에 따른 true 이면 { } 실행 , 아니면 fasel 이면 { } 반복문 종료
                // 증감식 : 반복변수가 증가 혹은 감소 단위

        // 1. 같은 코드를 5번 반복 코드 입력, 단 숫자는 다르다.
        System.out.println("countDown 1");
        System.out.println("countDown 2");
        System.out.println("countDown 3");
        System.out.println("countDown 4");
        System.out.println("countDown 5");

        // [1] 숫자는 1부터[초기값] 5이하 까지[조건문] 1씩증가[증감식]
        for( int i = 1  ; i<=5 ; i++ ){
            System.out.println("countDown " + i );
        }

        // [2] 1부터 10까지 1씩 증가면서 숫자를 출력하시오.
            // 초기값 : 1 , 조건문 : 10까지 , 증감식 : 1씩증가
        System.out.println("1");        System.out.println("2");        System.out.println("3");
        System.out.println("4");        System.out.println("5");        System.out.println("6");
        System.out.println("7");        System.out.println("8");        System.out.println("9");
        System.out.println("10");
        // --------
        for( int i = 1 ; i<=10 ; i++ ){
            System.out.println( i );
        } // f end

        // [3] 1부터 100까지 1씩증가하면서 누적 합계 구하여 를 총 누적합계를 출력하시오.
            // 초기값 : 1 , 조건문 : 100까지 , 증감식 : 1씩증가
        int sum = 0;    // !! : 총 누적합계를 저장하는 변수
        for( int i = 1 ; i <= 100 ; i++ ){
            // !! : i번째 값을 누적합계를 더한다.
            sum = sum + i;
        } // f end
        System.out.println("총 누적합계 : " + sum );

        // [4] 1부터 100까지 1씩증가하면서 7배수만 누적합계 구하여 총 누적합계를 출력하시오.
            // 4-1 초기값 : 1 , 조건문 : 100까지 , 증감식 : 1씩증가
            // 4-2 초기값 : 0 , 조건문 : 100까지 , 증감식 : 7씩증가 , i = i + 7  vs i += 7
        // 4-1
        int sum2 = 0;
        for( int i = 1 ; i<=100 ; i++ ){
            // 만약에 i번째 값이 7의 배수이면 누적합계 더한다.
            if( i % 7 == 0 ) { sum2 = sum2 + i ; }
        }
        System.out.println("sum2 = " + sum2);

        //4-2
        int sum3 = 0;
        for( int i = 0 ; i<=100 ; i = i+7 ){
            sum3 += i;
        }
        System.out.println("sum3 = " + sum3);

        // [5] 입력받은 정수 만큼의 반복하여 반복변수를 출력하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("[5] 정수 입력 : ");
        int value = scan.nextInt();
            // 초기값 : 1  , 조건문 : 입력받은값까지 , 증감식 : 1씩증가
        for( int i = 1 ; i <= value ; i++ ){
            System.out.println("i = " + i);
        }


     } // main e
} // class e









