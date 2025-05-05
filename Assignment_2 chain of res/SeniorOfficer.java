public class SeniorOfficer extends Approval {
    @Override
    public void approve(int amount) {
        if (amount <= 1000000) {
            System.out.println("Senior Officer approved the amount: " + amount);
        } else if (nextApproval != null) {
            System.out.println("Senior Officer cannot approve the amount: " + amount + ". Forwarding to next approver.");
            nextApproval.approve(amount);
        } else {
            System.out.println("Amount exceeds approval limit and no further approvers available.");
        }
    }

    
}