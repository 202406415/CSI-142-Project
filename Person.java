public class Person{
    private String name;
    private String id;
    private int cellphonoNo;

    public Person(String name, String id,int cellphonoNo){
        this.name = name;
        this.id = id;
        this.cellphonoNo = cellphonoNo;
    }
    public String getDetails(){
        return "Name: "+ name +" id: " + id +" contact: "+ cellphonoNo;
    }
}
