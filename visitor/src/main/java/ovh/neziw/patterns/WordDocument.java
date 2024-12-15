package ovh.neziw.patterns;

class WordDocument implements Document {

    private final int wordCount;

    public WordDocument(final int wordCount) {
        this.wordCount = wordCount;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    @Override
    public void accept(final DocumentVisitor visitor) {
        visitor.visit(this);
    }
}