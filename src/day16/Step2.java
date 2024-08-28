package day16;

import java.util.*;

public class Step2 {
    public static void main(String[] args) {
        /*
            문제 : 이름 명단을 저장하는 프로그램 구현하시오.
                여러개 이름(String) 들을 저장하는 집합(set) 객체 선언하시오.
                1번 선택시 : 새로운 이름을 입력받아 set컬렉션 저장하시오. 단 이름의 중복은 불가능 하도록 한다.
                2번 선택시 : 현재 set컬렉션에 저장된 모든 이름 들을 출력하시오.
                3번 선택시 : 수정할 이름 를 입력받아 set컬렉션 내 존재하면 새로운 이름을 입력받아 수정하시오.
                4번 선택시 : 삭제할 이름 를 입력받아 해당 요소를 삭제 하시오.
        */
        Scanner scan = new Scanner(System.in);
        // (1) Set(집합) 객체 생성
        Set< String > set = new HashSet<>();

        while(true){
            System.out.print("1.create 2.read 3.update 4.delete : ");
            int ch = scan.nextInt();
            if( ch == 1 ){ // (2) 1번선택시
                System.out.print(">> newName : ");
                String name = scan.next(); // 키보드로부터 새로운 이름을 입력받는다.
                set.add( name );    // 새로운 이름을 set컬렉션에 저장한다.
            }
            else if( ch == 2 ){ //(3) 2번 선택시
                set.forEach( name -> { System.out.println( "name : "+name );  });
            }
            else if( ch == 3 ){ // (4) 3번 선택시
                System.out.print(">> updateName : ");
                String updateName = scan.next();
                if( set.contains( updateName ) ){ // 만약에 입력받은 이름이 존재하면
                    System.out.print(">> newName : ");
                    String newName = scan.next();
                    set.remove( updateName ); // 기존 이름 삭제
                    set.add( newName ); // 새로운 이름 추가
                }
            }
            else if( ch == 4 ){
                System.out.print(">> deleteName : ");
                String deleteName = scan.next();
                set.remove( deleteName );
            }

        } // while end
    } // main end
}
