package LowLevelDesign.DesignPatterns.Factory.Assignment6.processor;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}
