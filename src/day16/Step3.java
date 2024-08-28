package day16;

import java.util.HashMap;
import java.util.Map;

public class Step3 {
    public static void main(String[] args) {

        // [1] Map 컬렉션 : key(키) 와 value(값) 으로 구성된 entry(엔트리) 들 을 저장하는 구조
            // 구현 클래스 : HashMap , HashTable , TreeMap 등
            // - key(키)는 중복을 허용하지 않는다 , value(값)는 중복을 허용한다.

        // 1. Map 컬렉션 객체 생성 , 멀티타입 제네릭
        // List< value타입 > , Set< value타입 > , Map< key 타입 , value타입 >
        Map< String , Integer> map = new HashMap<>();
                // int 기본타입의 클래스가 Integer 클래스 이다. // 제네릭 타입은 기본타입이 불가능하다.
        // 2. map 컬렉션에 엔트리 추가
        map.put( "유재석" , 85 );
        map.put( "홍길동" , 90 );
        map.put( "강호동" , 100 );
        map.put( "신동엽" , 90 ); // value 타입의 자료(90)가 중복이다. - value는 중복 값 을 허용한다.
        map.put( "유재석" , 78 ); // key 타입의 자료(유재석) 가 중복이다. - key는 중복 값 을 허용하지 않는다.
        System.out.println("map = " + map); // map = {홍길동=90, 유재석=78, 강호동=100, 신동엽=90}
        // 3. map 컬렉션에 value 호출 , get( key ) : 지정한 key의 value 호출 한다.
        int value1 = map.get("유재석"); // 유재석(키) 과 연결된 값 을 호출한다.
        System.out.println("value1 = " + value1); // value1 = 78
        int value2 = map.get("신동엽");
        System.out.println("value2 = " + value2); // value2 = 90
        // 4. map 컬렉션의 총 엔트리 개수
        int size = map.size();
        System.out.println("size = " + size); // size = 4
        // 5. map 컬렉션의 엔트리 삭제  // 지정한 key가 존재하면 해당 엔트리 삭제 한다.
        map.remove("강호동");
        System.out.println("map = " + map ); // map = {홍길동=90, 유재석=78, 신동엽=90}
        // 6. map 컬렉션의 모든 value 를 리스트타입 으로 반환
        System.out.println( map.values() );     // .values()    [90, 78, 90]
        System.out.println( map.entrySet() );   // .entrySet()  [홍길동=90, 유재석=78, 신동엽=90]
        System.out.println( map.keySet() );     // .keySet()    [홍길동, 유재석, 신동엽]
        // 7. map 컬렉션 과 반복문의 관계
        map.keySet().forEach( key -> {  System.out.println( map.get( key )); } );
        map.values().forEach( value -> {  System.out.println( value );   });
        map.entrySet().forEach( entry -> {  System.out.println( entry );    });

    }
}







