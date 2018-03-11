package mysql.working.with.java;

import java.util.Scanner;

public class StudentsManagerMenu {
    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        int action;
        System.out.println("===========================");
        System.out.println("Student Manager Actions Menu:\n");
        System.out.println("1. Insert new Student");
        System.out.println("2. Exit");
        System.out.println("===========================");


        while (true) {
            System.out.println("Your action is:");
            action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 1:
                    Students student = new Students();
                    student.inputStudent();
                    student.addNewStudent();
                    break;
                case 2:
                    System.out.println("Exit the app");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please choose 1 or 2");
                    break;
            }
        }
    }
}
