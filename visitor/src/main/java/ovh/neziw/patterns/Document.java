package ovh.neziw.patterns;

interface Document {

    void accept(final DocumentVisitor visitor);
}