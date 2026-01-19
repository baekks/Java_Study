package sec4;

// 객체지향형 특징: 캡슐화와 정보은닉, 다형성, 상속, 추상화
public class Student {

    // 멤버 필드(속성) = 멤버 변수
    // 캡슐화: 하나의 객체 안에 서로 관련성 있는 멤버 변수와 멤버 메서드를 하나로 묶는 것
    // 정보은닉: 접근 제한자에 의해 정보를 외부에서 보이지 않게 하고, 안정성 있게 필요한 메서드로 접근하게 하는 행위
    int studentID;
    String studentName;
    int grade;
    String address;


    // 디폴트 생성자
    // setter와 getter
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
class School {
    Student st1;
    String addr;

    public School() {}
    public School (Student st1) {
        this.st1 = st1;
    }
    public School (Student st1, String addr) {
        this.st1 = st1;
        this.addr = addr;
    }

    public void setSt1(Student st1) {
        this.st1 = st1;
    }
    public Student getSt1() {
        return st1;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getAddr() {
        return addr;
    }
}

