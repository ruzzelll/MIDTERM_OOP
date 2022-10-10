import java.util.List;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.*;



public class Main {
    public static List<Student> studentList = new ArrayList<>();




    public static void main(String[] args)
    {
        Student student = new Student(1,"Jethro1","Roxas","m",10,"jan",5,4,3);
        studentList.add(student);
        Student student2 = new Student(2,"Jethro2","Roxas","m",10,"jan",5,4,3);
        studentList.add(student2);
        Student student3 = new Student(3,"Jethro3","Roxas","m",10,"jan",5,4,3);
        studentList.add(student3);
        Student student4 = new Student(4,"Jethro4","Roxas","m",10,"jan",5,4,3);
        studentList.add(student4);





        menu_ST(); // display Student or Teacher menu
        menu(choice());

    }

    static void add_student(){
        System.out.println("====================================================");
        System.out.println("\t\t\t\t<< ADD NEW STUDENT >>");
        System.out.println("====================================================\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int addID = in.nextInt();

        // Validation for Student ID
        for(int i = 0; i < studentList.size(); i++){
            if(addID == studentList.get(i).getID()){
                System.out.println("bobo, ID already registered!");
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
        int addPhone = in.nextInt();

        System.out.print("Enter Address: ");
        String addAddress = in.next();

        System.out.print("Enter Number of Modules: ");
        int addModules = in.nextInt();

        System.out.print("Enter Number of Repeated Modules: ");
        int addRepModules = in.nextInt();

        System.out.print("Enter Amount Paid: ");
        double addAmount = in.nextDouble();

        // Inform user that student has been added
        System.out.println("\nSuccessfully Added Student #" + addID + " to the Database!");

        // store all inputs of user inside the constructor
        Student student = new Student(addID,addFirstname,addLastname,addGender,addPhone,addAddress,addModules,addRepModules,addAmount);

        // store inside the array list
        studentList.add(student);

    }
    static void delete_student(){
        System.out.println("====================================================");
        System.out.println("\t\t\t\t<< DELETE STUDENT >>");
        System.out.println("====================================================\n");

        if(studentList.size() == 0){
            System.out.println("There are no Students registered in the database!");
            return;
        }
        else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Student ID (ex. 202110139): ");
            int delID = in.nextInt();


            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getID() == delID) {
                    System.out.println(studentList.get(i).getID() + " Has been removed from the database!!");
                    studentList.remove(i);
                }
                // if last index is equal to user's ID
                else if (studentList.lastIndexOf(i) == delID){
                    System.out.println(studentList.get(i).getID() + " Has been removed from the database!!");
                    studentList.remove(i);
                }
            }




        }

    }


    static void menu_ST(){
        System.out.println("====================================================");
        System.out.println("\t\t\t   << ABC COLLEGE INC. >>");      // tab = 4 spaces
        System.out.println("====================================================\n");
        System.out.println("Are you a: ");
        System.out.println("[1] Student");
        System.out.println("[2] Teacher");
        System.out.println("\n====================================================\n");

        //System.out.println("[3] Exit Program");
    }
    static void menu_student(){
        System.out.println("\n====================================================");
        System.out.println("\t\t\t   << STUDENT >>");      // tab = 4 spaces
        System.out.println("====================================================\n");
        System.out.println("[1] Add new Student");
        System.out.println("[2] Update Student");
        System.out.println("[3] Delete Student");
        System.out.println("[4] Show Remaining Balance");
        System.out.println("[5] Fee Deposit");
        System.out.println("[6] Display Students with Zero Balance");
        System.out.println("[7] Display all Students with Non-Zero Balance");
        System.out.println("[8] Go back to Main Menu\n");
    }
    static void menu_teacher(){
        System.out.println("[1] Add new Teacher");
        System.out.println("[2] Update Teacher");
        System.out.println("[3] Delete Teacher");
        System.out.println("[4] Calculate salary of Teacher");
        System.out.println("[5] Show all Teachers");
    }

    static int choice(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        int choice = in.nextInt();
        //in.close();
        return choice;
    }

    static void menu(int c){
        boolean running = true;
        while (running) {
            switch (c) {
                case 1:
                    menu_student();
                    stud(choice());

                    break;
                case 2:
                    menu_teacher();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nERROR!");


            }
        }
    }


    static void stud(int c){
        switch (c){
            case 1:
                add_student();
                break;
            case 2:
                // update
                break;
            case 3:
                delete_student();


                for(int i = 0; i < studentList.size(); i++){
                    System.out.println(studentList.get(i).getFName());
                }
                break;
            case 4:
                //  show balance
                break;
            case 5:
                // fee deposit
                break;
            case 6:
                // display zero bal
                break;
            case 7:
                // display non zero
                break;
            case 8:

                break;
            default:
                System.out.println("tete");

        }
    }
    static void teach(int c){
        switch (c){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("tete");
        }
    }








}