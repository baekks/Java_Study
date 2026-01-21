package sec1;

import javax.swing.border.Border;

public class Board {
    private long no;
    private String title;
    private String content;
    private String author;
    private String resdate;
    private int hits;

    // this() 함수를 써서 생성자 만들기
    public Board() {
        this(0);
    }
    public Board(long no) {
        this(no, "첫 번째 제목");
    }
    public Board(long no, String title) {
        this(no, title, "첫 내용은 멀로 하지?");
    }
    public Board(long no, String title, String content) {
        this(no, title, content, "백경서");
    }
    public Board(long no, String title, String content, String author) {
        this(no, title, content, author, "20260120095745");
    }
    public Board(long no, String title, String content, String author, String resdate) {
        this(no, title, content, author, resdate, 0);
    }
    public Board(long no, String title, String content, String author, String resdate, int hits) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.author = author;
        this.resdate = resdate;
        this.hits = hits;
    }

    public long getNo() {
        return no;
    }
    public void setNo(long no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResdate() {
        return resdate;
    }
    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    public int getHits() {
        return hits;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", resdate='" + resdate + '\'' +
                ", hits=" + hits +
                '}';
    }
}
