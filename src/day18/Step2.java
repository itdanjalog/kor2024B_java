package day18;

import java.util.Arrays;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        // [실습1] 입력받은 금액의 천단위 쉼표를 표현하기
        // [입력1] 123456 --> [출력] 123,456
        // [입력2] 1234567 --> [출력] 1,234,567
        Scanner scan = new Scanner(System.in);
        System.out.print("금액 입력 : ");
        String money = scan.next();
            System.out.println("money = " + money); // 1.  입력받은 자료 확인
        String outStr = "";
        // 여기에 풀이
            // 2. 입력받은 문자열을 하나씩 반복문 이용하여 문자 1개씩 추출
                // * 문자열.length()-1 : 마지막인덱스
        for( int index = 0 ; index < money.length() ; index++ ){
            System.out.print( " index : " + index );
            // 3. 입력받은 문자열 내 문자1개씩 출력
            System.out.println( "  char : " + money.charAt( index ) );
                // - 만약에 인덱스가 3의 배수이면
                // 1. 뒤에서 부터의 자료 확인
                    // money.length() - index : 7 - 0 - > 7
                    // money.length() - index : 7 - 1 - > 6
                    // money.length() # 뒤에서 부터의 자료 확인
                // 2. 인덱스는 0보다 컸을때만
            if( index > 0 && ( money.length() - index ) % 3 == 0){
                outStr += ",";
            }
            // 4. 새로운 문자열변수에 옮겨 담기
            outStr += money.charAt( index ); // # +=복합대입연산자 # 우항값을 좌항에 계산하여 결과를 좌항에 대입 # 누계
        }
        System.out.println("outStr = " + outStr);
    } // main end
} // class end










