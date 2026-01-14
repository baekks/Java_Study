package sec1;

public class Q3_09 {
    public static void main(String[] args){
        int gameScore = 150;

        int lastScore1 = gameScore++;
        System.out.println(lastScore1);     // 150

        int lastScore2 = gameScore--;
        System.out.println(lastScore2);     // 151
    }
}
