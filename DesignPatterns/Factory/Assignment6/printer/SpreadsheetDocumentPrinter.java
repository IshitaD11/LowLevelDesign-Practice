package LowLevelDesign.DesignPatterns.Factory.Assignment6.printer;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.DocumentType;
import LowLevelDesign.DesignPatterns.Factory.Assignment6.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
