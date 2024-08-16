package day12.step1;

// 1. 동물 클래스 선언/정의
class 동물 {
    String myName; // 동물 이름
    동물() {  System.out.println("<< 동물 탄생 >>");   } //생성자
}
// 2. 조류 클래스 선언/정의
class 조류 extends 동물 {
    String wings; // 조류의 날개 이름
    조류() { System.out.println("<< 조류 탄생 >>"); }
}
// 3. 어류 클래스 선언/정의
class 어류 extends 동물 {
    String gill; // 어류의 아가미 이름
}
// 4. 참새 클래스 선언/정의
class 참새 extends 조류{ }

public class Step1 { // class start
    public static void main(String[] args) { // main start
        // [1]
        동물 animal = new 동물();
        animal.myName = "동물";
        // - 동물 객체 는 조류 클래스의 멤버변수를 사용할수 없다.
        // animal.wings = "황금날개"; // 오류
        // [2]
        조류 bird = new 조류();
        // - 조류 클래스에는 myName 멤버변수가 없지만
        // - 동물 클래스로부터 extends(연장) 했기 때문에
        // - 조류 객체는 동물 클래스의 멤버변수를 사용할수 있다.
        bird.myName = "조류";
        bird.wings = "백색날개";
        // [3]
        어류 fish = new 어류();
        fish.myName = "어류";
        // fish.wigns = "노랑날개"; // 오류
        fish.gill = "아가미";

        // [4]
        참새 sparrow = new 참새();

    } // main end
} // class end
