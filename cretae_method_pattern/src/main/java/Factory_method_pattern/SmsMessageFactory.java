package Factory_method_pattern;

import Factory_method_pattern.impl.SmsMessage;

public class SmsMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new SmsMessage();
    }
}
