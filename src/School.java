public class School {
    private String schoolName;
    private String address;
    private int quantity;
    public School (String schoolName, String address, int quantity){
        this.schoolName = schoolName;
        this.address = address;
        this.quantity = quantity;
    }
    public School(){}

    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String bar){
        this.schoolName = bar;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String ba){
        this.address = ba;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int bars){
        this.quantity = bars;
    }

}
