public class NotificationServers {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        
        Notify emailNotification = factory.createNotification("email");
        emailNotification.notifyUser("This is an email notification.");


        Notify smsNotification = factory.createNotification("sms"); 
        smsNotification.notifyUser("This is an SMS notification.");
        Notify pushNotification = factory.createNotification("push");
        pushNotification.notifyUser("This is a push notification.");
        Notify invalidNotification = factory.createNotification("invalid"); // This will return null
    }
}