public class Member extends Person {
    private Contribution contribution;  //composition

    public Member(String name, String id, int cellphonoNo, Contribution contribution) {
        super(name, id, cellphonoNo);
        this.contribution = contribution;
    } 

    public Contribution getContribution() {
        return Contribution;
    }
    public void setContribution(Contribution contribution ) {
        if(contribution.getAmount() == 0) {
            throw new IllegalArgumentException("Contribution amount cannot be equals 0.");
        }
        this.contribution = contribution;
        
    @Override
    public String getDetails(){
        return super.getDetails() + " Contribution:" + contribution.getDetails();
    }

}
