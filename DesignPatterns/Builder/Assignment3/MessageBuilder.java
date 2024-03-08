package ScalerLLD.DesignPatterns.Builder.Assignment3;

@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    MessageBuilder(Builder build){
        this.messageType = build.messageType;
        this.content = build.content;
        this.sender = build.sender;
        this.recipient = build.recipient;
        this.isDelivered = build.isDelivered;
        this.timestamp = build.timestamp;
    }

    public Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public MessageType getMessageType() {
            return messageType;
        }

        public Builder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }
    
        public String getContent() {
            return content;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }
    
        public String getSender() {
            return sender;
        }

        public Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }
    
        public String getRecipient() {
            return recipient;
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }
    
        public boolean isDelivered() {
            return isDelivered;
        }

        public Builder setIsDelivered(boolean isDelivered) {
            this.isDelivered = isDelivered;
            return this;
        }
    
        public long getTimestamp() {
            return timestamp;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder builder(){
            return new MessageBuilder(this);
        }
    }
}
