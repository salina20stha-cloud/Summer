package practical7.GoodDesign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReportDecoratorTest {

    @Test
    void testBasicReportGeneration() {

        Report report = new StudentReport();

        assertDoesNotThrow(() -> report.generate());

    }

    @Test
    void testPDFFeatureWorks() {

        Report report = new PDFDecorator(new StudentReport());

        assertDoesNotThrow(() -> report.generate());

    }

    @Test
    void testWatermarkFeatureWorks() {

        Report report = new WatermarkDecorator(new StudentReport());

        assertDoesNotThrow(() -> report.generate());

    }

    @Test
    void testSignatureFeatureWorks() {

        Report report = new SignatureDecorator(new StudentReport());

        assertDoesNotThrow(() -> report.generate());

    }

    @Test
    void testDecoratedReportNotNull() {

        Report report = new SignatureDecorator(
                new WatermarkDecorator(
                        new PDFDecorator(
                                new StudentReport())));

        assertNotNull(report);

    }

}