package LowLevelDesign.DesignPatterns.Factory.Assignment6.parser;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
