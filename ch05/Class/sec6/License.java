package sec6;

public class License {
    // 멤버 필드
    private int no;             // 기본형 변수
    private String name;        // 기본형 변수
    private Score score;        // 참조형 변수

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Score getScore() {
        return score;
    }
    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "License {" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class Score {
    private int edps;
    private int pg;
    private int db;
    private int com;
    private int ai;

    public Score() {
    }

    public Score(int edps, int pg, int db, int com, int ai) {
        this.edps = edps;
        this.pg = pg;
        this.db = db;
        this.com = com;
        this.ai = ai;
    }

    public int getEdps() {
        return edps;
    }
    public void setEdps(int edps) {
        this.edps = edps;
    }
    public int getPg() {
        return pg;
    }
    public void setPg(int pg) {
        this.pg = pg;
    }
    public int getDb() {
        return db;
    }
    public void setDb(int db) {
        this.db = db;
    }
    public int getCom() {
        return com;
    }
    public void setCom(int com) {
        this.com = com;
    }
    public int getAi() {
        return ai;
    }
    public void setAi(int ai) {
        this.ai = ai;
    }

    @Override
    public String toString() {
        return "Score{" +
                "edps=" + edps +
                ", pg=" + pg +
                ", db=" + db +
                ", com=" + com +
                ", ai=" + ai +
                '}';
    }
}
class Total {
    private Score score;
    private int tot;
    private double avg;

    public Score getScore() {
        return score;
    }
    public void setScore(Score score) {
        this.score = score;
    }
    public int getTot() {
        return tot;
    }
    public void setTot(int tot) {
        this.tot = tot;
    }
    public double getAvg() {
        return avg;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Total {" +
                "score=" + score +
                ", tot=" + tot +
                ", avg=" + avg +
                '}';
    }
}
