package sec3;

import java.time.LocalDateTime;

public interface Logger {
    // 인터페이스 상수: final static이 기본으로 정해짐
    int LEVEL_INFO = 1;
    int LEVEL_WARN = 2;
    int LEVEL_ERROR = 3;
    
    // 추상 메서드
    void log(String message);

    // default, static, private 메서드 등은 구현 내용을 기술할 수 있다.
    // default(디폴트) 메서드: 원래 인터페이스에서는 메서드의 구현 내용을 적시할 수 없으나,
    // 메서드의 맨 앞에 default를 넣어 두면, 구현 내용을 기술할 수 있음
    default void info(String message) {
        log(format("INFO", message));
    }

    default void warn(String message) {
        log(format("WARN", message));
    }

    default void error(String message) {
        log(format("ERROR", message));
    }
    
    // static 메서드: 오버로딩 없이 사용할 공유 메서드
    static String now() {
        return LocalDateTime.now().toString();
    }
    
    // private 메서드: 현재 인터페이스 내에서만 접근 가능한 메서드
    private String format(String level, String message) {
        return "["+level+"]: " + message;
    }
}
