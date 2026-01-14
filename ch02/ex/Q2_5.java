package sec1;

/*
    '글'이라는 한글 문자의 유니코드값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 보세요.
 */
public class Q2_5 {
    public static void main(String[] args) {
        char ch1 = '글';
        int ch2= (int)ch1;

        System.out.println("ch1 : " + ch1);
        System.out.println("ch2 : " + ch2);

        char ch3 = '\uAE00';
        System.out.println("ch3 : " + ch3);
        
        // '글'의 유니코드 값 출력하기
        String unicodeHex = Integer.toHexString(ch2);
        System.out.println("b의 Hex : " + unicodeHex);
        System.out.println("'" + ch1 + "'의 유니코드 값 : " + Integer.toHexString((ch1)).toUpperCase());
    }
}
