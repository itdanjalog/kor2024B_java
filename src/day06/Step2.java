package day06;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        // - 입력객체
        Scanner scan = new Scanner(System.in);

        // 실습1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
        /*
            System.out.print("[1] 실습1 점수 : ");
            int score = scan.nextInt();             // 1. 입력받은 데이터를 정수타입으로 반환해서 int 변수에 대입
            if( score >= 90 ) {                     // 2. 비교 : 만약에 입력받은 값(score) 이 90 이상이면
                System.out.println("[1] 합격 ");      // 3. 참true 이면 해당 문자열 출력
            } // if{ } end
            else{                                   // 4. (90점이상)아니면
                System.out.println("[1] 불합격");      // 5. 거짓false 이면 해당 문자열 출력
            } // else { } end
        */
        // 실습2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
        /*
            System.out.print("[2] 실습2 점수 : ");
            int score = scan.nextInt();

            if( score >= 90 ){ System.out.println("[2] A등급 입니다."); }
            else if( score >= 80 ){  System.out.println("[2] B등급 입니다. ");  }
            else if( score >= 70 ) { System.out.println("[2] C등급 입니다.");  }
            else{  System.out.println("[2] 재시험 입니다."); }
        */
        // 실습3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
        /*
                // 1. 각 int타입으로 3개의 입력과 변수에 대입.
            System.out.print("[3] 실습3 정수1 : ");     int value1 = scan.nextInt();
            System.out.print("[3] 실습3 정수2 : ");     int value2 = scan.nextInt();
            System.out.print("[3] 실습3 정수3 : ");     int value3 = scan.nextInt();
                // 2. 하나씩 비교해서 가장 큰값 찾기.
                    // 2-1 방법1 : 각 변수별 값을 비교하기
            if( value1 > value2 && value1 > value3 ){ // 첫번째 값이 두번째 값보다 크고 첫번째 값이 세번째 값보다 크면
                System.out.println("[3] 가장 큰수 : " + value1 );
            }else if( value2 > value3 ){              // 두번째 값이 세번째 값보다 크면 ( 앞전 조건을 충족 안했다면 value1 > value2 할 필요가 없다 )
                System.out.println("[3] 가장 큰수 : " + value2 );
            }else{
                System.out.println("[3] 가장 큰수 : " + value3 );
            }
                    // 2-2 방법2 : 변수 활용하기
            int max = value1;   // 가정 : 첫번째 값을 가장 큰값으로 설정하기
            if( max < value2 ){ // 만약에 max 보다 두번째 값이 더 크면
                max = value2; // 가장 큰값을 value2 로 교체/수정
            }
            // - if ~ else if  가 아닌 if if 사용한 이유는 앞전에 조건을 충족하더라도 다음 조건을 실행 해야 하므로 사용한다.
            if ( max < value3 ) { // 만약에 max 보다 세번째 값이 더 크면
                max = value3; // 가장 큰값을 value2 로 교체/수정
            }
            System.out.println("[3] 가장 큰수 : " + max );
        */
        // 실습4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
            // 1. 3개의 정수를 입력받고 각 변수에 저장
        System.out.print("[4] 실습4 정수1 : "); int value1 = scan.nextInt();
        System.out.print("[4] 실습4 정수2 : "); int value2 = scan.nextInt();
        System.out.print("[4] 실습4 정수3 : "); int value3 = scan.nextInt();
            // 2. swap(교체) 를 이용한 변수들의 값 변경
        if( value1 > value2 ){ // 첫번째 값이 두번째 값보다 더 크면
            // 첫번재 값과 두번째 값 자리 바꾸기 , swap
            int temp = value1; // temp : 10 , value1 : 10 , value2 : 5
            value1 = value2 ;  // temp : 10 , value1 : 5 , value2 : 5
            value2 = temp;     // temp : 10 , value1 : 5 , value2 : 10
        }
        // 첫번째 값이 세번째 값보다 더 크면 두 변수간의 값을 스왑/교체
        if( value1 > value3 ){  int temp = value1;      value1 = value3;        value3 = temp;  }
        // 두번째 값이 세번째 값보다 더 크면 두 변수간의 값을 스왑/교체
        if( value2 > value3 ){ int temp = value2;       value2 = value3;        value3 = temp; }

        System.out.println("[4] 오름차순 : " + value1 +"\t"+ value2 +"\t"+ value3);

        /*
            [ swap ] : 두 변수의 값 교환하기
            int a = 10; int b = 5;
            - a 와 b 가 가진 변수 값을 서로 교환 하시오.
            - 주의할점 : 1.변수는 하나의 값만 저장할수 있다. 2. 코드는 ; 세미콜론 기준으로 하나씩 처리한다.
                a = b;  a 변수에 b를 대입하면 순간 기존 a의 값은 사라진다.
            - 해결방안 : 임시변수를 만들어서 시계방향으로 스왑하자.
                1. 임시변수 하나 선언한다.
                    int temp;                       a = 10 , b = 5
                2. 첫번째 값을 temp 변수에 대입한다.
                    temp = a                        temp = 10 , a = 10 , b = 5
                3. 두번째 값을 첫번째 변수에 대입한다.
                    a = b                           temp = 10 , a = 5 , b = 5
                4. temp 값을 두번째 변수에 대입한다.
                    b = temp                        temp = 10 , a = 5 , b = 10

        */



    } // main end
} // class end


















