package sec1;

import javax.swing.border.Border;

public class Board {
    // 글번호, 제목, 글내용, 글쓴이, 글작성일시, 조회수
    private long no;
    private String title;
    private String content;
    private String author;
    private String resdate;
    private int hit;

    // Construtor
    // 기본 생성자
    public Board() {

    }
    // No
    public Board(long no) {
        this.no = no;
    }
    // No, Title
    public Board(long no, String title) {
        this.no = no;
        this.title = title;
    }
    // No, Title, Content
    public Board(long no, String title, String content) {
        this.no = no;
        this.title = title;
        this.content = content;
    }


    // No getter setter
    public void setNo(long no) {
        this.no = no;
    }
    public long getNo() {
        return no;
    }
    // Title getter setter
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    // Content getter setter
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    // Author getter setter
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    // Resdate getter setter
    public void setResdate(String resdate) {
        this.resdate = resdate;
    }
    public String getResdate() {
        return resdate;
    }
    // Hit getter setter
    public void setHit(int hit) {
        this.hit = hit;
    }
    public int getHit() {
        return hit;
    }

//    public String toString() {
//        return "글번호: "+this.no + " 제목: " + this.title + " 글내용: " + this.content +
//                " 작성자: " + this.author + " 작성일: " + this.resdate + " 조회수: " + this.hit;
//    }

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", resdate='" + resdate + '\'' +
                ", hit=" + hit +
                '}';
    }
}

