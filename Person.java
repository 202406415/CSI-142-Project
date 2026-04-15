public class Person{
    private String name;
    private String id;
    private int cellPhoneNo;

    public Person(String name, String id,int cellPhoneNo){
        this.name = name;
        this.id = id;
        this.cellPhoneNo = (cellPhoneNo);
    }
    public Person(String name,String id ) {
        this.name = name;
        this.id = id;
        this.cellPhoneNo = 0;

        public void setName(String name) {
            this.name;
    }
    public void setid (String id) {
        this.id = id;
    }

    public void setCellPhoneNo(int cellPhoneNo ) {
        if (String.valueOf(cellPhoneNo).length() !=8 ) {
            throw new IllegalArgumentException("Invalid cellphone number: must be exactly 8 digits(e.g., 72729838");
        }
        if(cellPhoneNo < 0 ) {
            throw new IllegalArgumentException("Invalid cellphone number: must be a positive number");
        }
        this.cellPhoneNo = cellPhoneNo;        
    }
    public String getDetails(){
        return "name: "+ name +" id: " + id +" Mogala: "+ cellPhoneNo;
    }
    @Override
    public String toString() {
        return 'Person{name='" +name + ",id='" + id '",cellPhoneNo=" + cellPhoneNo +"}";
}
