package LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question;

import java.util.List;

import LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external.MicrosoftTranslateApi;

public class MicrosoftTranslateAdapter implements TranslationProviderAdapter{

    MicrosoftTranslateApi  microsoftTranslateApi = new MicrosoftTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        return microsoftTranslateApi.translate(translationRequest.getText(), 
                                               translationRequest.getSourceLanguage(), 
                                               translationRequest.gettargetLanguage());
    }

    @Override
    public List<String> getLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
    
}
