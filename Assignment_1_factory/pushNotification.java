public class pushNotification implements Notify {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending push notification: " + message);
    }
    
}
