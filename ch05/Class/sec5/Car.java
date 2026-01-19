package sec5;

// 생성자 오버로드, this(): 현재 클래스의 생성자 함수 호출
// this: 현재 클래스의 멤버 필드
public class Car {
    private String brand;
    private String carType;
    private int wheel;
    private int year;

    // 현재 객체의 생성자: this() 호출하여 정의하면서 기본값을 정의
    public Car() {
        this("현대");
    }
    public Car(String brand) {
        this(brand,"소나타");
    }
    public Car(String brand, String carType) {
        this(brand, carType, 4);
    }
    public Car(String brand, String carType, int wheel) {
        this(brand, carType, wheel, 2026);
    }
    public Car(String brand, String carType, int wheel, int year) {
        this.brand = brand;
        this.carType = carType;
        this.wheel = wheel;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getWheel() {
        return wheel;
    }
    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carType='" + carType + '\'' +
                ", wheel=" + wheel +
                ", year=" + year +
                '}';
    }
}
