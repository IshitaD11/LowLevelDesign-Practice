package LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question.external;

import java.util.List;

public class FacebookApi {

    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        ApiUtils.logFacebookGetPosts();
        return List.of(new FacebookPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        ApiUtils.logFacebookPostStatus();
    }
}