package sec2;

public class UserActivityReportGenerator extends ReportGenerator {
    @Override
    protected void collectedData() {
        System.out.println("사용자 활동 데이터 수집");
    }

    @Override
    protected void processData() {
        System.out.println("사용자 활동 데이터 처리");
    }

    @Override
    protected void printData() {
        System.out.println("사용자 활동 보고서 출력");
    }
}
