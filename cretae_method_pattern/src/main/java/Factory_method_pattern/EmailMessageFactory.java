package Factory_method_pattern;

import Factory_method_pattern.impl.EmailMessage;

/**
 * 具体工厂
 */

public class EmailMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new EmailMessage();
    }
}
