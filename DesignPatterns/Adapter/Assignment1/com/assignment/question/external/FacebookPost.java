package LowLevelDesign.DesignPatterns.Adapter.Assignment1.com.assignment.question.external;

public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;

    public FacebookPost(String id, String status, Long userId, Long timestamp){
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    public String getId(){
        return this.id;
    }

    public String getStatus(){
        return this.status;
    }

    public Long getUserId(){
        return this.userId;
    }

    public Long getTimestamp(){
        return this.timestamp;
    }
}