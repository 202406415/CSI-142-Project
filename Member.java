public class Member {
    private String name;
    private String id;
    private String contact;
    private double contribution;

    public Member(String name, String id, String contact, double contribution) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.contribution = contribution;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getContact() {
        return contact;
    }

    public double getContribution() {
        return contribution;
    }
}