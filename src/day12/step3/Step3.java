package day12.step3;

class Parent{ // 상위 클래스
    // 멤버변수
    public String filed1;
    // 메소드
    public void method1(){
        System.out.println("Parent.method1");   // soutm + 자동완성
    }
    public void method2(){
        System.out.println("Parent.method2");   // soutm + 자동완성
    }
} // class end
class Child extends Parent{ // 하위 클래스
    // 멤버변수
    public String filed2;
    // 오버라이딩 : 상위 클래스의 메소드를 재정의/커스텀 하는 행위
        // - 상위 클래스의 메소드 선언부를 동일하게 작성한다.
    @Override
    public void method1(){
        System.out.println("Child.method1"); //soutm + 자동완성
    }
        // 오른쪽 클릭 -> Generate -> Override Methods -> [오버라이딩 할 메소드]선택
    @Override
    public void method2() {
        // super.method2(); // super.메소드() : 상위 클래스 메소드 호출 뜻
        System.out.println("Child.method2"); // 상위 클래스의 호출 지우고 새로운 실행문;
    }
} // class end










public class Step3 { // 실행 클래스
    public static void main(String[] args) {

        // [1] Child 클래스를 이용한 자식 객체 생성
        Child child = new Child();
        // - 자식 객체는 부모 타입의 멤버변수/메소드 사용할수 있다.
        child.filed1 = "자식데이터1";
        child.method1();
        child.method2();
        // - 본인 타입의 멤버변수/메소드 사용할수 있다.
        child.filed2 = "자식데이터2";

        // [2] Parent 클래스를 이용한 부모 객체 생성
        Parent parent = new Parent();
        // - 부모 객체는 자식 타입의 멤버변수/메소드 사용 할수 없다.
        // parent.filed2 = "부모데이터2"; // 오류 : 부모타입은 자식타입을 모른다.
        // - 본인 타입의 멤버변수/메소드 사용할수 있다.
        parent.filed1 = "부모데이터1";
        parent.method1();
        parent.method2();

        // [3] 업캐스팅 : 자식 객체가 부모 타입으로 변환
        Parent parent2 = child; // 자식 객체를 부모 타입 변수에 대입

        // [4] 다운캐스팅 : 부모 객체가 자식 타입으로 변환
            // - child -> parent2 -> child2 가능!!
        Child child2 = (Child) parent2; // 부모 객체를 자식 타입 변수에 대입
            // - parent -> child 불가능
        // Child child3 = (Child) parent; // 오류 : cannot be cast to class

        // - Object 는 자바의 최상위 클래스 이므로 모든 클래스/타입 을 변환할수 있다.
        Object object1 = child;
        Object object2 = parent;
        // - Object 객체를 다시 원래의 타입으로 변환 , 다운캐스팅
        Child child4 = (Child)object1;
        Parent parent3 = (Parent)object2;

        // [5] 태생의 타입을 까먹거나 다른 사람이 만든 타입이거나 모르면 , instanceof 키워드
        if( object1 instanceof Child ){ // 만약에 object1 객체가 Child타입이면
            Child child5 = (Child) object1; // child타입으로 변환
        }else if( object1 instanceof Parent ){ // 아니고 object1 객체가 Parent타입이면
            Parent parent5 = (Parent) object1;  // Parent 타입으로 변환
        }

        // [6] 오버라이딩 된 메소드 확인
            // 1. 부모객체 메소드 호출
        parent.method1(); // Parent.method1
        parent.method2(); // Parent.method2
            // 2. 자식객체 메소드 호출
                // - 오버라이딩 메소드가 없으면 부모메소드 그대로 호출
                // - 오버라이딩 메소드가 있으면 오버라이딩 된 메소드 호출
        child.method1();  // Child.method1
        child.method2();  // Child.method2
            // 3. 자식객체 가 부모타입으로 변환 후 메소드 호출
                // - 오버라이딩 메소드가 우선적으로 호출된다. - 오버라이딩 메소드가 우선순위가 더 크다.
        Parent parent6 = child;
        parent6.method1(); // Child.method1
        parent6.method2(); // Child.method2


    } // main end
} // class end















