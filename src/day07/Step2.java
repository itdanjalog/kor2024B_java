package day07;

public class Step2 { // class s
    public static void main(String[] args) { // main s

        // 실습1 : (2단)의 구구단 출력하시오.
        // 1. 반복문 없이 구현 ,
        // 동일한 코드 찾기 : System.out.println( " 2 * ? = ? " );
        // 증감 되는 데이터 찾기 : 1 ~ 9  , 1씩증가 !!!
        System.out.println(" 2 * 1 = 2 ");
        System.out.println(" 2 * 2 = 4 ");
        System.out.println(" 2 * 3 = 6 ");
        System.out.println(" 2 * 4 = 8 ");
        System.out.println(" 2 * 5 = 10 ");
        System.out.println(" 2 * 6 = 12 ");
        System.out.println(" 2 * 7 = 14 ");
        System.out.println(" 2 * 8 = 16 ");
        System.out.println(" 2 * 9 = 18 ");
        // 2. 반복문 으로 구현
        // 초기값 : 1  , 조건문 : 9  , 증감식 : 1씩증가
        for (int 곱 = 1; 곱 <= 9; 곱++) {
            // System.out.println(" 2 * " + 곱 +" = "+ ( 2 * 곱 ) );
            System.out.printf(" 2 * %d = %d \n", 곱, (2 * 곱));
        } // for end

        // 실습2 : ( 2단~9단 )의 구구단 출력하시오.
        // 1. 단 : 초기값: 2  조건문 : 9까지 증감식 : 1증가 , 단은 2단 부터 9단 까지 1씩 증가
        // 2. 곱 : 초기값: 1  조건문 : 9까지 증감식 : 1증가 , 곱은 1곱 부터 9곱 까지 1씩 증가
        // -- 단 마다 곱을 계산하나요?? O  곱 마다 단을 계산하나요? X
        System.out.println(" 2 * 1 = 2 ");
        System.out.println(" 2 * 2 = 4 ");
        System.out.println(" 2 * 3 = 6 ");
        System.out.println(" 2 * 4 = 8 "); // ~~~ 9 까지
        System.out.println(" 3 * 1 = 3 "); // ~~~ 9까지
        System.out.println(" 4 * 1 = 4 "); // ~~~ 9까지
        // 3. 단 for
        for (int 단 = 2; 단 <= 9; 단++) {
            System.out.println(단);
        }
        // 4. 곱 for
        for (int 곱 = 1; 곱 <= 9; 곱++) {
            System.out.println(곱);
        }
        // -----> 단for 안에 곱 for문 코드를 넣을껀지 ???   곱 for 안에 단 for문 코드를 넣을껀지???
        // for의 중첩

        // - 단
        for (int 단 = 2; 단 <= 9; 단++) {
            // - 곱
            for (int 곱 = 1; 곱 <= 9; 곱++) {
                System.out.printf("%d * %d = %d \n", 단, 곱, (단 * 곱));
            } // 하위 for문 end

        } // 상위 for문 end

        // [1] for문의 중첩
        for (int i = 1; i <= 5; i++) { // i는 1부터 5이하 까지 1씩증가 하면서 반복 하겠다는 의미 , 총 5회 실행
            System.out.println("[1]for 반복중 : " + i);
            // [2]
            for (int j = 1; j <= 3; j++) { // j는 1부터 3이하 까지 1씩증가 하면서 반복 하겠다는 의미 , 총 3회 실행 * 상위 for 횟수 => 15회
                System.out.println("\t[2]for 반복중 : " + j);
                // [3]
                for (int h = 1; h <= 2; h++) { // h는 1부터 2이하 까지 1씩증가 하면서 반복 하겠다는 의미 , 총 2회 실행 * 상위 for 횟수 => 30회
                    System.out.println("\t\t[3]for 반복중 : " + h);
                } // 3. for end
            } // 2. for end
        } // 1.for end
        // + 코드 { } , 들여쓰기 를 자동으로 맞추는 단축키 : ctrl+a(전체코드선택) --> ctrl+ alt + L

        // 반복문 주요 키워드( 기능이 담긴 단어들 )
            // continue : for 문으로 이동 , break : for 문 강제 종료

        // [1] continue : 가장 가까운 for문의 증감식으로 이동
        for( int i = 1 ; i<=5 ; i++ ){ // i는 1부터 5이하까지 1씩증가 반복
            if( i == 3 ) { continue; } // 만약에 i번쨰가 3이면 continue( 가장 가까운 반복문[증감식] 으로 이동)
            System.out.println("i = " + i); // 1 , 2 , 4 , 5 출력 , 3은 출력되지 않는다 , --> i==3 일때 continue 실행되면 아래코드는 실행안됨.
        }// for end 

        // [2] break : 가장 가까운 for문의 (강제) 종료
        for( int i = 1 ; i<=5 ; i++ ){
            if( i == 3 ){ break; }      // 만약에 i번째의 값이 3이면 (강제)반복문 종료 된다. 더이상 for{}가 실행되지 않는다.
            System.out.println("i = " + i); // 1 , 2
        } // for end

    } // main e
} // class e









