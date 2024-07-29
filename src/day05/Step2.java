package day05;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        // 실습2 : 다양한 연산자 문제 풀이.
            // - 입력객체 생성
        Scanner scan = new Scanner( System.in );

        // 1. 하나의 정수 타입의 데이터를 입력받아서 데이터가 7의 배수이면 true 출력하고 아니면 false 출력하시오.
            // - 배수 찾기 공식 : 특정 '값' 의 나누기 '수' 를 했을때 나머지가 0 이면 해당 값은 그 수의 배수값
            // - 값 % 배수 == 0
        /*
        System.out.print("[1] 정수 입력 : ");           // 1. 입력받기전에 무엇을 입력해야 되는지 안내출력 를 한다.
        int answer1 = scan.nextInt();                  // 2. 입력받은 값을 int타입으로 answer1 변수에 저장/대입 한다.
        boolean result1 = answer1 % 7 == 0 ;           // 3. 입력받은 값 이 7의 배수인지 비교 연산 결과를 result1 변수에 저장/대입한다.
        System.out.println("[1] 결과 : " + result1 );  // 4. result1 변수 값을 print() 함수 출력한다.
        */
                        //  "문자열" + true(boolean) ---> "[1] 결과 : true"
                        //  "문자열" + false(boolean) ---> "[1] 결과 : false"
                        // - 변수명을 호출시 변수명이 출력되는게 아니라. 변수가 가진 값이 출력된다.

        // 2. 하나의 정수 타입의 데이터를 입력받아서 데이터가 홀수이면 true 출력하고 아니면 false 출력하시오.
            // - 홀/짝 찾기 공식 : 특정 '값' 의 나누기 2 를 했을때 나머지가 0 이면 짝수 이고 1 이면 홀수 이다.
            // - [짝수] 값 % 2 == 0  , [홀수] 값 % 2 == 1
        /*
        System.out.print("[2] 정수 입력 : ");
        int answer2 = scan.nextInt();
        boolean result2 = answer2 % 2 == 1;
        System.out.println("[2] 결과 : " + result2 );
        */

        // 3. 하나의 정수 타입의 데이터를 입력받아서 데이터가 3의 배수 이면서  짝수 이면 true 아니면 false 출력하시오.\
        /*
        System.out.print("[3] 정수 입력 : ");
        int answer3 = scan.nextInt();
        boolean result3 = ( answer3 % 3 == 0 ) && ( answer3 % 2 == 0 ) ;    // && : 앞 뒤 연산결과가 모두 true 이면 결과도 true
        System.out.println("[3] 결과 : " + result3 );
        */

        // 4. 하나의 정수 타입의 데이터를 입력받아서 데이터가 7의 배수 이거나 홀수 이면 true 아니면 false 출력하시오.
        /*
        System.out.print("[4] 정수 입력 : ");
        int answer4 = scan.nextInt();
        boolean result4 = (answer4 % 7 == 0) || (answer4 % 2 == 1) ;        // || : 앞 뒤 연간결과가 하나라도 true 이면 결과도 true
        System.out.println("[4] 결과 : " + result4  );
        */

        // 5. 하나의 정수 타입의 반지름 값을 입력받아서 원넓이 를 계산하여 출력하시오.
            // - 원넓이 계산식 : 반지름 * 반지름 * 원주율(3.14) , 단) 출력시 소수점 둘째 자리 까지 출력 하시오.
        /*
        System.out.print("[5] 반지름 : ");
        int answer5 = scan.nextInt();
        double result5 = answer5 * answer5 * 3.14 ; // 3.14는 리터럴값의 double 형 타입이다.
        System.out.printf("[5] 결과 : %.2f \n " , result5 );  // 형식 지정 문자 : %f 실수타입의 형식 , %.2f 실수타입의 소수점 둘째 자리 까지의 형식
        */
        // 6. 실수 타입의 윗변 , 밑변 , 높이 각각 입력받아 사다리꼴 넓이 계산하여 출력하시오.
            // - 사다리꼴 계산식 : ( 윗변 + 밑변 ) * 높이 / 2 , 단) 출력시 소수점 첫째 자리 까지 출력 하시오.
        /*
        System.out.print("[6] 윗변 : ");  double answer6_1 = scan.nextDouble();
        System.out.print("[6] 밑변 : ");  double answer6_2 = scan.nextDouble();
        System.out.print("[6] 높이 : ");  double answer6_3 = scan.nextDouble();
        double result6 = ( answer6_1 + answer6_2 ) * answer6_3 / 2 ;
        System.out.printf("[6] 결과 : %.1f \n " , result6 );
        */

        // 7. 하나의 정수 타입의 키 값을 입력받아서 표준체중 를 계산하여 출력하시오.
            // - 표준체중 계산식 : (키-100)*0.9                 , 단) 표준체중 은 정수타입 으로 합니다.
        /*
        System.out.print("[7] 키 : ");
        int answer7 = scan.nextInt();
        int result7 = (int)( (answer7-100) * 0.9 );  // 오류 발생하는 이유 : 0.9( 실수 리터럴 ) , int * double 연산시 결과는 double
        System.out.println("[7] 결과 : " + result7 );
        */

        // 8. 정수 타입의 키(cm) 와 몸무게 를 입력받아서 BMI 를 계산하여 출력하시오.
            // - BMI 계산식 : 몸무게 / ( (키/100.0) * (키/100.0 ) ) , 단) 출력시 소수점 둘째 자리 까지 출력 하시오.
            //                몸무게 / 신장(m)제곱
        System.out.print("[8] 키 : ");
        int answer8_1 = scan.nextInt();

        System.out.print("[8] 몸무게 : ");
        int answer8_2 = scan.nextInt();

        double result8 = answer8_2 / ( ( answer8_1/100.0) * ( answer8_1/100.0) ) ;
        System.out.printf("[8] 결과 : %.2f \n " , result8 );


    } // main end
} // class end










