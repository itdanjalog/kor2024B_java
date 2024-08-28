package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        /*
            문제 : 제품 정보 명단을 저장하는 프로그램 구현하시오.
                - 여러개 제품 정보 들을 저장하는 리스트객체 선언하시오.
                - 제품 정보(객체) : 제품명 , 가격 , 제조사 ( 여러개 타입들의 변수들을 하나의 타입으로 묶음 - 클래스타입 )
                1번 선택시 : 새로운 제품명,가격,제조사 를 입력받아 제품정보 객체를  List 저장하시오.
                2번 선택시 : 현재 List에 저장된 모든 제품정보 객체를 인덱스와 같이 출력하시오.
                3번 선택시 : 수정할 인덱스 를 입력받아 List 내 존재하면 새로운 제품명,가격 을 입력받아 수정하시오.
                4번 선택시 : 삭제할 인덱스 를 입력받아 해당 요소 를 삭제 하시오.
        */
        // [2] 입력객체
        Scanner scan = new Scanner(System.in);
        // 여러개 제품(Product) 객체를 저장하는 리스트 객체 선언
        List< Product > list = new ArrayList<>();
        // [1]무한반복문 / 무한루프
        while(true){
            System.out.print("1.create 2.read 3.update 4.delete : ");
            int ch = scan.nextInt();
            if( ch == 1 ){
                // 1. 제품명,가격,제조사 입력받기
                System.out.print(">> newName : ");      String name = scan.next();
                System.out.print(">> newPrice : ");     int price = scan.nextInt();
                System.out.print(">> newCompany : ");   String company = scan.next();
                // 2. 객체화
                Product p = new Product( name , price , company );
                // 3. 생성된 객체를 리스트에 담기
                list.add( p );
            } // if end
            else if( ch == 2 ){
                // 1. 반복문 이용한 리스트를 순회( 첫번째 인덱스부터 마지막인덱스까지 하나씩 호출 )
                for( int index = 0 ; index < list.size() ; index++ ){
                    System.out.println( index
                                        +" : "+ list.get(index).getName()
                                        +" , "+ list.get(index).getPrice()
                                        +" , "+ list.get(index).getCompany() );
                                        // 리스트객체명.get( 인덱스번호 ).get필드명()
                                        // 리스트객체내 인덱스번호의 객체 호출해서 해당 필드값 호출
                } // for end
            } // else if end
            else if( ch == 3 ){
                System.out.print(">> update Index : ");
                int updateIndex = scan.nextInt();
                if( list.size() > updateIndex){
                    System.out.print(">> update name : "); String updateName = scan.next();
                    System.out.print(">> update price : "); int updatePrice = scan.nextInt();
                    list.get( updateIndex ).setName( updateName ); // 특정 인덱스 객체의 필드값 수정
                    list.get( updateIndex ).setPrice( updatePrice ); // 특정 인덱스 객체의 필드값 수정
                }
            } // else if end
            else if( ch == 4 ){
                System.out.print(">> delete Index : ");
                int deleteIndex = scan.nextInt();
                list.remove( deleteIndex );
            } // else if end
        } // while end
    } // main end
} // class end
