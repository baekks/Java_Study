package sec1;

public class NoticeExam {
    public static void main(String[] args) {
        // 메서드 체이닝(Method Chaining): 메서드를 계속 뒤에 이어 붙여 처리
        Notice n1 = new Notice.Builder()
                .bno(1L)
                .title("title1")
                .content("content1")
                .author("admin")
                .resDate("20250120")
                .hits(1)
                .build();
        System.out.println(n1.toString());
    }
}
