package question;

public class Q11 {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourCar = factory.createCar();
        System.out.println(mySonata.getCarNum());   //10001
        System.out.println(yourCar.getCarNum());    //10002
    }
}
class CarFactory {  //싱글톤과 createCar() 메서드로 Car 객체 생성
    private static CarFactory instance;
    private CarFactory() { }
    public static CarFactory getInstance(){
        if(instance==null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car();
    }
}
class Car { //carNum의 자동 증가 발생(10001~)
    private static int no;
    private int carNum;
    private String name;

    public Car() {
        no++;
        this.carNum = no + 10000;
    }

    public int getCarNum() {
        return carNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}