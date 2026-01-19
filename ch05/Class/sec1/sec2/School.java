package sec2;

// 클래스는 필드(기본, 참조), 메서드(getter/setter/출력/사용자정의), 생성자(기본, 추가)
public class School {
    private int schoolID;
    private String schoolName;
    private String address;


    // 생성자는 생략 가능하나 전언하지 않더라도 자동으로 기본 생성자가 내장되어 있다.
    // 그러나, 기본 생성자 외에 다른 생성자를 선언하면, 반드시 기본 생성자도 기술해야함
    public School() {
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolID=" + schoolID +
                ", schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
