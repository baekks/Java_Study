package sec2;

// 슈퍼(부모) 클래스
public class Vehicle {
    private int customCount;
    private int money;


    public int getCustomCount() {
        return customCount;
    }
    public void setCustomCount(int customCount) {
        this.customCount = customCount;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void take(int money) {
        this.money += money;
        customCount++;
    }
}
