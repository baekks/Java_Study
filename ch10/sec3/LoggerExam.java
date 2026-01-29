package sec3;

public class LoggerExam {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        
        consoleLogger.info("서버 시작");
        consoleLogger.warn("메모리 사용량 증가");
        consoleLogger.error("서버 오류 발생");
        System.out.println("-------------------");
        fileLogger.info("파일 저장 시작");
        fileLogger.error("디스크 용량 부족");
    }
}
