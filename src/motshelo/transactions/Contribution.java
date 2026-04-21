package motshelo.transactions;

public class Contribution{
    private double amount;
    private int date;
    private String id;

    public Contribution(double amount, int date, String id){
        setAmount(amount);
        this.date = date;
        this.id = id;
    }
    public void setAmount(double amount){
        if(amount < 100){
            System.out.println("Ao sisi, 100 upwards");
            this.amount = 0.0;
        }
        else{
            this.amount = amount;
        }
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
