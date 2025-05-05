public class Manager extends Approval {
    @Override
    public void approve(int amount) {
        System.out.println("Manager approved the amount: " + amount);
    }
}    
