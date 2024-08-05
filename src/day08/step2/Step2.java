package day08.step2;

public class Step2 { // class s

    public static void main(String[] args) { // main s

        //[1] 첫번째 아메리카노 주문( 레시피 보고 아메리카노 제조 ) , 클래스를 참조 해서 객체 생성
            // 4. new :객체 생성 하세요 명령어 뜻한다.
            // 5. 클래스명() : (생성자)
                // new Americano();
            // 변수 생성 : 객체의 위치를 기억하기 위해서
            // 1. 클래스/타입 명   2. 변수명   3. =
        Americano coffee1 = new Americano();
        System.out.println( coffee1 );
        // [4] 객체내 필드의 값 를 대입하기
        coffee1.bean = "로부스타";
        // [5] 객체내 필드의 값 호출하기
        System.out.println( coffee1.bean ); // "로부스타";

        //[2] 두번째 객체 생성
        Americano coffee2 = new Americano();

        System.out.println( coffee2.bean ); // null
        coffee2.bean ="로부스타";
        System.out.println( coffee2.bean ); // "로부스타"

        //[3] 세번째 객체 생성
            // 1. A 엔터 : 클래스의 첫글자를 입력하면 자동완성 할수 있다.
            // 2. 스페이바 -> 변수명 입력 ->  = 입력  ->  n 엔터 -> A 엔터 -> ;
        Americano coffee3 = new Americano();

        // 실습2 : 은행 계좌 시스템 만들기
            // 계좌 속성 설계 : 계좌번호 와 예금액
            // 계좌 2개 생성 : 계좌번호 : 123-123 , 계좌번호 : 456-789
            // 계좌번호 123-123의 10000 입금
            // 계좌번호 123-123의 5000 출금

        // 첫번째 계좌
        Account acc1 = new Account();
            // 계좌번호 대입
        acc1.number = "123-123";

        // 두번째 계좌
        Account acc2 = new Account();
        acc2.number = "456-789";

        // 첫번째 계좌에 10000 입금( 입금이란? 기존 자료의 더해주는 개념 )
        // acc1.balance = 10000; // 변수/필드 는 자료를 1개 저장
        acc1.balance += 10000;
        // vs // acc1.balance = acc1.balance + 10000;

        // 첫번재 계좌에 5000 출금 ( 출금이란? 기존 자료의 빼주는 개념 )
        acc1.balance -= 5000;




    } // main e
} // class e
















