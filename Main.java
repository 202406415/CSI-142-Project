public class Main {
    public static void main(String[] args) { 
        Person p1 = new person("Alice" , 101 , "75059230");
        System.out.printin(p1.getDetails());
        try{ Person p2 = new Person("Charlie" , 102 ,"74523");
           }catch (IllegalArgumentException e) {
            System.out.printin("Error: + e.getMessage());
            
        Contribution c = new Contribution(2300, 20240601);
        Member m = new Member("Boko", "P2500??", 999, c);
        System.out.println(m.getDetails());
        m.addcontribution(750.0,20260417);
        Syesrem.out.printin("updated: " + m.getDetails());
    }
}
