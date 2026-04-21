 package motshelo.main;
import java.util.Scanner;
import motshelo.group.Users;
import motshelo.model.Member;
import motshelo.transactions.Contribution;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Users u = new Users("CS Project stokvel");
    

        do {
            System.out.println("\n==== MOTSHELO MENU =====");
            System.out.println("1. Add Member");
            System.out.println("2. Exit");
            System.out.println("3.Display");
            System.out.println("4.Search member");
            System.out.println("Choose Option: ");
             
            choice = in.nextInt();
            in.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter name: ");
                    String name = in.nextLine();
                System.out.println("Enter ID: ");
                    String id = in.nextLine();
                System.out.println("Enter Cellphone Number: ");
                    int cellphonoNo = in.nextInt();
                System.out.println("Enter Contribution amount: ");
                    double amount = in.nextDouble();
                System.out.println("Enter date: ");
                    int date = in.nextInt();            

        Contribution c = new Contribution(amount, date, id);
        Member m = new Member(name, id, cellphonoNo, c);
            u.addMembers(m);
            break;

        case 2:
            System.out.println("Exiting system........");
            break; 
            
        case 3:
            u.displayMembers();
            break;
        case 4:
           System.out.println("Enter name you want to search");
           String nameSearch = in.nextLine();
           u.searchMember(nameSearch);

           default:
            System.out.println("Invalid Option.");  
        }
      } while (choice != 2);
      
    }
}

