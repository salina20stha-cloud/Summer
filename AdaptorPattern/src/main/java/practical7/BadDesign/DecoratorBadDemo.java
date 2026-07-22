package practical7.BadDesign;

public class DecoratorBadDemo {

    public static void main(String[] args) {

        StudentReportPDFWatermarkSignature report =
                new StudentReportPDFWatermarkSignature();

        report.generateReport();

    }

}