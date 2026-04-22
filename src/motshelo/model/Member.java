package motshelo.model;

import java.util.ArrayList;
import motshelo.transactions.Contribution;
import motshelo.contracts.Displayable;

public class Member extends Person implements Displayable {
    private ArrayList<Contribution> contributions;

    public Member(String name, String id, int cellphoneNo) {
        super(name, id, cellphoneNo);
        contributions = new ArrayList<>();
    }

    public void addContribution(Contribution c) {
        contributions.add(c);
    }

    public double getTotalContribution() {
        double total = 0;
        for (Contribution c : contributions) {
            total += c.getAmount();
        }
        return total;
    }

    @Override
    public String getDetails() {
        String result = getBasicDetails() + "\nTotal Contributions: " + getTotalContribution();

        if (contributions.isEmpty()) {
            result += "\nNo contributions yet";
        } else {
            result += "\n--- Contributions ---\n";
            for (Contribution c : contributions) {
                result += c.getDetails() + "\n";
            }
        }
        return result;
    }
}
