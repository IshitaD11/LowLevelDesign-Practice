package LowLevelDesign.DesignPatterns.Adapter.Assignment2.com.assignment.question;

import java.util.List;

public interface TranslationProviderAdapter {

    public String translate(TranslationRequest translationRequest);

    public List<String> getLanguages();


}