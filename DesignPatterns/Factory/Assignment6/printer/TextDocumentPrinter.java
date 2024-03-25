package LowLevelDesign.DesignPatterns.Factory.Assignment6.printer;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.DocumentType;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
