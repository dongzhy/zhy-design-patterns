package Factory_method_pattern.impl;

import Factory_method_pattern.Message;

/**
 * 发送短信
 */
public class SmsMessage implements Message {
    @Override
    public void send(String to,String content) {
        System.out.println("发送信息给"+to+",内容"+content);
    }
}
