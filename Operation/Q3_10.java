package sec1;

public class Q3_10 {
    public static void main(String[] args) {
        int num = 5;
        int i = 10;

        boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);  // true || true
        System.out.println(value);                                      // true
        System.out.println(num);                                        // 50
        System.out.println(i);                                          // value의 값을 구할 때 앞에 값이 true여서 뒤에 나오는 i 값을 연산 안하고 무시함... 그래서 실행을 하지 않아서 10이 나옴 실제는 5임
    }
}
