public class Student extends Person {
    private int numOfModules, numOfRepeatModules;
    private double amount_paid;


    public Student(int ID, String Fname, String Lname, String Gender, int PhoneNum, String Address, int numOfModules, int numOfRepeatModules, double amount_paid) {
        super(ID, Fname,Lname, Gender, PhoneNum, Address);
        this.numOfModules = numOfModules;
        this.numOfRepeatModules = numOfRepeatModules;
        this.amount_paid = amount_paid;
    }

    public int getNumOfModules() {
        return getNumOfModules();
    }

    public void setNumOfModules(int numOfModules) {
        this.numOfModules = numOfModules;
    }

    public int getRep_modules() {
        return numOfRepeatModules;
    }

    public void setRep_modules(int numOfRepeatModules) {
        this.numOfRepeatModules = numOfRepeatModules;
    }

    public double getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(double amount_paid) {
        this.amount_paid = amount_paid;
    }
}






