package day06;

public class Step3 {
    public static void main(String[] args) {

        // [1] 제어문(반복문)
            // 반복문 : 특정한 행위/코드 를 반복적으로 한다.
            // 왜? 1. 행위/코드 를 반복하기 위해서 사용한다.
            /*
                형태
                    for( 초기값 ; 조건문 ; 증감식 ) { 실행문 }
                        1. 초기값 : 반복문이 반복할때 사용되는 값 , 주로 순번으로 사용됩니다.
                            int i = 1 ;  i는 1부터 시작
                        ;(세미콜론)를 이용한 각 구역 구분
                        2. 조건문 : 반복문이 반복할 여부 판단하는 곳 , 주로 비교,논리 으로 사용 됩니다.
                        3. 증감식 : 반복문이 1번(최초실행 제외) 실행 될때마다 실행되는 구역
                            i++ :  i가 1 증가한다.  j--; i가 1 감소한다.
                        4. 실행문 : 반복하면서 실행할 코드들
            */

        // 1. 1부터 5까지 출력하는 코드 , 5줄  , 1부터 100까지 출력??? 100줄
        System.out.print( 1 + " ");
        System.out.print( 2 + " ");
        System.out.print( 3 + " ");
        System.out.print( 4 + " ");
        System.out.print( 5 + " "); // 위 코드 5줄에서 반복적인과 비반복적 인 것을 찾아라.
                            // 1.  System.out.print , 2.( ? + " ");
                            // 2. 증가 또는 감소 하는 값 찾아라 , 1 2 3 4 5
        System.out.println();
        // 2.
        for( int i = 1 ; i<=5 ; i++ ){
            System.out.print( i + " ");
        }

        System.out.println();
            // 실행순서
                // i = 1
            // 1. 초기값 : int i = 1  , i는 1부터 시작한다.
            // 2. 조건문 : i <= 5      , i는 5이하 이면(true) 반복문 실행 , 아니면(false) 반본문을 실행하지 않는다.
            // 3. 실행문 : System.out.print( i + " ");  , 현재 i번째 값 출력한다.
            // 4. 증감식 : i++;
                // i = 2
            // 2. 조건문 : i <= 5 , i는 5이하 이면(true) 반복문 실행 , 아니면(false) 반본문을 실행하지 않는다.
            // 3. 실행문 : System.out.print( i + " ");  , 현재 i번째 값 출력한다.
            // 4. 증감식 : i++;
                // i = 3
            // 2. 조건문 : i <= 5 , i는 5이하 이면(true) 반복문 실행 , 아니면(false) 반본문을 실행하지 않는다.
            // 3. 실행문 : System.out.print( i + " ");  , 현재 i번째 값 출력한다.
            // 4. 증감식 : i++;

        // 3. 1부터 10까지의 총합계를 구하기.
            // 3-1 반복문 없이 방법1
        int sum = 0;
        sum = sum + 1;  // 1. 총합계 변수에 1를 더해서 총합계 변수에 대입한다.
        sum = sum + 2;      // sum += 2
        sum = sum + 3;      // sum += 3
        sum = sum + 4;
        sum = sum + 5;
        sum = sum + 6;
        sum = sum + 7;
        sum = sum + 8;
        sum = sum + 9;
        sum = sum + 10; // 2. 총합계 변수에 각 값을 더해서 총합계 변수에 대입한다.
        System.out.println( sum );
        // 총 코드의 길이가 10줄 ,
        // 3-2 반복문 활용 방법2
            // 1. 초기값 :  1 부터
            // 2. 조건문 :  10 까지
            // 3. 증감식 :  1씩 증가
            // 4. 반복되는 코드 : sum = sum + (1~10)
        sum = 0;
        for( int 반복변수 = 1 ; 반복변수<=10 ; 반복변수++ ){
            sum = sum + 반복변수;
        }
        System.out.println( sum );

    } // main end
} // class end




















