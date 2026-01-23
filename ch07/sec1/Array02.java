package sec1;

public class Array02 {
    public static void main(String[] args) {
        Result rs1 = new Result(1, 100,90,90, 30);
        Result rs2 = new Result(2, 90,92,85, 50);
        Result rs3 = new Result(3, 80,94,90, 70);
        Result rs4 = new Result(4, 70,96,95, 90);
        Result rs5 = new Result(5, 60,98,100, 10);

        Result[] res = new Result[5];   // 객체의 배열
        // 5명의 수험번호와 점수를 초기화하는 명령문 입력
        // res[] = new Result(1, 100,90,90, 30);
        res[0] = rs1;
        res[1] = rs2;
        res[2] = rs3;
        res[3] = rs4;
        res[4] = rs5;

        // res[0]~res[4]의 내용을 반복문을 활용해 출력
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i].toString());
        }

        // Result 배열의 선언 및 할당/초기화
        Result[] arr = {
            new Result(1, 100,90,80, 30),
            new Result(2, 90,92,85, 50),
            new Result(3, 80,94,90, 70),
            new Result(4, 70,96,95, 90),
            new Result(5, 60,98,100, 10)
        };

        for(Result a: arr) {    // for (클래스명 객체: 배열객체) { } => for~each~문
            System.out.println(a.toString());
        }

    }
}

class Result {
    private int no;
    private int edps;
    private int dbms;
    private int com;
    private int pg;

    public Result(int no, int edps, int dbms, int com, int pg) {
        this.no = no;
        this.edps = edps;
        this.dbms = dbms;
        this.com = com;
        this.pg = pg;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getEdps() {
        return edps;
    }

    public void setEdps(int edps) {
        this.edps = edps;
    }

    public int getDbms() {
        return dbms;
    }

    public void setDbms(int dbms) {
        this.dbms = dbms;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "no=" + no +
                ", edps=" + edps +
                ", dbms=" + dbms +
                ", com=" + com +
                ", pg=" + pg +
                '}';
    }
}
