package practical7.GoodDesign;

public class PDFDecorator extends ReportDecorator {

    public PDFDecorator(Report report) {

        super(report);

    }

    @Override
    public void generate() {

        super.generate();

        System.out.println("PDF Feature Added");

    }

}