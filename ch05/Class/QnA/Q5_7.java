package QnA;

public class Q5_7 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "백경서";
        p1.age = 32;
        p1.gender = 'F';

        System.out.println("이름: " + p1.name + "\n나이: " + p1.age + "\n성별: " + p1.gender);
    }
}
class Person {
    String name;
    int age;
    char gender;
}