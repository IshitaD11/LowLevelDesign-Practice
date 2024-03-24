package LowLevelDesign.DesignPatterns.Factory.Assignment3;

public class Client {
    public static void main(String[] args) {
        DocumentProcessor dp = DocumentProcessorFactory.getDocumentProcessor(DocumentType.PRESENTATION, "PresentationDocument");

        System.out.println(dp.getDocumentName());

    }
}
