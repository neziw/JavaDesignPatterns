package ovh.neziw.patterns;

class PdfDocument implements Document {

    private final int pageCount;

    public PdfDocument(final int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    @Override
    public void accept(final DocumentVisitor visitor) {
        visitor.visit(this);
    }
}