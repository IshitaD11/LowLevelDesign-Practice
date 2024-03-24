package LowLevelDesign.DesignPatterns.Factory.Assignment3;

public abstract class DocumentProcessor {

    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return this.documentName;
    }

    public abstract DocumentType supportsType();
    public abstract void processDocument();

}
