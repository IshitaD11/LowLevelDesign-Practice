package LowLevelDesign.DesignPatterns.Adapter.Assignment1;

import java.util.List;

import LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question.external.FacebookApi;
import LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question.external.FacebookPost;
import LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question.external.TwitterApi;
import LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question.external.TwitterTweet;

public class SocialMediaManager {
    private FacebookApi facebookApi = new FacebookApi();
    private TwitterApi twitterApi = new TwitterApi();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        } else if (platform.equals("twitter")) {
            List<TwitterTweet> tweets = twitterApi.getTweets(userId);
        }

        // Convert the posts/tweets to a common format
    }
}