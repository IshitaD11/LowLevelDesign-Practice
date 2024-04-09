package LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external;

import static LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external.ApiUtils.logMicrosoftTranslate;
import static LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question.external.ApiUtils.logMicrosoftGetSupportedLanguages;

import java.util.List;

public class MicrosoftTranslateApi {
    public String translate(String text, String sourceLanguage, String targetLanguage) {
        // Implementation for translating text using Microsoft Translator API
        logMicrosoftTranslate();
        return "Translated text";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        // Implementation for fetching supported languages from Microsoft Translator
        logMicrosoftGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}
