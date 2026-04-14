public class Main {
    public static void main(String[] args) {
        Contribution c = new Contribution(2300, 20240601);
        Member m = new Member("Boko", "P2500??", 999, c);
        System.out.println(m.getDetails());
    }
}
