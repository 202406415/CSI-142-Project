public class Contribution {
    private String id;
    private String contact;
    private double amount;
    private String date;

    public Contribution(String id, String contact, double amount, String date) {
        this.id = id;
        this.contact = contact;
        this.amount = amount;
        this.date = date;
    }

    public void recordContribution() {
        System.out.println("Contribution recorded: " + amount + " by " + contact + " on " + date);
    }

    public void viewContributionHistory() {
        System.out.println("Contribution history for " + contact + ": " + amount + " on " + date);
    }
}
