package sec4;

public class StudentExam {
    public static void main(String[] args) {
        School sc1 = new School();
        Student st1 = new Student();
        st1.studentID = 1;              // 직접 접근 =>
        // st1 = 인스턴스 = 객체
        // st1.studentID = 인스턴스 변수
        st1.setStudentID(1);
        st1.studentName = "백경서";    // 직접 접근이 가능함 뒤에서 필드를 default로 만들었기 때문
        st1.setGrade(1);
        

        School sc2 = new School(st1);
    }
}
