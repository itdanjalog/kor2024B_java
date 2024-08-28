package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        /*
            문제 : 이름 명단을 저장하는 프로그램 구현하시오.
                여러개 이름들을 저장하는 리스트객체 선언하시오.
                1번 선택시 : 새로운 이름을 입력받아 List 저장하시오.
                2번 선택시 : 현재 List에 저장된 모든 이름들을 인덱스와 같이 출력하시오.
                3번 선택시 : 수정할 인덱스 를 입력받아 List 내 존재하면 새로운 이름을 입력받아 수정하시오.
                4번 선택시 : 삭제할 인덱스 를 입력받아 해당 요소를 삭제 하시오.
        */
        // [2] 입력객체
        Scanner scan = new Scanner(System.in);
        // [6] 리스트 객체 선언 , while 밖에서 선언
        List< String > list = new ArrayList<>();
        // [1]무한반복문 / 무한루프
        while(true){
            // List< String > list = new ArrayList<>(); // 여기에서 선언할 경우 무한루프 의해 반복적으로 선언 되므로 // 누적 안됨.
            // [3] 출력
            System.out.print("1.create 2.read 3.update 4.delete : ");
            // [4] 입력
            int ch = scan.nextInt();
            // [5] 입력값에 따른 논리조건
            if( ch == 1 ){
                System.out.print(">> new Name : ");
                String newName = scan.next();  // [7] 저장할 이름을 입력받기
                list.add( newName );  // [8] 리스트객체에 저장하기
            }
            else if( ch == 2 ){
                for( int index = 0 ; index < list.size() ; index++ ){ //   마지막인덱스 : list.size()-1
                    System.out.println( index + " : " + list.get( index ) ); // index번째 요소 값 호출
                }
            }
            else if( ch == 3 ){
                System.out.print(">> update Index : ");
                int updateIndex = scan.nextInt();
                if( list.size() > updateIndex ) { // 만약에 마지막인덱스 보다 삭제할 인덱스가 작으면 인덱스존재한다.
                    System.out.print(">> update Name : ");
                    String updateName = scan.next();    // 새로운 이름 입력받기
                    list.set( updateIndex , updateName ); // 리스트객체내 해당 수정인덱스 요소 값을 입력받은 값으로 수정
                }
            }
            else if( ch == 4 ){
                System.out.print(">> delete Index : ");
                int deleteIndex = scan.nextInt();
                list.remove( deleteIndex );
            }
        } // while end
    } // main end
} // class end
