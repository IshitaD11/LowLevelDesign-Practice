package LowLevelDesign.DesignPatterns.Factory.Assignment6;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.parser.DocumentParser;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.parser.TextDocumentParser;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.printer.DocumentPrinter;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.printer.TextDocumentPrinter;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.DocumentProcessor;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory{

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
    
}
