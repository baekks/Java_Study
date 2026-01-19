package sec6;

public class LicenseExam {
    public static void main(String[] args) {
        License lic1 = new License();
        System.out.println(lic1);

        // 임의의 자격시험 점수와 통계가 출력될 수 있게 하기
        Score s1 = new Score(90,77,84,100,95);


        Total total = new Total();
        total.setScore(s1);
        total.setTot(s1.getEdps()+s1.getPg()+ s1.getDb()+ s1.getCom()+ s1.getAi());
        total.setAvg(total.getTot()/5.0f);

        lic1.setNo(1);
        lic1.setName("경서");
        lic1.setScore(s1);
        System.out.println(lic1.toString() + "\n총점 : " + total.getTot() + "\n평균 : " + total.getAvg());
    }
}
