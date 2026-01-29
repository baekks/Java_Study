package sec2;

public abstract class ReportGenerator {

    // 추상 메서드(자료 수집 => 계산 => 출력)
    protected abstract void collectedData();
    protected abstract void processData();
    protected abstract void printData();
    
    // 공통 메서드 => 오버라이드 선택
    protected void logStart() {
        System.out.println("보고서 생성 시작");
    }
    
    protected void logEnd() {
        System.out.println("보고서 생성 완료");
    }

    // 템플릿 메서드
    public final void generateReport() {
        collectedData();
        processData();
        printData();
    }
}
