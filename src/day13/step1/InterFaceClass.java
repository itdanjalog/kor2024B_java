package day13.step1;

public class InterFaceClass implements ExampleInterFace {
    // 상속 : class 하위클래스명 extends 상위클래스명{ }
    // 구현 : class 하위클래스명 implements 인터페이스명{ }
        // - 추상메소드를 물려받아 해당 클래스가 구현해야한다.
        // - 추상메소드를 구현하지 않으면 오류가 발생한다.
    // 1. ExampleInterFace 의 추상메소드 구현(오버라이딩) 하기
    // 방법1] 빈칸에 컨트롤+스페이바  하고 방향키 위/아래 해서 추상메소드 선택하여 엔터
    @Override
    public int method1(int a) {
        return 0;
    }

    @Override
    public int method2(int a) {
        return 0;
    }
    // 방법2] 빈칸에 오른쪽 클릭 -> Generate -> Override Methods -> 추상메소드 선택

}
