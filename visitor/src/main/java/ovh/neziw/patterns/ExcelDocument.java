package ovh.neziw.patterns;

class ExcelDocument implements Document {

    private final int sheetCount;

    public ExcelDocument(final int sheetCount) {
        this.sheetCount = sheetCount;
    }

    public int getSheetCount() {
        return this.sheetCount;
    }

    @Override
    public void accept(final DocumentVisitor visitor) {
        visitor.visit(this);
    }
}