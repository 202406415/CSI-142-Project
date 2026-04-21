package motshelo.group;

import java.util.ArrayList;
import motshelo.model.Member;

public class MotsheloGroup {
    private String groupName;
    private ArrayList<Member> members;

    public MotsheloGroup(String groupName) {
        this.groupName = groupName;
        members = new ArrayList<>();
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public Member findMember(String id) {
        for (Member m : members) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }

        for (Member m : members) {
            System.out.println(m.getDetails());
            System.out.println("----------------------");
        }
    }

    public void showSummary() {
        double total = 0;

        for (Member m : members) {
            total += m.getTotalContribution();
        }

        System.out.println("Group: " + groupName);
        System.out.println("Total Members: " + members.size());
        System.out.println("Total Contributions: P" + total);
    }
}