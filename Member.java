public class Member extends Person {
    private Contribution contribution;  //composition

    public Member(String name, String id, int cellphonoNo, Contribution contribution) {
        super(name, id, cellphonoNo);
        this.contribution = contribution;
    } 
   
    @Override
    public String getDetails(){
        return super.getDetails() + " Contribution:" + contribution.getDetails();
    }

}