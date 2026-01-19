package sec2;

// 클래스, 필드, 메서드, 생성자 모두 접근제어(제한)자가 있음
// public(패키지와 관계없이 어드서든 접근) > default(같은 패키지 내에서만 접근) > private(현재 클래스 내부에서만 접근)
public class Person {
    private String name;        // 이름
    private int height;         // 키
    private double weight;      // 몸무게
    private char gender;        // 성별
    private boolean marrid;     // 결혼 여부

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isMarrid() {
        return marrid;
    }

    public void setMarrid(boolean marrid) {
        this.marrid = marrid;
    }
}
