import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.*;

public class Main {

    public static void main(String[] args){
        // for testing onli xdxdxdxd
/*
        Student student = new Student(1,"Jethro Emmanuel","Roxas","m", "09065235411","Manila",2,1,1000, 1160);
        Student.studentList.add(student);
        Student student2 = new Student(2,"Jethro2","Roxas","m","1293827121","jan",1,2, 300, 745);
        Student.studentList.add(student2);
        Student student3 = new Student(3,"Jethro3","Roxas","m","1212121210","jan",3,1,3343, 1685);
        Student.studentList.add(student3);
        Student student4 = new Student(4,"Jethro4","Roxas","m","10323232","jan",2,1,32343, 1160);
        Student.studentList.add(student4);

 */

        menu_ST(); // display Student or Teacher menu
        menu(choice());
    }

    static void menu_ST(){
        System.out.println("====================================================");
        System.out.println("\t\t\t   << ABC COLLEGE INC. >>");      // tab = 4 spaces
        System.out.println("====================================================\n");
        System.out.println("Are you a: ");
        System.out.println("[1] Student");
        System.out.println("[2] Teacher");
        System.out.println("\n[0] Exit Program");
        System.out.println("\n====================================================\n");


    }
    static void menu_student(){
        System.out.println("\n====================================================");
        System.out.println("\t\t\t\t\t<< STUDENT >>");      // tab = 4 spaces
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
        System.out.println("[6] Go back to Main Menu");
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
                case 1: // student menu
                    menu_student();
                    stud(choice());

                    break;
                case 2: // teacher menu
                    menu_teacher();
                    teach(choice());
                    break;
                case 0: // program exit
                    System.exit(0);
                default:
                    System.out.println("\nOops... wrong input!");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
        }
    }
    static void stud(int c){
        switch (c){
            case 1:
                Student.add_student();
                break;
            case 2:
                Student.update_student();
                break;
            case 3:
                Student.delete_student();
                /*
                for(int i = 0; i < studentList.size(); i++){
                    System.out.println(studentList.get(i).getFName());
                }
                 */
                break;
            case 4:
                // show balance
                Student.show_balance();
                break;
            case 5:
                // fee deposit
                Student.deposit();
                break;
            case 6:
                // display zero bal
                Student.showZero();
                break;
            case 7:
                // display non zero
                Student.showNonZero();
                break;
            case 8:
                // return to Main Menu
                menu_ST();
                menu(choice());
                break;
            default:
                System.out.println("Invalid input!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }
    static void teach(int c){
        switch (c){
            case 1:
                // add
                Teacher.add_teacher();
                break;
            case 2:
                // update
                Teacher.update_teacher();
                break;
            case 3:
                // delete
                Teacher.delete_teacher();
                break;
            case 4:
                // salary calculator
                Teacher.salary();
                break;
            case 5:
                // display all
                Teacher.display();
                break;
            case 6:
                // returns to menu_ST
                menu_ST();
                menu(choice());
                break;
            default:
                System.out.println("Invalid input!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }
}
