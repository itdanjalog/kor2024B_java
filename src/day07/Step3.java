package day07;

public class Step3 {
    public static void main(String[] args) {

        // [1] 무한반복 , 무한루프
            // 1. for( ; ; ){ }
        //for( ; ; ){  System.out.println("1.반복중");  }
            // 2. while( true ) { }
        //while ( true ){ System.out.println("2.반복중"); }

        // [2] 무한루프 종료하는 방법 : 특정한 경우/조건 에 break 키워드 이용한 무한루프 종료할수 있다.
        int count = 0;
        while ( true ){
            count = count + 1; // count 변수의 값에 + 1 더한다.
            System.out.println("3.반복중");
            if( count == 3 ){ break; } // 만약에 count 변수의 값이 3이면 반복문 (강제)종료
        }

    } // main end
} // class end
