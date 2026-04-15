public class Person{
    private String name;
    private String id;
    private int cellphonoNo;

    public Person(String name, String id,int cellphonoNo){
        if (String.valueOf(cellphoneNo).length() != 8) {
            throw new IllegalArgumentException("Cellphone number must be exactly 8 digits.");
        }
        this.name = name;
        this.id = id;
        this.cellphonoNo = cellphonoNo;
    }
    public Person(String name,String id ) {
        this.name = name;
        this.id = id;
        this.cellphonoNo = 0;
    }
    public String getDetails(){
        return "name: "+ name +" id: " + id +" Mogala: "+ cellphonoNo;
    }
}
