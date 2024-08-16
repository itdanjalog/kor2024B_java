package day11.step3;
//실습2 : step3 패키지에 게임을 개발하기 위한 Character 클래스 설계하시오.
//[조건1] 속성 : 닉네임 , 직업 , 레벨 , 공격력
//[조건2] 모든 멤버변수는 private 한다.
//[조건3] 생성자는 3개 이상 정의한다. ( 오버로딩 )
//[조건4] 각 멤버변수의 setter and getter 메소드를 만든다.
//[조건5] 객체의 모든 필드의 값 를 반환하는 toString() 메소드를 만든다.
public class Character {
    // 1. 멤버변수
    private String nickName;    // - 닉네임의 문자열을 저장하기 위해 'String' 타입 선정
    private String job;         // - 직업의 문자열을 저장하기 위해 'String' 타입 선정
    private int level;          // - 레벨의 숫자를 저장하기 위해 'int' 타입 선정
    private int power;          // - 공격력의 숫자를 저장하기 위해 'int' 타입 선정
    // - 관례적으로 멤버변수에는 private 선호 한다. 다른 클래스로부터 직접접근 제한하고 getter and setter 이용한 간접접근 허용한다.
    // 2. 생성자
    public Character(){}
        // ( 생성자를 자동으로 만드는 방법 )
        // 1. 생성자를 만들 위치에 커서를 두고 -> 마우스를 오른쪽 클릭 -> Generate(만들다) -> Constructor(생성자)
        // 2. 원하는 필드 선택한다, (복수선택은 ctrl 또는 shift 키 를 이용한 여러개 필드 선택도 가능 ) -> [ OK ]
    public Character(String nickName) {
        this.nickName = nickName;
    }
    public Character(String nickName, String job, int level, int power) {
        this.nickName = nickName;
        this.job = job;
        this.level = level;
        this.power = power;
    }

    // 3. 메소드
        // toString() 메소드는 객체 출력시 객체의 주소(위치) 값 이 아닌 객체내 모든 필드 값을 반환해주는 함수
        // ( toString 자동으로 만드는 방법 )
        // 1. 원하는 위치를 커서를 두고 -> 마우스를 오른쪽 클릭 -> Generate(만들다) -> toString()
        // 2. 원하는 필드 선택한다.( 일반적으로 모두 선택 ) -> [ OK ]
    @Override
    public String toString() {
        return "Character{" +
                "nickName='" + nickName + '\'' +
                ", job='" + job + '\'' +
                ", level=" + level +
                ", power=" + power +
                '}';
    }
    // ( setter and getter 자동으로 만드는 방법 )
        // 1. 원하는 위치를 커서를 두고 -> 마우스를 오른쪽 클릭 -> Generate(만들다) -> Getter and Setter
        // 2. 원하는 필드 선택한다. (복수선택은 ctrl 또는 shift 키 를 이용한 여러개 필드 선택도 가능 ) -> [ OK ]
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

} // class end
