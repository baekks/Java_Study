package question;

public class Q5 {
    public static void main(String[] args) {
        Cafe c1 = new Cafe("김기태", "캬라멜 마끼아또", "빽다방", 3800);
        Cafe c2 = new Cafe("고문식", "아이스 아메리카노", "스타벅스", 4000);

        c1.info();
        c2.info();
    }
}

class Cafe {
    private static int count = 0;     //구매번호
    private int no;
    private String name;    //고객명
    private String menu;    //구매상품명
    private String sname; //상점명
    private int price;

    public Cafe(String name, String menu, String sname, int price) {
        this.name = name;
        this.menu = menu;
        this.sname = sname;
        this.price = price;
        count++;
        this.no = count;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getMenu() {
        return menu;
    }

    public String getSname() {
        return sname;
    }

    public int getPrice() {
        return price;
    }

    public void info() {
        System.out.println(no+"번째 "+name+"님은 "+price+"원을 내고 "+sname+"에서 "+menu+"를 사 마셨습니다.");
    }
}