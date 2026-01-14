package sec1;

public class Condition02 {
    public static void main(String[] args) {
        // if ~ else~
        int su = 50;
        String pass = "";
        /*
            if (su >= 60) {
                pass = "합격";
            } else {
                pass = "불합격";
            }
         */
        if (su >= 60) pass = "합격";
        else pass = "탈락";

        System.out.println("점수 : " + su);
        System.out.println("판단 : " + pass);
    }
}
