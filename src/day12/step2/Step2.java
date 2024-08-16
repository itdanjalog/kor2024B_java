package day12.step2;

class A{}           // 상위 클래스(부모) , [할머니]
class B extends A{} // 하위 클래스(자식) , 상위 클래스(부모) [엄마]
class C extends B{} // 하위 클래스(자식) , [ 나 ]
class D extends B{} // 하위 클래스(자식) , [ 형제 ]
public class Step2 {
    public static void main(String[] args) {
        // [1] A 클래스의 객체 생성
        A a = new A(); // 총 물리적인 객체(메모리) 몇개 ??? 2개 , Object클래스 102객체 <--- A클래스 202객체
        System.out.println( a instanceof B ); // 해당 a객체는 B클래스의 타입이 아니다. false
        // [2] B 클래스의 객체 생성
        B b = new B(); // 총 물리적인 객체(메모리) 몇개 ??? 3개 , Object클래스 103객체 <--- A클래스 203객체 <--- B클래스 303객체
        System.out.println( b instanceof B ); // 해당 b객체는 B클래스의 타입이다. true
        A a2 = b;   // 자동 타입변환 ,  b객체가 A타입으로 변환
        System.out.println( a2 instanceof  B ); // 해당 a2객체는 B클래스의 타입이다. true
        B b2 = (B)a2;  // 강제 타입변환 , a2객체가  B타입으로 변환
        // [3] C 클래스의 객체 생성
        C c = new C(); // 총 물리적인 객체(메모리) 몇개 ??? 4개 , Object클래스 104객체 <--- A클래스 204객체 <--- B클래스 304객체 <--- C클래스 404객체
        // [4] D 클래스의 객체 생성
        D d = new D(); // 총 물리적인 객체(메모리) 몇개 ??? 4개 , Object클래스 105객체 <--- A클래스 205객체 <--- B클래스 305객체 <--- D클래스 505객체
        System.out.println( d instanceof B );   // 해당 d객체는 B클래스의 타입이다. true ,
        /*
            기본타입의 다형성 :
                - 자동/묵시적/업캐스팅 타입변환 : byte -> short -> int -> long -> float -> double
                - 강제/명시적/다운캐스팅 타입변환 : byte <- short <- int <- long <- float <- double

            참조타입의 다형성
                - 자동/묵시적/업캐스팅  타입변환 : 자식 타입  -> 부모 타입
                - 강제/명시적/다운캐스팅 타입변환 : 부모 타입 -> 자식 타입 , 전제조건 : 변환할 자식 타입으로 객체를 생성했을때 가능. (상속관계일때만 가능)
                    - A클래스 202객체 는 태생이 A클래스 객체 이므로 B클래스로 타입 변환이 불가능.
                    - A클래스 203객체 는 태생이 B클래스 객체 이므로 B클래스로 타입 변환이 가능.

            확인하는 방법 , instanceof 키워드
                - 객체 instanceof 타입 : 해당 객체가 해당 타입인지 확인 해주는 키워드 , 맞으면 TRUE 아니면 FALSE
        */






    }
}
