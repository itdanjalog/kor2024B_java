package day16;

import java.util.*;

public class Step4 {

    public static void main(String[] args) {
        /*
            문제 : 제품 정보 명단을 저장하는 프로그램 구현하시오.
                - 여러개 제품 정보 들을 저장하는 Map 객체 선언하시오.
                - 제품 정보(객체) : 제품명(String) , 가격(int)  ( 제품명은 중복 불가능 , 가격은 중복 가능 )
                1번 선택시 : 새로운 제품명,가격 입력받아 제품정보 엔트리 를  Map객체에 저장하시오.
                2번 선택시 : 현재 Map객체 에 저장된 모든 제품정보 엔트리 를 key 와 value 로 출력하시오.
                3번 선택시 : 수정할 제품명 를 입력받아 Map 내 존재하면 새로운 제품명, 가격 을 입력받아 수정하시오.
                4번 선택시 : 삭제할 제품명 를 입력받아 해당 엔트리 를 삭제 하시오.
        */
        Scanner scan = new Scanner(System.in);
        // [1] Map 컬렉션 객체 생성 # while { } 밖에 선언해야 되는 이유 # while 안에서 입력받은 데이터를 누적으로 저장하기 위해서
        Map< String , Integer > map = new HashMap<>();
            // < > : 제네릭 타입 # 기본타입을 지원하지 않기 때문에 int 대신에 Integer 정수 클래스 사용
        while(true){ // 무한루프(무한반복문)
            // Map< String , Integer > map = new HashMap<>(); // while {} 안에서 선언하지 않는 이유 : 무한 선언(초기화)
            System.out.print("1.create 2.read 3.update 4.delete : ");
            int ch = scan.nextInt();
            if( ch == 1 ){
                // [2-1] 새로운 제품명 과 가격 입력받기
                System.out.print(">> newName : "); String newName = scan.next(); // 이름(문자열) 입력받기
                System.out.print(">> price : ");    int price = scan.nextInt(); // 가격(정수) 입력받기
                // [2-2] Map 컬레션 저장
                map.put( newName , price );
            } // if end
            else if( ch == 2 ){
                // map.keySet() : map 컬렉션의 모든 key를 set컬렉션으로 반환
                // 컬렉션변수.forEach( 반복변수명[요소] -> { 실행문; } )
                map.keySet().forEach( key -> {
                    System.out.println( " name : " + key + "  price : " + map.get(key) );
                } );

            } // else if end
            else if( ch == 3 ){
                System.out.print(">> updateName : "); String updateName = scan.next();
                if( map.containsKey( updateName ) ) { // 만약에 map 컬렉션에 입력받은 key(이름) 가 존재하면
                    System.out.print(">> newName : ");  String newName = scan.next();
                    System.out.print(">> newPrice : "); int newPrice = scan.nextInt();
                    map.remove( updateName ); // 수정할 엔트리를 삭제
                    map.put( newName , newPrice ); // 새로운 엔트를 추가
                }
            } // else if end
            else if( ch == 4 ){
                System.out.print(">> deleteName : "); String deleteName = scan.next();
                map.remove( deleteName );
            } // else if end
        } // while end
    } // main end
}
