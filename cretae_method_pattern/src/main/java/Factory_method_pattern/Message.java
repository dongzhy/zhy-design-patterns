package Factory_method_pattern;

/**
 * 抽象产品接口：通知消息
 */
public interface Message {
    void send(String to,String content);
}
