public class Teacher extends Person {
    private String department, designation;
    private double teachingHours;

    public Teacher(int ID, String Fname, String Lname, String Gender, int PhoneNum, String Address, String department, String designation, double teachingHours) {
        super(ID, Fname, Lname, Gender, PhoneNum, Address);
        this.department = department;
        this.designation = designation;
        this.teachingHours = teachingHours;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

}
