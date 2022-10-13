import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private int numOfModules, numOfRepeatModules;
    private double amount_paid, total_amount, balance, dep_amount;
    final int ModulePrice = 525;
    final int RepeatedModulePrice = 110;

    public static List<Student> studentList = new ArrayList<>();

    //  Constructor Student
    public Student(int ID, String Fname, String Lname, String Gender, String PhoneNum, String Address, int numOfModules, int numOfRepeatModules, double amount_paid, double total_amount, double balance) {
        super(ID, Fname, Lname, Gender, PhoneNum, Address);
        this.numOfModules = numOfModules;
        this.numOfRepeatModules = numOfRepeatModules;
        this.amount_paid = amount_paid;
        this.total_amount = total_amount;
        this.balance = balance;
    }

    public int getNumOfModules() {
        return numOfModules;
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

    public double getTotal(){
        return total_amount;
    }
    public void setTotal(){
        this.total_amount = total_amount;
    }
    public double getBalance(){
        return balance;
    }
    public double setBalance(){
        this.balance = balance;
        return 0;
    }

    public double getDep_amount() {
        return dep_amount;
    }
    public void setDep_amount(double dep_amount) {
        this.dep_amount = dep_amount;
    }


    static void add_student() {
        System.out.println("====================================================");
        System.out.println("\t\t\t\t<< ADD NEW STUDENT >>");
        System.out.println("====================================================\n");


        Scanner in = new Scanner(System.in).useDelimiter("\n");
        final int ModulePrice = 525;
        final int RepeatedModulePrice = 110;

        System.out.print("Enter ID: ");
        int addID = in.nextInt();

        // Validation for Student ID
        for (int i = 0; i < studentList.size(); i++) {
            if (addID == studentList.get(i).getID()) {
                System.out.println("ID is already registered!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return;
            }
        }

        System.out.print("Enter First Name: ");
        String addFirstname = in.next();

        System.out.print("Enter Last Name: ");
        String addLastname = in.next();

        System.out.print("Enter Gender: ");
        String addGender = in.next();

        System.out.print("Enter Phone Number: ");
        String addPhone = in.next();

        System.out.print("Enter Address: ");
        String addAddress = in.next();

        System.out.print("Enter Number of Modules: ");
        int addModules = in.nextInt();

        System.out.print("Enter Number of Repeated Modules: ");
        int addRepModules = in.nextInt();

        // Constraint the user to only input less than or equal than 6 modules
        if ((addModules + addRepModules) > 6) {
            System.out.println("You cannot get more than 6 modules for this semester!");
            return;
        } else if (addRepModules > 2) {
            System.out.println("You cannot take a new module if you want to take more than 2 repeated modules this semester!");
            return;
        }

        double total_amount = (ModulePrice * addModules) + (RepeatedModulePrice * addRepModules);
        System.out.println("Total: " + total_amount);

        System.out.print("Enter Amount Paid: ");
        double addAmount = in.nextInt();
        double balance = total_amount - addAmount;

        System.out.print("\n\t\t\t\t   Account Status ");
        // Inform user that 1 student has been added
        System.out.println("\nSuccessfully Added Student #" + addID + " to the Database!");

        // store all inputs of user inside the constructor
        Student studentobj = new Student(addID, addFirstname, addLastname, addGender, addPhone, addAddress, addModules, addRepModules, addAmount, total_amount, balance);

        // store inside the array list
        studentList.add(studentobj);

    }
    static void update_student() {
        System.out.println("====================================================");
        System.out.println("\t\t\t\t<< UPDATE STUDENT >>");
        System.out.println("====================================================\n");

        if (studentList.size() == 0) {
            System.out.println("There are no Students registered in the database!");
            System.out.println("Returning to the Main Menu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        else {
            Scanner in = new Scanner(System.in).useDelimiter("\n");

            if (studentList.size() == 0) {
                System.out.println("There are no Students registered in the database!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return;
            }
            else {
                System.out.print("Enter ID: ");
                int upID = in.nextInt();

                for (int i = 0; i < studentList.size(); i++) {
                    if (upID == studentList.get(i).getID()) {
                        System.out.println("Student#" + upID);
                        System.out.println("\nName: " + studentList.get(i).getFName() + " " + studentList.get(i).getLName());
                        System.out.println("Gender: " + studentList.get(i).getGender());
                        System.out.println("Phone Number: " + studentList.get(i).getPhoneNum());
                        System.out.println("Address: " + studentList.get(i).getAddress());
                        System.out.println("Number of Modules: " + studentList.get(i).getNumOfModules());
                        System.out.println("Number of Repeated Modules: " + studentList.get(i).getRep_modules());

                        System.out.println("====================================================");
                        System.out.println("\t\t\t\t\t<< UPDATE >>");
                        System.out.println("====================================================\n");

                        System.out.println("[1] Student Number");
                        System.out.println("[2] Name");
                        System.out.println("[3] Gender");
                        System.out.println("[4] Phone Number");
                        System.out.println("[5] Address ");
                        System.out.println("[6] Number of Modules");
                        System.out.println("[7] Number of Repeated Modules");
                        System.out.println("[8] Cancel");


                        switch (Main.choice()) {
                            case 1:
                                System.out.println("====================================================");
                                System.out.println("\t\t\t<< UPDATE STUDENT NUMBER >>");
                                System.out.println("====================================================\n");

                                System.out.print("Enter new Student Number (ex.202110139): ");
                                int updateID = in.nextInt();

                                for (int k = 0; k < studentList.size(); k++) {
                                    if (updateID == studentList.get(k).getID()) {
                                        System.out.println(updateID + " is already registered! please try again");
                                    }
                                }

                                // no statements for updated sn yet

                                break;

                            case 2:
                                System.out.println("====================================================");
                                System.out.println("\t\t\t  << UPDATE STUDENT NAME >>");
                                System.out.println("====================================================\n");

                                System.out.println("Enter Student Name ");

                                System.out.print("Enter First name: ");
                                String updateFName = in.next();
                                System.out.println("Enter Last name");
                                String updateLName = in.next();

                                studentList.get(i).setFName(updateFName);
                                studentList.get(i).setLName(updateLName);
                                System.out.println("\nStudent name has been updated!");
                                break;
                            case 3:
                                System.out.println("====================================================");
                                System.out.println("\t\t\t << UPDATE STUDENT GENDER >>");
                                System.out.println("====================================================\n");

                                System.out.print("");
                                break;
                            case 4:
                                System.out.println("====================================================");
                                System.out.println("\t\t\t  << UPDATE PHONE NUMBER >>");
                                System.out.println("====================================================\n");

                                System.out.print("Enter your new Phone Number: ");
                                String newPhone = in.next();

                                // setter (setPhoneNum) used to update the current phone number
                                studentList.get(i).setPhoneNum(newPhone);
                                System.out.println("\nPhone Number has been updated!");
                                break;
                            case 5:
                                System.out.println("====================================================");
                                System.out.println("\t\t\t\t<< UPDATE ADDRESS >>");
                                System.out.println("====================================================\n");

                                System.out.print("Enter your new Address: ");
                                String newAddress = in.next();

                                studentList.get(i).setAddress(newAddress);
                                System.out.println("\nAddress has been updated!");
                                break;
                            case 6:
                                System.out.println("====================================================");
                                System.out.println("\t\t\t\t<< UPDATE MODULES >>");
                                System.out.println("====================================================\n");

                                System.out.print("Update Number Modules: ");
                                int newModules = in.nextInt();

                                // check if user still takes 6 module
                                if (newModules + studentList.get(i).getNumOfModules() > 6) {
                                    System.out.println("Cannot take more than 6 total modules");
                                } else {
                                    studentList.get(i).setNumOfModules(newModules);
                                    System.out.println("\nModules Have been updated!");
                                }
                                break;

                            case 7:
                                System.out.println("====================================================");
                                System.out.println("\t\t\t<< UPDATE REPEATED MODULES >>");
                                System.out.println("====================================================\n");

                                System.out.println("Update Repeated Modules: ");
                                int newRepeatedModules = in.nextInt();

                                studentList.get(i).setRep_modules(newRepeatedModules);
                                System.out.println("\n Repeated Modules have been Updated");
                            case 8:
                                System.out.println("\nReturning to the Main Menu...");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                Main.menu_ST();
                                Main.menu(Main.choice());
                                break;
                            default:
                                System.out.println("Invalid Input!");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                Main.menu_student();
                        }
                    }
                }
            }
        }
    }
    static void delete_student() {
        System.out.println("====================================================");
        System.out.println("\t\t\t\t<< DELETE STUDENT >>");
        System.out.println("====================================================\n");

        if (studentList.size() == 0) {
            System.out.println("There are no Students registered in the database!");
            return;
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Student ID (ex. 202110139): ");
            int delID = in.nextInt();


            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getID() == delID) {
                    System.out.println(studentList.get(i).getID() + " Has been removed from the database!!");
                    studentList.remove(i);

                    if (studentList.lastIndexOf(i) == delID) {
                        System.out.println(studentList.get(i).getID() + " Has been removed from the database!!");
                        studentList.remove(i);
                    }
                    //else if (studentList.)
                }
            }
                /*
                // if last index is equal to user's ID
                else if (studentList.lastIndexOf(i) == delID) {
                    System.out.println(studentList.get(i).getID() + " Has been removed from the database!!");
                    studentList.remove(i);
                }

                 */
        }

                /*
                for(int j = 0; i < studentList.size(); j++){
                     if (studentList.get(i).getID() != delID){
                        System.out.println("Student #" + delID + " Has not been found from the database!!");
                        break;
                    }
                }

                 */


    }
    static void show_balance() {
        System.out.println("====================================================");
        System.out.println("\t\t\t<< SHOW REMAINING BALANCE >>");
        System.out.println("====================================================\n");

        if (studentList.size() == 0) {
            System.out.println("There are no Students registered in the database!");
            System.out.println("Returning to the Main Menu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Student ID (ex. 202110139): ");
            int bal_ID = in.nextInt();

            for (int i = 0; i < studentList.size(); i++) {
                if (bal_ID == studentList.get(i).getID()) {
                    System.out.println("Student#" + bal_ID);
                    System.out.println("\nRemaining Balance: " + studentList.get(i).getBalance());
                }
            }
        }


    }
    static void deposit(){
        System.out.println("====================================================");
        System.out.println("\t\t\t\t  << FEE DEPOSIT >>");
        System.out.println("====================================================\n");

        if(studentList.size() == 0){
            System.out.println("There are no Students registered in the database!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Student ID (ex. 202110139): ");
            int deposit_ID = in.nextInt();

            System.out.print("Enter amount: ");
            int dep_amount = in.nextInt();

            for (int i = 0; i < studentList.size(); i++) {
                if (deposit_ID == studentList.get(i).getID()) {
                    double y = studentList.get(i).getBalance();
                    //y - dep_amount = studentList.get(i).setBalance();
                }
            }

            System.out.println("Payment Successfully Posted!");
            System.out.println("Returning to the Student Menu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Main.menu_student();

        }
    }
    static void showZero(){
        System.out.println("====================================================");
        System.out.println("\t\t  << STUDENTS WITH ZERO BALANCE >>");
        System.out.println("====================================================\n");

        if (studentList.size() == 0) {
            System.out.println("There are no Students registered in the database!");
            System.out.println("Returning to the Main Menu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        else {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getID() != 0) {
                    System.out.println("\nStudent# " + studentList.get(i).getID() + " : " + studentList.get(i).getFName() + studentList.get(i).getLName());
                }
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Back to Main Menu? [Y/N]");
        int x = in.nextInt();

        if (x == 'Y'){
            System.out.println("\nReturning to the Main Menu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Main.menu_ST();
            Main.menu(Main.choice());
        }
        else if (x == 'N'){
            System.out.println("\nThank you for using our program! Bouncing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.exit(0);
        }
        // needs testing
        else {
            System.out.println("\nInvalid Input!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        }
    }
    static void showNonZero(){
        System.out.println("====================================================");
        System.out.println("\t\t\t << STUDENTS WITH BALANCE >>");
        System.out.println("====================================================\n");

        if (studentList.size() != 0) {
            System.out.println("There are no Students registered in the database!");
            System.out.println("Returning to the Main Menu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        else {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getID() != 0) {
                    System.out.println("\nStudent# " + studentList.get(i).getID() + " : " + studentList.get(i).getFName() + " " + studentList.get(i).getLName());
                }
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Back to Main Menu? [Y/N]");
        int x = in.nextInt();

        if (x == 'Y'){
            System.out.println("\nReturning to the Main Menu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Main.menu_ST();
            Main.menu(Main.choice());
        }
        else if (x == 'N'){
            System.out.println("\nThank you for using our program! Bouncing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.exit(0);
        }
        // needs testing
        else {
            System.out.println("\nInvalid Input!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        }
    }


}
