package motshelo.transactions;

public class Contribution{
    private double amount;
    private int date;
    private String id;

    public Contribution(double amount, int date, String id){
        this.amount = amount;
        this.date = date;
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public String getId() {
        return id;
     }
    public String getDetails() {
    return "Amount: " + amount + " Date: " + date + " ID: " + id;
    }
}
