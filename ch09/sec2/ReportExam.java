package sec2;

public class ReportExam {
    public static void main(String[] args) {
        ReportGenerator salesReport = new SalesReportGenerator();
        ReportGenerator userReport = new UserActivityReportGenerator();

        System.out.println("=== 매출 보고서 생성 ===");
        salesReport.generateReport();
        System.out.println("=== 사용자 활동 보고서 ===");
        userReport.generateReport();
        System.out.println("========== 끝 ==========");
    }
}
