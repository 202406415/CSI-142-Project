package motshelo.model;

import java.util.ArrayList;
import motshelo.contracts.Displayable;
import motshelo.transactions.Contribution;
import motshelo.transactions.Borrow;

public class Member extends Person implements Displayable {
    private ArrayList<Contribution> contributions;
    private ArrayList<Borrow> borrows;


    public Member(String name, String id, long cellphoneNo) {
        super(name, id, cellphoneNo);
        contributions = new ArrayList<>();
        borrows = new ArrayList<>();
    }


    public Member(String name, String id) {
        this(name, id, 0L);
    }


    public void addContribution(Contribution c) {
        contributions.add(c);
    }

    public double getTotalContribution() {
        double total = 0;
        for (Contribution c : contributions) total += c.getAmount();
        return total;
    }


    public void addBorrow(Borrow b) {
        borrows.add(b);
    }

    public ArrayList<Borrow> getBorrows() {
        return borrows;
    }

    public double getTotalOutstanding() {
        double total = 0;
        for (Borrow b : borrows)
            if (!b.isRepaid()) total += b.getAmount();
        return total;
    }

    public ArrayList<Displayable> getTransactions() {
        ArrayList<Displayable> all = new ArrayList<>();
        all.addAll(contributions);  
        all.addAll(borrows);        
        return all;
    }

    @Override
    public String getDetails() {
        return getBasicDetails()
                + "\nTotal Contributions: P" + getTotalContribution()
                + " | Outstanding Borrows: P" + getTotalOutstanding();
    }
}