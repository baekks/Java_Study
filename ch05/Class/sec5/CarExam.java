package sec5;

public class CarExam {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        car1.setYear(2024);
        System.out.println(car1);

        Car car2 = new Car("KIA");
        System.out.println(car2);
        car2.setCarType("K5");
        System.out.println(car2);

        Car car3 = new Car("GM", "트랙스");
        System.out.println(car3);

        Car car4 = new Car("BMW", "520D", 4);
        System.out.println(car4);
    }
}
