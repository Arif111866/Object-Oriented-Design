public class NotificationFactory {
    public static Notify createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new email();
        } else if (type.equalsIgnoreCase("sms")) {
            return new sms();
        } else if (type.equalsIgnoreCase("push")) {
            return new pushNotification();
        }
        return null;
    }
}
