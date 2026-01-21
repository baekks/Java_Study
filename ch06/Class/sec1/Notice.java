package sec1;

// 빌더 패턴 Builder
public class Notice {
    private long bno;
    private String title;
    private String content;
    private String author;
    private String resDate;
    private int hits;

    public long getBno() {
        return bno;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getAuthor() {
        return author;
    }
    public String getResDate() {
        return resDate;
    }
    public int getHits() {
        return hits;
    }

    private Notice(Builder builder) {
        this.bno = builder.bno;
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
        this.resDate = builder.resDate;
        this.hits = builder.hits;
    }

    // Builder.build()에 의해서만 생성될 수 있게 private으로 설정함
    public static class Builder {
        private long bno;
        private String title;
        private String content;
        private String author;
        private String resDate;
        private int hits;

        public Builder() {}

        public Builder bno(long bno) {  // Notice setBno 역할
            this.bno = bno;
            return this;
        }
        public Builder title(String title) {    // setTitle
            this.title = title;
            return this;
        }
        public Builder content(String content) {    // setContent
            this.content = content;
            return this;
        }
        public Builder author(String author) {
            this.author = author;
            return this;
        }
        public Builder resDate(String resDate) {
            this.resDate = resDate;
            return this;
        }
        public Builder hits(int hits) {
            this.hits = hits;
            return this;
        }
        //
        public Notice build(){
            return new Notice(this);
        }
    }

    @Override
    public String toString() {
        return "Notice{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", resDate='" + resDate + '\'' +
                ", hits=" + hits +
                '}';
    }
}
