package day16;

import java.util.HashSet;
import java.util.Set;

public class Step1 {
    public static void main(String[] args) {

        // [1] Set 컬렉션 : 저장된 요소의 순서가 없고 인덱스가 없으므로 , 값/자료로 식별한다. [ 중복 값을 허용하지 않는다 ]
            // - 중복을 제거할때 자주 사용된다.
            // - 구현 클래스 : HashSet , TreeSet 클래스 등

        // 1. set 컬렉션 객체 생성
        Set< Integer > set = new HashSet<>();
        // 2. set 컬렉션 객체의 요소/자료 추가
        set.add( 10 ); // set 컬렉션에 10 추가
        set.add( 20 ); // set 컬렉션에 20 추가
        set.add( 30 ); // set 컬렉션에 30 추가
        set.add( 40 ); // set 컬렉션에 40 추가
        set.add( 20 ); // set 컬렉션에 20 추가 ( 20은 이미 set 컬렉션에 존재한다. 중복발생 )
        System.out.println("set = " + set); // set = [20, 40, 10, 30]
        // 3. set 컬렉션에 요소 총 개수
        int size = set.size();
        System.out.println("size = " + size); // 4
        // 4. set 컬렉션에 요소 삭제
        set.remove( 40 );
        System.out.println("set = " + set ); // set = [20, 10, 30]
        // 5. set 켈렉션 과  for문 의 관계
        set.forEach( value -> {  System.out.println( value ); } );
            // 컬렉션변수.forEach( 반복변수명 -> { 실행문; })   : for문을 함수형식으로 사용하는 방법 , 람다식
        // * set 컬렉션은 list 컬렉션과 다르게 인덱스가 존재하지 않는다.
            // set.get( ) 해당 함수는 사용이 불가능하다.
        for( int index = 0 ; index < set.size() ; index ++ ){
            // System.out.println( set.get( index )); // 불가능
        }

    }
}
