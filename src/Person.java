public class Person {
    private int ID;
    private int PhoneNum;
    private String FName, LName, Gender, Address;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    Person(int ID, String Fname, String Lname, String Gender, int PhoneNum, String Address){
        this.ID = ID;
        PhoneNum = PhoneNum;
        this.FName = Fname;
        this.LName = Lname;
        this.Gender = Gender;
        this.Address = Address;
    }

}



