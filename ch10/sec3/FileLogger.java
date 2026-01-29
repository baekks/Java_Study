package sec3;

public class FileLogger implements Logger {

    // 추상 메서드는 오버라이딩이 필수
    @Override
    public void log(String message) {
        System.out.println("파일 기록: " + message);
    }

    // default 메서드는 오버라이딩이 선택
    @Override
    public void error(String message) {
        Logger.super.error("File Log: "+message);
    }
}
