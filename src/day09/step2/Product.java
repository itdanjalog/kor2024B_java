package day09.step2;

// 객체의 설계도
public class Product {
    // 클래스의 멤버
    // 1. 멤버변수/필드
    String name; // '제품명'을 저장하는 필드명 정의
    int price; // '제품가격'을 저장하는 필드명 정의

    // 2. 생성자 : 객체 생성시 사용되는 필드 초기화 담당
    // 2-1 기본/디폴트 생성자 : 매개변수가 없는 생성자
    Product( ){

    } // 생성자1 end

    // 2-2 매개변수가 1개인 생성자 , 객체 생성시 외부로부터 '제품명' 값을 매개변수로 전달 받는다.
    Product( String name ){
        this.name = name; // 매개변수 값을 필드(this.name)의 대입한다.
        // 단 필드명과 매개변수명이 동일하면 this 로 구분한다.
    } // 생성자2 end

    // 2-3 매개변수가 2개인 생성자 , 객체 생성시 외부로부터 '제품명','제품가격' 의 값을 각 매개변수로 전달 받는다.
    Product( String name , int price ){
        this.name = name; // 매개변수 값을 필드의 대입한다.
        this.price = price; // 매개변수 값을 필드의 대입한다.
    } // 생성자3 end

    // 3. 메소드/함수

} // class end
