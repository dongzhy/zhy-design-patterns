package Factory_method_pattern.impl;

import Factory_method_pattern.Message;

/**
 * 发送站内信
 */
public class InAppMessage implements Message {
    @Override
    public void send(String to,String content) {
        System.out.println("发送站内信给"+to+",内容"+content);
    }
}
