package day13.step2;

public class 피파 implements KeyBoard {
    // 피파 클래스가 KeyBoard 인터페이스를 구현한다.

    @Override
    public void pushA() {
        System.out.println("[피파]슛");
    }
    @Override
    public void pushS() {
        System.out.println("[피파]패스");
    }
    @Override
    public void pushD() {
        System.out.println("[피파]태클");
    }
}
