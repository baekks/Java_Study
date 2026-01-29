package sec2;

// 판매 보고서
public class SalesReportGenerator extends ReportGenerator {
    @Override
    protected void collectedData() {
        System.out.println("매출 데이터 수집");
    }

    @Override
    protected void processData() {
        System.out.println("매출 데이터 처리");
    }

    @Override
    protected void printData() {
        System.out.println("매출 보고서 출력");
    }
}
