package day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Step4 {
    public static void main(String[] args) {

        // [1] List 인터페이스 의 구현 클래스 : 1.ArrayList 클래스 2. LinkedList 클래스 3.Vector 클래스 등등
            // - List 인터페이스의 구현 클래스들의 메소드 거의 동일하다.
            // ArrayList 클래스 vs LinkedList 클래스 차이점
                // 1. 구조적인 차이가 있다. 요소들의 연결하는 방법
                // 2. 중간 삽입/삭제 : LinkedList 빠르다.
                // 3. 뒤에 추가/삭제 : ArrayList 빠르다.
                // - 요소들의 중간 변화가 많은 프로그램 : LinkedList 선호
                // - 요소들의 중간 변화가 없고 뒤에서부터 삽입/삭제 : ArrayList 선호

            // ArrayList 클래스 vs Vector 클래스
                // 1. 동기화 차이가 있다. 쓰레드 접근 방법
                // 2. 단일스레드(main함수) 만 사용하는 경우 : ArrayList 선호
                // 3. 멀티스레드(main함수외 추가 스레드) 가 사용되는 경우 : Vector 선호

        List<Integer> 리스트객체 = new ArrayList<>();
        List<Integer> 링크리스트객체 = new LinkedList<>();

        // 1. 두 클래스간의 객체들 사용방법(메소드)은 동일하다.
        리스트객체.add( 10 );
        링크리스트객체.add( 10 );
        System.out.println( 리스트객체.get(0) );
        System.out.println( 링크리스트객체.get(0) );
        // 2. 구조적인 차이점
            // - 리스트
        long sTime = System.currentTimeMillis(); // 현재 시간을 밀리초(1/1000초) 로 반환/알려주는 함수
        for( int value = 1 ; value<=1000000 ; value++ ){
            리스트객체.add( 0 , value ); // 0번째 인덱스의 반복중인 value 값 삽입
        } // for end
        long eTime = System.currentTimeMillis(); // 현재 시간을 밀리초 로 반환 함수
        System.out.println( "ArrayList 1000000 저장하는데 걸리는시간:"+ (eTime - sTime) ); // for문이 1000000 번 리스트객체에 요소를 저장하는데 걸리는 (밀리초) 시간

            // - 링크리스트
        sTime = System.currentTimeMillis();  // 시작시간
        for( int value = 1 ; value<=1000000 ; value++ ){
            링크리스트객체.add( 0 , value );
        }
        eTime = System.currentTimeMillis(); // 끝시간
        System.out.println( "LinkedList 1000000 저장하는데 걸리는시간:"+ (eTime - sTime) );

    } // main end
} // class end
