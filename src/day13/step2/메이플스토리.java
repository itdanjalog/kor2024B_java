package day13.step2;

public class 메이플스토리 implements KeyBoard {
    // 메이플스토리 클래스가 KeyBoard 인터페이스를 구현한다.

    // [!] 'KeyBoard' 인터페이스의 추상메소드 들 재정의하기.
    @Override
    public void pushA() {
        System.out.println("[메이플]공격");
    }
    @Override
    public void pushS() {
        System.out.println("[메이플]방어");
    }
    @Override
    public void pushD() {
        System.out.println("[메이플]줍기");
    }
} // class end
