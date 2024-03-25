package LowLevelDesign.DesignPatterns.Factory.Assignment6.printer;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.DocumentType;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}
