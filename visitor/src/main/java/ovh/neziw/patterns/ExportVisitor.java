package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ExportVisitor implements DocumentVisitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExportVisitor.class);

    @Override
    public void visit(final PdfDocument pdfDocument) {
        LOGGER.info("Exporting PDF document with {} pages", pdfDocument.getPageCount());
    }

    @Override
    public void visit(final WordDocument wordDocument) {
        LOGGER.info("Exporting Word document with {} words", wordDocument.getWordCount());
    }

    @Override
    public void visit(final ExcelDocument excelDocument) {
        LOGGER.info("Exporting Excel document with {} sheets", excelDocument.getSheetCount());
    }
}