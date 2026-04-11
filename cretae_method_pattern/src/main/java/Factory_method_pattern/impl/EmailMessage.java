package Factory_method_pattern.impl;

import Factory_method_pattern.Message;

/**
 * 发送邮件
 */
public class EmailMessage implements Message {
    @Override
    public void send(String to,String content) {
        System.out.println("发送邮件给"+to+",内容"+content);
    }
}
