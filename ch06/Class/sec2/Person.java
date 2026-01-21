package sec2;

public class Person {
    private String name;
    private int age;
    private int money;

    public Person(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    // 사용자 정의 메서드 ↓
    public void takeBus(Bus bus) {
        if(this.age>=65) {
            bus.take(0);
        } else if (this.age <= 19) {
            bus.take(800);
            this.money -= 800;
        } else {
            bus.take(1200);
            this.money -= 1200;
        }
    }
    public void takeSubway(Subway subway) {
        if(this.age>=65) {
            subway.take(0);
        } else if (this.age <= 19) {
            subway.take(1000);
            this.money -= 1000;
        } else {
            subway.take(1500);
            this.money -= 1500;
        }
    }

    public void showInfo() {
        System.out.println(this.name + "님의 남은 돈은 " + this.money + "냥입니다.");
    }
}
