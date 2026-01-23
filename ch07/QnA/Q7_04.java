package QnA;

public class Q7_04 {
    // 배열 길이가 5인 Dog[] 배열을 만든 후 Dog 인스턴스를 5개 생성하여 배열에 추가합니다.
    // for문과 향상된 for문에서 Dog 클래스의 showDogInfo() 메서드를 사용하여 배열에 추가한 Dog 정보를 모두 출력하세요.
    public static void main(String[] args) {
        Dog[] dog = new Dog[5];
        int index = 0;
        dog[0] = new Dog("닥트", "닥스훈트");
        dog[1] = new Dog("시바", "시바견");
        dog[2] = new Dog("랄독", "치와와");
        dog[3] = new Dog("골댕이", "골든리트리버");
        dog[4] = new Dog("똘견", "비숑");

        for (int i=0; i<dog.length; i++) {
            System.out.println(dog[i].showDogInfo());
        }

        for (Dog d:dog) {
            System.out.println(d.showDogInfo());
        }
    }
}

class Dog {
    private String name;
    private String type;

    public Dog(Dog other) {
        this.name = other.name;
        this.type = other.type;
    }

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String showDogInfo() {
        return name + "," + type;
    }
}
