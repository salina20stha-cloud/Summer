package practical7.GoodDesign;

public class WatermarkDecorator extends ReportDecorator {

    public WatermarkDecorator(Report report) {

        super(report);

    }

    @Override
    public void generate() {

        super.generate();

        System.out.println("Watermark Added");

    }

}