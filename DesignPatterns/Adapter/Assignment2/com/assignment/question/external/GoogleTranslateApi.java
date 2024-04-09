package LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external;

import static LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external.ApiUtils.logGoogleTranslate;
import static LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external.ApiUtils.logGoogleGetSupportedLanguages;

import java.util.List;

public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}