package LowLevelDesign.DesignPatterns.Factory.Assignment6;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.parser.DocumentParser;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.printer.DocumentPrinter;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createDocumentProcessor(String documentName);

    public abstract DocumentType supportsType();
}
