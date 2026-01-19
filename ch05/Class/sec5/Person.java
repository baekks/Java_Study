package sec5;

public class Person {
    private String name;
    private float height;
    private float weight;

    // 생성자 - 기본 생성자 포함하여 모든 멤버 필드를 받는 생성자 까지
    // 생성자 오버로딩(OverLoading) = 오버로드
    public Person() {
    }
    public  Person(String name) {
        this.name = name;
    }
    public Person(String name, float height) {
        this.name = name;
        this.height = height;
    }
    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
