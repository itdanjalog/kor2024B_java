package day13.step2;

public class 롤 implements KeyBoard {
    // 롤 클래스가 KeyBoard 인터페이스를 구현한다.

    @Override
    public void pushA() {
        System.out.println("[롤]스킬1");
    }
    @Override
    public void pushS() {
        System.out.println("[롤]스킬2");
    }
    @Override
    public void pushD() {
        System.out.println("[롤]스킬3");
    }
}
