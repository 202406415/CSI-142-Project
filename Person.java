public class Person{
    private String name;
    private String id;
    private String cellPhoneNo;

    public Person(String name, String id,int cellPhoneNo){
        this.name = name;
        this.id = id;
        this.cellPhoneNo =(cellPhoneNo);
    }
    public Person(String name,String id ) {
        this.name = name;
        this.id = id;
        this.cellPhoneNo = 'Not provided";

        public void setName(String name) {
            this.name;
    }
    public void setid (String id) {
        this.id = id;
    }

    public void setCellPhoneNo(String cellPhoneNo ){
        if ( cellPhoneNo == null) {
            throw new illegalArgumentException("Cellphone number cannot be null");
        }  {
        if (int i = 0; i < cellPhoneNo.length(); i++ ) {
            throw new IllegalArgumentException("Invalid cellphone number: must be exactly 8 digits(e.g., 72729838");
        }
        for(int i=0; i< cellPhoneNo.length(); i++) 
        if( !character.isDigit(cellPhoneNo.charAt(i{
            throw new IllegalArgumentException("Invalid cellphone number: must contain only diits 0-9"); }
        }
    if(cellPhoneNo.chart(00 == '0') {
    throw new IllegalArgumentException('Invalid cellphone number: first digit cannot be zero");
}
        this.cellPhoneNo = cellPhoneNo;        
    }
    public String getDetails(){
        return "name: "+ name +" id: " + id +" Mogala: "+ cellPhoneNo;
    }


