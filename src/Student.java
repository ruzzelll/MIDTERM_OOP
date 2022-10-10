public class Student extends Person {
    private int modules, rep_modules;
    private double amount_paid;

    public Student(int ID, String Fname, String Lname, String Gender, int PhoneNum, String Address, int modules, int rep_modules, double amount_paid) {
        super(ID, Fname,Lname, Gender, PhoneNum, Address);
        this.modules = modules;
        this.rep_modules = rep_modules;
        this.amount_paid = amount_paid;
    }

    public int getModules() {
        return modules;
    }

    public void setModules(int modules) {
        this.modules = modules;
    }

    public int getRep_modules() {
        return rep_modules;
    }

    public void setRep_modules(int rep_modules) {
        this.rep_modules = rep_modules;
    }

    public double getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(double amount_paid) {
        this.amount_paid = amount_paid;
    }
}






