package LowLevelDesign.DesignPatterns.Factory.Assignment6.parser;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
