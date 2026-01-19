package QnA;

public class Q5_9 {
    public static void main(String[] args) {
        Man man = new Man();
        man.age = 40;
        man.name = "James";
        man.isMarried = true;
        man.childNo = 3;

        System.out.println(man.toString());
    }
}
class Man {
    int age;
    String name;
    boolean isMarried;
    int childNo;

    @Override
    public String toString() {
        return "{" +
                "\n이 사랑의 나이: " + age +
                " \n이 사람의 이름: '" + name + '\'' +
                " \n이 사람의 결혼 여부: " + isMarried +
                " \n이 사람의 자녀 수: " + childNo +
                '}';
    }
}
