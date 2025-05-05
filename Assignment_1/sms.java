public class sms implements Notify {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
    
}
