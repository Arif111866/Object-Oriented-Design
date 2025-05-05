public class ChainOfResposibility {

    public static void main(String[] args) {
        Approval manager = new Manager(); 
        manager.setnextapproval(null); // Set the next approver to null for the manager

        Approval seniorOfficer = new SeniorOfficer(); 
        seniorOfficer.setnextapproval(manager); // Set the next approver for the Senior Officer

        Approval cashier = new Cashier(); 
        cashier.setnextapproval(seniorOfficer); // Set the next approver for the Cashier

        // Test the chain of responsibility
        int amountToApprove = 1000000;
        cashier.approve(amountToApprove);
    }
}