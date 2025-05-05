public abstract class Approval {
    protected Approval nextApproval;
    public void setnextapproval(Approval nextApproval) {
        this.nextApproval = nextApproval;
    }
    public abstract void approve(int amount);
}