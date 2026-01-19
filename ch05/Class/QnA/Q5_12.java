package QnA;

import sec4.Student;

public class Q5_12 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.address = "인천 부평구";
        studentLee.setStudnetName("이동윤");

        System.out.println(studentLee.toString());
    }
}

class Student1 {
    String address;
    private String studnetName;

    public String getStudnetName() {
        return studnetName;
    }

    public void setStudnetName(String studnetName) {
        this.studnetName = studnetName;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "address='" + address + '\'' +
                ", studnetName='" + studnetName + '\'' +
                '}';
    }
}
