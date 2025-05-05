public class email implements Notify {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending email notification: " + message);
    }
    
}
