package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class PreviewVisitor implements DocumentVisitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreviewVisitor.class);

    @Override
    public void visit(final PdfDocument pdfDocument) {
        LOGGER.info("Previewing PDF document with {} pages", pdfDocument.getPageCount());
    }

    @Override
    public void visit(final WordDocument wordDocument) {
        LOGGER.info("Previewing Word document with {} words", wordDocument.getWordCount());
    }

    @Override
    public void visit(final ExcelDocument excelDocument) {
        LOGGER.info("Previewing Excel document with {} sheets", excelDocument.getSheetCount());
    }
}