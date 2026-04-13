public class Membership {
    private String name;
    private String id;
    private String contact;
    private double contribution;

    public Membership(String name, String id, String contact, double contribution) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.contribution = contribution;
    }

    public void makeContribution(double amount) {
        this.contribution += amount;
    }

    public void viewContributionHistory() {
        System.out.println(name + " has contributed a total of: P" + contribution);
    }
}