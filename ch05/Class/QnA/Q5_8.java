package QnA;

public class Q5_8 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(" + : " + cal.add(10,4));
        System.out.println(" - : " + cal.subtract(10,4));
        System.out.println(" * : " + cal.multiply(10,4));
        System.out.println(" / : " + cal.divide(10,4));
    }
}
class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public double divide(int a, int b) {
        return (double) a/b;
    }
}