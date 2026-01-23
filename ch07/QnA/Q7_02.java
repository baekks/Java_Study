package QnA;

public class Q7_02 {
    // 217쪽의 알파벳을 출력하는 예제에서 각 배열 요솟값을 대문자에서 소문자로 변환해 출력하세요.
    // - A의 아스키 값은 65, a의 아스키 값은 97이므로 두 문자는 32만큼 차이가 납니다.
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i=0; i<alphabets.length; i++, ch++) {
            alphabets[i] = ch;          // 아스키 코드값을 각 요소에 저장
        }

        for(int i=0; i<alphabets.length; i++) {
            alphabets[i] = Character.toLowerCase(alphabets[i]);
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }
    }
}
