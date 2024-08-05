package day07;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        // 반복문을 이용한 별 모양 출력하기.
        // * 입력객체
        Scanner scan = new Scanner(System.in);

        // [1] 키보드로 부터 하나의 정수를 입력받아 입력받은 수 만큼 별(*) 출력 하시오.
        System.out.print("[1] 별 개수 : ");
        int star1 = scan.nextInt(); // - int타입의 데이터를 입력받아 int변수에 대입 한다.
        for( int i = 1 ; i <= star1 ; i++ ){ // i는 1부터 입력받은 수 까지 1씩증가.
            System.out.print("*\t");
        } // for end

        System.out.println(" \n ---------------- 문제 구분선 ------------------ ");

        // [2] 키보드로 부터 하나의 정수를 입력받아 입력받은 수 만큼 별(*) 출력하면서 3의 배수 마다 줄바꿈 처리 하시오.
        System.out.print("[2] 별 개수 : ");
        int star2 = scan.nextInt();
        for( int i = 1 ; i <= star2 ; i++ ){
            System.out.print("*\t");
            if( i % 3 == 0 ) { System.out.println(); } // 만약에 i번째가 3의 배수 이면 줄바꿈 처리
        } // for end

        System.out.println(" \n ---------------- 문제 구분선 ------------------ ");

        // [3] 키보드로 부터 하나의 정수를 입력받아 입력받은 수 만큼의 별(*) 문자 를 하나의 변수에 누적으로 대입하여 반복문 종료후 해당 변수를 출력하시오.
        System.out.print("[3] 별 개수 : ");
        int star3 = scan.nextInt();
        String starTotal = ""; // 별(*) 문자들을 모아두는 문자열 변수 선언
        for( int i = 1 ; i <= star3 ; i++ ){ // i는 1부터 입력받은(star3)수 까지 1씩증가 반복처리
            //starTotal += "*";             // 방법1 : += 복합대입 연산자를 이용한 누적합
            starTotal = starTotal + "*\t";    // 방법2 : = 대입 연산자를 이용한 누적합
        } // f end
        System.out.println("starTotal = " + starTotal); // 문자열 출력

        System.out.println(" \n ---------------- 문제 구분선 ------------------ ");

        // [4]
        System.out.print("[4] 줄 개수 : ");
        int line4 = scan.nextInt();

        // 4-1 현재 줄은 1부터 입력받은 줄 수 까지 1씩 증가 반복 처리
        for( int line = 1 ; line <= line4 ; line++ ){

            // 4-3 별 은 1부터 현재 줄수(line) 까지 1씩 증가 반복 처리
            for( int star = 1 ; star <= line ; star++ ){

                System.out.print("*");   // 4-4 별출력

            } // for end

            // 4-2 줄바꿈처리
            System.out.println();

        } // for end


    } // main end
}// class end









