package day04;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        // [1] 입력객체 생성 , import java.util.Scanner;
        Scanner scan = new Scanner(System.in);

        // [2] 2명의 3가지 데이터 입력 받기 , 총 6번
        System.out.print("[1] age : ");
        byte age1 = scan.nextByte();
        System.out.print("[1] name : ");
        String name1 = scan.next();
        System.out.print("[1] content : ");
        String content1 = scan.next();

        System.out.print("[2] age : ");
        byte age2 = scan.nextByte();
        System.out.print("[2] name : ");
        String name2 = scan.next();
        System.out.print("[2] content : ");
        String content2 = scan.next();

        // [3]
        System.out.println("나이\t작성자\t방문록내용");
        System.out.println( age1 +"\t" + name1 + "\t" + content1 );
        System.out.println( age2 +"\t" + name2 + "\t" + content2 );

    }
}
/*
    실습1 : 입력 , 저장 , 출력 활용
        - 아래와 같이 출력하시오.
        - 2명의 나이 와 작성자 와 내용 을 입력받아 출력하시오.
            - 입력 횟수 : 6번 , ( 나이,작성자,내용 , 나이,작성자,내용 )
            - 자바에서 입력 받는 방법/준비물
                1. 입력객체 : Scanner scan = new Scanner( System.in );
                2. 입력 객체 를 이용한 입력함수 : .next~~~()
        - 단 변수의 타입은 적절히 사용하세요.  정답은 없지만 , 표현범위 고려
                나이 = 기본 타입 선정 ??? 고민    , 나이는 소수점이 아니고 문자도 아니므로 주로 정수
                    int , byte , short , byte -> 나이는 최대 입력이 127 이하 이면 byte
                작성자 = 기본 타입 선정 ??? 고민  , 작성자는 문자(1글자)  vs 문자열(2글자이상)
                    String
                내용 = 기본 타입 선정 ??? 고민
                    String
        - 출력예시
        ============ 방문록 ============
        나이  작성자   방문록내용
        40   유재석   안녕하세요!처음입니다.
        25   강호동   저도,처음입니다.
        ===============================
 */
