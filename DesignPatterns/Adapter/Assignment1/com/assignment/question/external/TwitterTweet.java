package LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question.external;


public class TwitterTweet {
    private String id;
    private String tweet;
    private Long userId;

    public TwitterTweet(String id, String tweet, Long userId){
        this.id = id;
        this.tweet = tweet;
        this.userId = userId;
    }

    public String getId(){
        return this.id;
    }

    public String getTweet(){
        return this.tweet;
    }

    public Long getUserId(){
        return this.userId;
    }
}
