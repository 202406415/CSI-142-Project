package motshelo.model;

public class Person{
    private String name;
    private String id;
    private int cellphoneNo;

    public Person(String name, String id,int cellphoneNo){
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");

        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("ID cannot be empty");

        if (cellphoneNo <= 0)
            throw new IllegalArgumentException("Invalid phone number");

        this.name = name;
        this.id = id;
        this.cellphoneNo = cellphoneNo;
    }
    public String getId() {
        return id;
    }

    public String getBasicDetails(){
        return "Name: "+ name +" Id: " + id +" Mogala: "+ cellphoneNo;
    }
}