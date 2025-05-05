public class Cashier extends Approval{
    @Override
    public void approve(int amount) {
        if (amount <= 10000) {
            System.out.println("Cashier approved the amount: " + amount);
        } else if (nextApproval != null) {
            System.err.println("Cashier cannot approve the amount: " + amount + ", forwarding to next approver.");
            nextApproval.approve(amount);
        } else {
            System.out.println("Amount exceeds approval limit and no further approvers available.");
        }
    }
}