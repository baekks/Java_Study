package sec1;

public class Condition03 {
    public static void main(String[] args) {
        int age = 34;
        String teen = "";

        if (age >= 80) {
            teen = "산수";
        } else if (age >= 70) {
            teen = "고희";
        } else if (age >= 60) {
            teen = "이순";
        } else if (age >= 50) {
            teen = "지천명";
        } else if (age >= 40) {
            teen = "불혹";
        } else if (age >= 30) {
            teen = "이립";
        } else if (age >= 20) {
            teen = "방년";
        } else if (age >= 10) {
            teen = "소녀";
        } else {
            teen = "유년";
        }
        System.out.println(teen);
    }
}
