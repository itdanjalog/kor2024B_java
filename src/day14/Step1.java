package day14;  // Day14 > Step1 클래스

import java.util.Arrays;

/*
    배열이란? 동일한 타입의 자료들을 하나의 배열 타입 자료 로 묶어주는 역할
        ( 생활 ) 순서대로 나열 한다.
        ( 자바 ) 여러개 자료들을 순번을 매겨 연속된 공간에 저장하는 자료구조
        - 용어
            1. 요소 : 배열내 저장된 자료
            2. 인덱스 : 연속된공간(배열) 의 요소들이 저장된 순서 번호 , 0번 시작
            3. 길이 : 연속된공간(배열) 의 요소들의 총 개수
                    [ "유재석" , "강호동" , "신동엽" ]
            요소     : "유재석"  와   "강호동" 와 "신동엽" , 요소 3개
            인덱스   :   0          1              2   , 순서대로 0번 시작 해서 1씩 증가
            길이     :                                 , 길이 3
            - 마지막인덱스는 2 , 길이는 3
    배열 선언
        방법1(초기값) : 타입[] 변수명 = new 타입[]{ 초기값1 , 초기값2 , 초기값3 }
        방법2(길이) : 타입[] 변수명 = new 타입[배열길이];
            - 배열의 연속된공간의 개수는 선언시 고정 , [고정길이]
                - 배열 생성시 3칸 만들었는데 4칸 또는 2칸으로 변경할수 없다.
    배열 요소 호출
        배열변수명[인덱스번호]

    배열 관련 함수들
        1. Arrays.toString( 배열변수 ) : 해당 배열내 저장된 요소들을 문자열로 반환 함수
*/
public class Step1 { //
    public static void main(String[] args) {
        // 1. 변수란? 하나의 값을 저장하는 메모리 공간
            // 정수 5개를 저장하기 위해 변수 5개 선언
        int var1 = 1; int var2 = 2; int var3 = 3; int var4 = 4; int var5 = 5;
        // 2. [배열선언] 하나의 변수에 여러개 값을 저장하는 타입 = 배열타입
            // 정수 5개를 저장하기 위해 배열 1개 선언
        int[] array1 = new int[]{ 1,2,3,4,5 };
        System.out.println(Arrays.toString( array1 ) );
        int[] array2 = new int[5];
        System.out.println( Arrays.toString( array2 ) );
        // 3. [요소값호출] 배열의 요소의 자료 호출
        System.out.println( array1[0] );    // 1
        System.out.println( array1[1] );    // 2
        System.out.println( array1[2] );    // 3
        System.out.println( array1[3] );    // 4
        System.out.println( array1[4] );    // 5
        // System.out.println( array1[5] );    // 오류발생 , 왜? 존재하지 않는 인덱스 입니다.
        //4. [요소값수정] 배열 요소의 자료 수정
        array1[0] = 21; // array1 이라는 배열내 첫번째 인덱스 요소에 21를 대입
        array1[1] = 31; // array1 이라는 배열내 두번째 인덱스 요소에 31를 대입
        System.out.println( Arrays.toString( array1 ) );
        //5. [요소삭제 , 요소값삭제 ] 배열에 지원하지 않는 기능
        //6. 주의할점 : 선언된 배열 타입과 맞지 않는 자료는 대입이 불가능하다.  단. 캐스팅(타입변환)가능
        //array1[2] = "유재석";오류발생 , 왜?? array1 배열은 int 타입 이므로 int 만 대입 가능하다.

        // 7. for문(반복문) 과 배열의 관계 : 배열순회( 배열내 요소들을 처음부터 끝까지 하나씩 호출 )
        // - 인덱스는 0부터 시작해서 1씩 증가 하면서 저장된 요소들의 순번 , 중간에 공백 없다.
        // - for는 시작값 부터 증감 하면서 조건까지 반복처리
        // - for문에서 배열의 인덱스를 반복해서 배열내 요소들을 출력 할수 있다.
        double[] array3 = new double[5];
        array3[0] = 3.14;
        array3[1] = 4.14;
        array3[2] = 5.14;
        array3[3] = 6.14;
        array3[4] = 7.14; // 주의할점 : 4인덱스는 다섯번째 위치한 요소
            // - 반복변수(index)는 0부터 4까지 1씩증가 하면서 반복 , 반복횟수 : 5회
        for( int index = 0 ; index<=4 ; index++ ){
            System.out.println( index + " : " + array3[index] );
        }
            // 마지막인덱스번호 : 4 , 길이 : 5 , 마지막인덱스번호를 구하는 방법 : 배열명.length-1
        for( int index = 0 ; index <= array3.length-1 ; index++ ){
            System.out.println( index + " : " + array3[index]);
        }

    } // main e
} // class e
