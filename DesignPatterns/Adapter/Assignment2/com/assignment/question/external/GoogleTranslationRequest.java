package LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external;

public class GoogleTranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;

    public GoogleTranslationRequest(String text, String sourceLanguage, String targetLanguage, Double confidenceThreshold){
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.confidenceThreshold = confidenceThreshold;
    }

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
