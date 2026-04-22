package motshelo.transactions;

import motshelo.contracts.Displayable;

public class Contribution implements Displayable {
    private double amount;
    private String date;

    public Contribution(double amount, String date) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be greater than 0");

        if (date == null || date.isEmpty())
            throw new IllegalArgumentException("Date cannot be empty");

        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String getDetails() {
        return "Amount: P" + amount + " | Date: " + date;
    }
}
