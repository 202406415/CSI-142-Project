package motshelo.main;

import java.util.ArrayList;
import java.util.Scanner;
import motshelo.contracts.Displayable;
import motshelo.group.MotsheloGroup;
import motshelo.model.Member;
import motshelo.transactions.Contribution;
import motshelo.transactions.Borrow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MotsheloGroup group = new MotsheloGroup("CS Project Stokvel");

        Member s1 = new Member("Nomsa Molatlhegi", "202406415", 71234567L);
        Member s2 = new Member("Oratile Lefatshe", "202405825", 72345678L);
        Member s3 = new Member("Kgosi Mogome", "202504897", 72835024L);   
        s1.addContribution(new Contribution(200, "2026-04-01"));
        s1.addContribution(new Contribution(200, "2026-04-15"));
        s2.addContribution(new Contribution(200, "2026-04-01"));
        s2.addBorrow(new Borrow(150, "2026-04-10", "2026-05-10"));
        s3.addContribution(new Contribution(200, "2026-04-01"));
        group.addMember(s1);
        group.addMember(s2);
        group.addMember(s3);
        System.out.println("(Seed data loaded: 3 members, 3 contributions, 1 borrow)\n");

        int choice = 0;
        do {
            System.out.println("\n==== MOTSHELO MENU ====");
            System.out.println("1. Add Member");
            System.out.println("2. Add Contribution");
            System.out.println("3. Record Borrow");
            System.out.println("4. Repay Borrow");
            System.out.println("5. View Member Transactions");
            System.out.println("6. Display All Members");
            System.out.println("7. Show Group Summary");
            System.out.println("8. Search Member");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");

            try {
                choice = Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between 1 and 9.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = in.nextLine();
                        System.out.print("Enter ID: ");
                        String id = in.nextLine();
                        System.out.print("Enter phone (press Enter to skip): ");
                        String phoneStr = in.nextLine().trim();
                        Member m;
                        if (phoneStr.isEmpty()) {
                            m = new Member(name, id);            
                        } else {
                            long phone = Long.parseLong(phoneStr);
                            m = new Member(name, id, phone);     
                        }
                        group.addMember(m);
                        System.out.println("Member added.");
                        break;

                    case 2:
                        System.out.print("Enter Member ID: ");
                        String cId = in.nextLine();
                        Member cMember = group.findMember(cId);
                        if (cMember == null) { System.out.println("Member not found."); break; }
                        System.out.print("Enter amount: ");
                        double cAmount = Double.parseDouble(in.nextLine().trim());
                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String cDate = in.nextLine();
                        cMember.addContribution(new Contribution(cAmount, cDate));
                        System.out.println("Contribution added.");
                        break;

                    case 3:
                        System.out.print("Enter Member ID: ");
                        String bId = in.nextLine();
                        Member bMember = group.findMember(bId);
                        if (bMember == null) { System.out.println("Member not found."); break; }
                        System.out.print("Enter borrow amount: ");
                        double bAmount = Double.parseDouble(in.nextLine().trim());
                        System.out.print("Enter borrow date (YYYY-MM-DD): ");
                        String bDate = in.nextLine();
                        System.out.print("Enter due date (press Enter to leave as TBD): ");
                        String dueDate = in.nextLine().trim();
                        Borrow borrow = dueDate.isEmpty()
                                ? new Borrow(bAmount, bDate)          
                                : new Borrow(bAmount, bDate, dueDate);
                        bMember.addBorrow(borrow);
                        System.out.println("Borrow recorded.");
                        break;

                    case 4:
                        System.out.print("Enter Member ID: ");
                        String rId = in.nextLine();
                        Member rMember = group.findMember(rId);
                        if (rMember == null) { System.out.println("Member not found."); break; }
                        ArrayList<Borrow> borrows = rMember.getBorrows();
                        if (borrows.isEmpty()) { System.out.println("No borrows on record."); break; }
                        System.out.println("Borrows for " + rMember.getName() + ":");
                        for (int i = 0; i < borrows.size(); i++) {
                            System.out.println((i + 1) + ". " + borrows.get(i).getDetails());
                        }
                        System.out.print("Enter borrow number to mark repaid: ");
                        int pick = Integer.parseInt(in.nextLine().trim()) - 1;
                        if (pick < 0 || pick >= borrows.size()) {
                            System.out.println("Invalid selection.");
                        } else {
                            borrows.get(pick).markRepaid();
                            System.out.println("Borrow marked as repaid.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter Member ID: ");
                        String tId = in.nextLine();
                        Member tMember = group.findMember(tId);
                        if (tMember == null) { System.out.println("Member not found."); break; }
                        System.out.println("Transactions for " + tMember.getName() + ":");
                        
                        group.printTransactions(tMember.getTransactions());
                        break;

                    case 6:
                        group.displayMembers();
                        break;

                    case 7:
                        group.showSummary();
                        break;

                    case 8:
                        System.out.print("Enter name to search: ");
                        String search = in.nextLine();
                        group.searchMember(search);
                        break;

                    case 9:
                        System.out.println("Exiting. Sala sentle!");
                        break;

                    default:
                        System.out.println("Invalid option. Enter a number between 1 and 9.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid number entered: " + e.getMessage());
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 9);

        in.close();
    }
}