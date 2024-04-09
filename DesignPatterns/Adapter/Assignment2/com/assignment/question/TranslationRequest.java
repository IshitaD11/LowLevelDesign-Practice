package LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question;

public class TranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;


    public String getText(){
        return this.text;
    }

    public String getSourceLanguage(){
        return this.sourceLanguage;
    }

    public String gettargetLanguage(){
        return this.targetLanguage;
    }

    public Double getconfidenceThreshold(){
        return this.confidenceThreshold;
    }
}
