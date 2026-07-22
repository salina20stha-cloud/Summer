package practical7.GoodDesign;

public class SignatureDecorator extends ReportDecorator {

    public SignatureDecorator(Report report) {

        super(report);

    }

    @Override
    public void generate() {

        super.generate();

        System.out.println("Digital Signature Added");

    }

}