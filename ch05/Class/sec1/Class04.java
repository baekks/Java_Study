package sec1;

public class Class04 {
    public static void main(String[] args) {
        Member jeongmin = new Member();
        System.out.println(jeongmin);
        jeongmin.setId("jm1004");
        jeongmin.setPw("1004");
        jeongmin.setName("김정민");
        jeongmin.setEmail("jm1004@gmail.com");
        jeongmin.setPoint(10000);
        System.out.println(jeongmin.toString());

        Member jiyoung = new Member("jy1004");
        jiyoung.setPw("1004");
        System.out.println(jiyoung);

        Member minsoo = new Member("ms1004", "1004");
        System.out.println(minsoo);

        Member gt = new Member("gt1004", "1234", "김기태");
        System.out.println(gt.toString());

    }
}
class Member {
    private String id;
    private String pw;
    private String name;
    private String email;
    private String tel;
    private int point;

    public Member() { }

    public Member(String id) {
        this.id = id;
    }

    public Member(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public Member(String id, String pw, String name, String email) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }

    public Member(String id, String pw, String name, String email, String tel) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

    public Member(String id, String pw, String name, String email, String tel, int point) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", point=" + point +
                '}';
    }
}
