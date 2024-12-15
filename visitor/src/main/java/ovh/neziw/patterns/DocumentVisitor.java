package ovh.neziw.patterns;

interface DocumentVisitor {

    void visit(final PdfDocument pdfDocument);

    void visit(final WordDocument wordDocument);

    void visit(final ExcelDocument excelDocument);
}