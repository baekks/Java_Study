package question;

public class Q8 {
    public static void main(String[] args) {
        Student student1 = new Student("최정민", 150000);
        Student student2 = new Student("김승민", 230000);

        Bus bus10 = new Bus(10);
        student1.takeBus(bus10);
        Subway sub1 = new Subway(1);
        student1.takeSubway(sub1);
        Taxi taxi3 = new Taxi(3);
        student1.takeTaxi(taxi3, 12500);
        student1.showInfo();

        student2.takeSubway(sub1);
        student2.takeBus(bus10);
        student2.takeTaxi(taxi3, 28000);
        student2.showInfo();

        bus10.showInfo();
        sub1.showInfo();
        taxi3.showInfo();
    }
}
class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("버스 "+busNumber +"번의 승객은 "+passengerCount+"명 이고, 수입은 "+money+"입니다.");
    }
}
class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("전철 "+lineNumber +"호선의 승객은 "+passengerCount+"명 이고, 수입은 "+money+"입니다.");
    }
}
class Taxi {
    int taxiNumber;
    int passengerCount;
    int money;

    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("인천운수 택시 "+taxiNumber +"호차의 승객은 "+passengerCount+"명 이고, 수입은 "+money+"입니다.");
    }
}

class Student {
    public String studentName;
    public int grade;
    public int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void takeTaxi(Taxi taxi, int money) {
        taxi.take(money);
        this.money -= money;
    }

    public void showInfo() {
        System.out.println(studentName+"님의 남은 돈은 "+money+"입니다.");
    }
}
