public class Contribution{
    private double amount;
    private int date;

    public Contribution(double amount, int date){
        if(amount <= 0){
            throw new IllegalArgumentException("Contribution amount must be > 0 (amount <= 0 is not allowed).");
        }
        this.amount = amount;
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public String getDetails() {
        return "Ontshitse P" + amount + " kadi " + date;
    }
}
