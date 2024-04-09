package LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question;

import java.util.List;

import LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external.GoogleTranslateApi;
import LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external.GoogleTranslationRequest;

public class GoogleTranslateAdapter implements TranslationProviderAdapter{

    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        return googleTranslateApi.convert(to(translationRequest));
    }

    public GoogleTranslationRequest to(TranslationRequest request){
        return new GoogleTranslationRequest(request.getText(), 
                                            request.getSourceLanguage(), 
                                            request.gettargetLanguage(), 
                                            request.getconfidenceThreshold());
    }

    @Override
    public List<String> getLanguages() {
        return googleTranslateApi.getLanguages();
    }
    
}
