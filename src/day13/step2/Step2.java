package day13.step2;

public class Step2 {
    public static void main(String[] args) {

        // [1] 키보드 타입 생성 ,인터페이스 변수 선언 ,
        KeyBoard myKB;
            // myKB.pushA(); // 오류 발생 , 이유 : 추상메소드는 호출이 안된다.

        // [2] 키보드와 메이플스토리 연결 , 구현체를 인터페이스 변수에 대입
        myKB = new 메이플스토리();
            myKB.pushA(); // ??? , [메이플]공격 ,
            // 왜?? 현재 메이플스토리 클래스 에서 pushA() 를 구현[구체화] 했기 때문에
            myKB.pushS(); // [메이플]방어
            myKB.pushD(); // [메이플]줍기

        // [3] (게임교체) 키보드와 롤 연결 , 구현체를 인터페이스 변수에 대입 ,
        int a = 10; a = 3; // 변수는 하나의 값/객체주소 를 저장한다.
        myKB = new 롤();
            myKB.pushA(); // [롤]스킬1
            myKB.pushS(); // [롤]스킬2
            myKB.pushD(); // [롤]스킬3

        // !! : 하나의 인터페이스 변수에서 서로다른 타입의 여러개 객체들을 저장/대입 받으면서 객체를 다룰수 있다.




    }
}
