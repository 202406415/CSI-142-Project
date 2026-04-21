package motshelo.group;
import java.util.ArrayList;
import motshelo.model.Member;
 
public class Users {
    private String MotsheloName;
    private ArrayList<Member> members;

    public Users (String MotsheloName){
        this.MotsheloName = MotsheloName;
        this.members = new ArrayList();
    }
    public void addMembers(Member member){
        members.add(member);
    }
    public void displayMembers(){
        for (Member member : members) {
            System.out.println(member.getDetails());
        }
    }
    public void searchMember(String name){
        for(Member member : members){
            if(member.getName().equalsIgnoreCase(name)){
                System.out.println(member.getDetails());
            }
            else{
                System.out.println("Gaayo:)");
            }

        }
    }
}
