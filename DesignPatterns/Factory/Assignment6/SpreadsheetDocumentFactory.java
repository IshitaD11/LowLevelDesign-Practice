package LowLevelDesign.DesignPatterns.Factory.Assignment6;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.parser.DocumentParser;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.parser.SpreadsheetDocumentParser;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.printer.DocumentPrinter;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.printer.SpreadsheetDocumentPrinter;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.DocumentProcessor;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory{

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
    
}
