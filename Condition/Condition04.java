package sec1;

public class Condition04 {
    public static void main(String[] args){
        int kor = 100;
        int eng = 60;
        int mat = 95;

        float avg = (kor + eng + mat) / 3.0f;

        /*
            판정은 평균이 60이상이고, 모든 과목이 40점 이상이면, "합격"
            평균이 60이상이고, 하나의 과목이라도 40점 미만이면, "과락"
            평균이 60미만이면, "탈락"

            if~ else if~를 사용하여!!

            각 과목의 점수와 평균, 판정을 출력
         */
        String pass = "";

        if (avg >= 80 && (kor >=40 && eng >=40 && mat >=40)) {
            pass = "합격";
        } else if (avg >=60 && (kor > 40 || eng > 40 || mat > 40)) {
            pass = "과락";
        } else {
            pass = "탈락";
        }

        System.out.println("kor : " + kor);
        System.out.println("eng : " + eng);
        System.out.println("mat : " + mat);
        System.out.println("avg : " + avg);
        System.out.println("pass : " + pass);
    }
}
