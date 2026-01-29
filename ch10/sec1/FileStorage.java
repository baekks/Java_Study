package sec1;

// 공통 사항을 규정하고, 추상체이므로 메서드는 선언만한다.
public interface FileStorage {
    double PI = 3.14;                   // 인터페이스 필드는 final static 붙이지않아도 상수 취급
    String ERROR = "해당 파일을 찾을 수 없습니다.";
    void save(String filename, byte[] data);
}
