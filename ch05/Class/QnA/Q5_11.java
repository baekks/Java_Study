package QnA;

public class Q5_11 {
    public static void main(String[] args) {
        People p1 = new People("백경서", 168.3f, 53.2f);
        System.out.println(p1.toString());
    }
}
class People {
    String name;
    float height;
    float weight;

    public People(String pname) {
        name = pname;
    }

    public People() {
    }
    public People(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
