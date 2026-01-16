package sec1;

// 클래스, 속성, 메서드, 생성자
// public(공용, 어느 패키지에서나 사용 가능0 > default(생략시 : 같은 패키지 내에서만 사용 가능) > private(개인: 현재 클래스 내부에서만 사용 가능)
public class Class02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.year = 1;
        s1.setYear(2025);   // 메서드 호출할 때 매개변수에 해당하는 값을 동시에 전달
        s1.setBan(3);
        s1.setNum(27);
        s1.setName("홍길동");
        System.out.println("학번 : " + s1.getYear()+ s1.getBan()+ s1.getNum());

        Student s2 = new Student();
        System.out.println("학번 : " + s2.toString());

        Student s3 = new Student(2024);
        Student s4 = new Student(2023, 3);
        Student s5 = new Student(2022, 4, 5);
    }
}


// 멤버 필드(속성)
class Student {
    // private : 현재 클래스 내부에서만 접근 가능
    // default : 접근제한자를 생략하면, 기본이 default이며, 같은 패키지 내에서 접근 가능
    // protected : 접근이 보호된 것으로 상속 관계나 같은 패키지 내에서 접근 가능
    // public : 같은 패키지 유무와 관계없이 모든 패키지에서 접근이 가능
    // [접근제한자] 데이터타입 필드명(속성명);
    private int year = 2026;
    private int ban = 1;
    private int num = 1;
    private String name;

    // 오버로딩(Overloading): 하나의 클래스의 함수나 메서드를 정의할 때 매개변수의 개수나 타입을 달리하여 같은 이름으로 정의할 수 있도록 한 것.
    // 생성자 함수 (Constructor) : 객체를 생성하는 역할
    // 생성자 함수 생략 가능 -> 자동으로 public 클래스명() { } 내장 -> 기본 생성자
    // 생성자 함수를 하나라도 매개변수로 받는 생성자 함수 기술이 되어 있으면, 반드시 매개 변수가 없는 기본 생성자를 명시(선언)해 줘야한다.
    public Student(int year, int ban, int num) {
        this.year = year;
        this.ban = ban;
        this.num = num;
    }

    public Student(int year, int ban) {
        this(year, ban, 2);
    }
    public Student(int year) {
        this(year, 2);
    }

    public Student() {
        this(2025);
    }

    // getter와 setter
    // 멤버 메서드
    // 접근제한자 (데이터)반환타입 메서드명(매개변수, ...) { 설명문; }
    public void setYear(int year) {
        this.year = year;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    //
    public int getYear() {
        // this에 있는 값을 return
        return year;
    }

    public int getBan() {
        return ban;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ""+this.year+this.ban+this.num;
    }
}

// s1.setYear(2025); 2025에 있는 값을
// public void setYear(int year) {
//      this.year = year;
// }

// 함수는 return이 없고 메서드는 return이 있다.