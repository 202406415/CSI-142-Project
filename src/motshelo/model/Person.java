package motshelo.model;

public class Person{
    private String name;
    private String id;
    private int cellphoneNo;

    public Person(String name, String id,int cellphoneNo){
        this.name = name;
        this.id = id;
        this.cellphoneNo = cellphoneNo;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public int getCellphoneNo() { return cellphoneNo; }
    
    public String getDetails(){
        return "name: "+ name +" id: " + id +" Mogala: "+ cellphoneNo;
    }
}
