package day06_T; // 현재 class 가 위치한 패키지명/폴더명

public class Step1 { // class s
    public static void main(String[] args) { // main s
        // if 조건문
        // 1.
        int point = 82;
        // 만약에 내가 입력한 값이 저장된 point변수가
        // 80보다 이상이면 (true) 출력문이 실행되고 (false)아니면 실행 안된다.
        if( point >= 80 ){  System.out.println("입력받은 값은 80 이상입니다");  }

        // 2.
        // 만약에 내가 입력한 값이 저장된 point변수의
        // 값이 90 이상이면 (true)합격출력 아니면(false)이면 불합격출력
        if( point >= 90 ){  System.out.println("합격"); }
        else{   System.out.println("불합격");  }

        // 3. 다수 조건  : { } 는 무조건 한번 실행.
        if( point >= 90 ){  System.out.println("A등급"); }
        else if( point >= 80 ){ System.out.println("B등급"); }
        else if( point >= 70 ){  System.out.println("C등급");  }
        else{  System.out.println("탈락");  }
        // vs
        //  : { } 는 조건 충족에 따라 여러번 실행 될수 있다.
        if( point >= 90 ){  System.out.println("A등급"); }
        if( point >= 80 ){ System.out.println("B등급");  }
        if( point >= 70 ){  System.out.println("C등급");  }
    } // main e
} // class e

/*
    if 문 [조건문]
        - 경우의수(조건) 따른 실행 흐름 제어
        - 조건 : boolean
            - if( true )  ,  if( false )
            - boolean 변수 = true;   if( 변수 )
            - if( 3 > 5 )  , if( 3 > 1 && 3 < 10 )
            - int 변수 = 10;  if( 변수 - 10 > 5 )
            - if( 함수() )    * 함수의 return 값이 boolean 가능.

        - 삼항연산자 : 간단한 조건식 사용 vs 조건문if : 일반적으로 사용
        - 형태
            1. 단일 조건의 참 만 있을경우
                if( 조건 ) { (참true) 선언문; 실행문; }

            2. 단일 조건의 참/거짓이 있을경우
                if( 조건 ) { (참true) 선언문; 실행문; }
                else{  (거짓false) 선언문; 실행문;}

            3. 다수 조건
                - 하나의 { } 실행 : if ~ else if ~ else if 하나의 조건문으로 취급 [ 다수조건에 따른 결과 1개 ]
                if( 조건1 ) { (참true1) 선언문; 실행문; }
                else if( 조건2 ) { (참true2) 선언문; 실행문; }
                else if( 조건3 ) { (참true3) 선언문; 실행문; }
                else { (거짓false) 선언문; 실행문; }
                    // vs
                - 여러개의 { } 실행 : if{} if{} if{} : 여러개의 조건문으로 취급 [ 다수조건에 따른 결과 여러 개 ]
                if( 조건1 ) { (참true1) 선언문; 실행문; }
                if( 조건2 ) { (참true2) 선언문; 실행문; }
                if( 조건3 ) { (참true3) 선언문; 실행문; }

            4. 중첩
                if( 조건1 ) {
                    if( 조건1 t -> 조건2 ) { }
                    else{ }
                }else{
                    if( 조건1 f -> 조건2 ) { }
                    else { }
                }
*/
