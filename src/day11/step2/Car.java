package day11.step2;

/*
- 접근제한자 :
    - 외부로부터 접근할수 있는 권한 설정
    - 종류
        1. public : 모든 클래스내에서 접근 가능 , 프로젝트내 모든 곳
        2. private : 현재 클래스내에서 접근 가능 , 현 클래스내 에서 만
        3. (default)생략 : 같은 패키지내에서 접근 가능 , 패키지내 모든 곳
        4. protected : 같은 패키지내 이거나 상속 관계이면 접근 가능 , 패키지내 또는 상속 관계

    - 관례적으로 멤버변수는 public 사용하지 않고 . private , protected 사용한다.
        - 멤버변수는 객체의 속성의 값을 가지므로 중요한 개인정보가 들어갈 경우가 있다.

    - setter and getter 메소드
        - 직접접근을 제한된 멤버변수(private) 에 대해 간접접근 제공하는 함수
            - 직접 멤버변수에 바로 호출/저장해서 접근하면 유효성검사를 할수가 없다.
            - 간접 접근[메소드] 을 통해 호출/저장 해서 접근하면 추가적인 코드를 입력해서 유효성검사를 할수 있다.
        - setter : 멤버변수의 값 저장 개념
        - getter : 멤버변수의 값 호출 개념
*/

// 객체 설계도 클래스
public class Car {
    // 1.멤버변수
    public String model;
    private int speed;
    // 2. 생성자
    // 3. 메소드
    // 3-1 'speed'멤버변수가 private 이므로 외부 클래스로에서 해당 필드의 값을 *저장 할수 있도록 만든 메소드
    public void setSpeed( int speed ){
        // 유효성검사 : 데이터 검사
        if( speed  < 0 ) { return; } // 만약에 저장할 스피드가 0보다 작으면 저장하면 안된다.
        this.speed = speed;
    } // m end
    // 3-2 'speed'멤버변수가 private 이므로 외부 클래스에서 해당 필드의 값을 *호출 할수 있도록 만든 메소드
    public int getSpeed(  ){
        // 유효성검사 : 데이터 검사
        return this.speed;
    } // m end

} // c end
