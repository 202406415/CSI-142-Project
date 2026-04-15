public class Contribution{
    private double amount;
    private int date;

    public Contribution(double amount, int date){
        this.amount = amount;
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public String getDetails() {
        return "contributed amount of P" + amount + " on " + date;
    }
}
