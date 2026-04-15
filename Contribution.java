public class Contribution{
    private double amount;
    private int date;

    public Contribution(double amount, int date){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid contribution amount; must be greater than 0.");
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
