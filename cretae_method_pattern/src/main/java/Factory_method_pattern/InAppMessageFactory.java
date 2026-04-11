package Factory_method_pattern;

import Factory_method_pattern.impl.InAppMessage;

/**
 * 具体工厂
 */

public class InAppMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new InAppMessage();
    }
}
