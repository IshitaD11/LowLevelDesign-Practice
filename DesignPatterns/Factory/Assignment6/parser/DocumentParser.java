package LowLevelDesign.DesignPatterns.Factory.Assignment6.parser;

import LowLevelDesign.DesignPatterns.Factory.Assignment6.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}
