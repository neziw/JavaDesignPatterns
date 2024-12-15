package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class VisitorExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(VisitorExample.class);

    public static void main(final String[] args) {
        final Document pdfDocument = new PdfDocument(10);
        final Document wordDocument = new WordDocument(8024);
        final Document excelDocument = new ExcelDocument(8);

        final DocumentVisitor exportVisitor = new ExportVisitor();
        final DocumentVisitor previewVisitor = new PreviewVisitor();

        LOGGER.info("Exporting documents:");
        pdfDocument.accept(exportVisitor);
        wordDocument.accept(exportVisitor);
        excelDocument.accept(exportVisitor);

        LOGGER.info("\nPreviewing documents:");
        pdfDocument.accept(previewVisitor);
        wordDocument.accept(previewVisitor);
        excelDocument.accept(previewVisitor);
    }
}