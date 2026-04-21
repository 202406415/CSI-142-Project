package motshelo.main;

import java.util.Scanner;
import motshelo.group.MotsheloGroup;
import motshelo.model.Member;
import motshelo.transactions.Contribution;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MotsheloGroup group = new MotsheloGroup("CS Project Stokvel");

        int choice;

        do {
            System.out.println("\n==== MOTSHELO MENU ====");
            System.out.println("1. Add Member");
            System.out.println("2. Add Contribution");
            System.out.println("3. Display Members");
            System.out.println("4. Show Summary");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            choice = in.nextInt();
            in.nextLine();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter name: ");
                        String name = in.nextLine();

                        System.out.print("Enter ID: ");
                        String id = in.nextLine();

                        System.out.print("Enter phone: ");
                        int cellphoneNo = in.nextInt();

                        Member m = new Member(name, id, cellphoneNo);
                        group.addMember(m);

                        System.out.println("Member added.");
                        break;

                    case 2:
                        System.out.print("Enter Member ID: ");
                        String memberId = in.nextLine();

                        Member found = group.findMember(memberId);

                        if (found == null) {
                            System.out.println("Member not found.");
                            break;
                        }

                        System.out.print("Enter amount: ");
                        double amount = in.nextDouble();
                        in.nextLine();

                        System.out.print("Enter date: ");
                        String date = in.nextLine();

                        Contribution c = new Contribution(amount, date);
                        found.addContribution(c);

                        System.out.println("Contribution added.");
                        break;

                    case 3:
                        group.displayMembers();
                        break;

                    case 4:
                        group.showSummary();
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                in.nextLine(); // clear input
            }

        } while (choice != 5);

        in.close();
    }
}
