package LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question;

import java.util.List;

public interface SocialMediaAdapter {

    List<SocialMediaPost> getPosts(Long userId, Long timestamp);

    void post(Long userId, String message);
}