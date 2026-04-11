package Factory_method_pattern;

public class Main {
    public static void main(String[] args) {
        SmsMessageFactory factory = new SmsMessageFactory();//切换只需换这里
        NotificationService service = new NotificationService(factory);
        service.notifyUser("13660899397","你的验证码是123456");
    }
}
