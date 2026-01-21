package sec2;

// 메인(실행) 클래스: main 함수가 필히 있어야 함
public class PersonExam {
    public static void main(String[] args) {
        Person p1 = new Person("백경서", 23, 100000);
        Person p2 = new Person("전보경", 32, 1200000);

        Bus bus = new Bus();
        bus.setBusNo(955);
        bus.setCustomCount(1);  // 현재 버스가 타고 있는 인원
        bus.setMoney(1200);     // 현재 버스가 벌어드인 돈
        p1.takeBus(bus);
        bus.showInfo();
        p1.showInfo();

        Subway sub2 = new Subway();
        sub2.setLineNo(2);
        sub2.setCustomCount(10);      // 현재 탑승 인원수
        sub2.setMoney(15000);         // 현재 지하철이 벌어들인 돈
        p2.takeSubway(sub2);
        sub2.showInfo();
        p2.showInfo();
    }
}
