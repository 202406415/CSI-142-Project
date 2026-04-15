public class Contribution{
    private double amount;
    private int date;

    public Contribution(double amount, int date){
        if(amount <= 0){
            throw new IllegalArgumentException("Contribution amount must be positive.");
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
