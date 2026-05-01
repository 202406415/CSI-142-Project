package motshelo.transactions;

import motshelo.contracts.Displayable;

public class Borrow implements Displayable {
    private double amount;
    private String borrowDate;
    private String dueDate;
    private boolean repaid;

    public Borrow(double amount, String borrowDate, String dueDate) {
        if (amount <= 0)
            throw new IllegalArgumentException("Borrow amount must be greater than 0");
        if (borrowDate == null || borrowDate.isEmpty())
            throw new IllegalArgumentException("Borrow date cannot be empty");
        if (dueDate == null || dueDate.isEmpty())
            throw new IllegalArgumentException("Due date cannot be empty");
        this.amount = amount;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.repaid = false;
    }

    public Borrow(double amount, String borrowDate) {
        this(amount, borrowDate, "TBD");
    }

    public double getAmount() { return amount; }
    public boolean isRepaid() { return repaid; }

    public void markRepaid() {
        if (repaid)
            throw new IllegalStateException("This borrow has already been repaid");
        repaid = true;
    }

    @Override
    public String getDetails() {
        String status = repaid ? "REPAID" : "OUTSTANDING";
        return "Borrow: P" + amount + " | Borrowed: " + borrowDate
                + " | Due: " + dueDate + " | Status: " + status;
    }
}