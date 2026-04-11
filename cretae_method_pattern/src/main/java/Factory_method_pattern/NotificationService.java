package Factory_method_pattern;

/**
 * 客户端调用【用工厂模式创建消息，不直接new】
 */
public class NotificationService {
    private final MessageFactory messageFactory;
    public NotificationService(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }
    public void notifyUser(String to,String content){
        Message message =  messageFactory.createMessage();
        message.send(to,content);
    }
}
