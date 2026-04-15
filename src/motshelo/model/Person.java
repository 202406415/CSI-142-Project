package motshelo.model;

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
        return "name: "+ name +" id: " + id +" Mogala: "+ cellphonoNo;
    }
}