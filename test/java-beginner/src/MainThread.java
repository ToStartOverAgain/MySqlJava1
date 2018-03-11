import mysql.working.with.java.StudentsManagerMenu;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("===========================");
        System.out.println("Main Menu: \n");
        System.out.println("1. Student Manager");
        System.out.println("2. Exit");
        System.out.println("===========================");

        while (true) {
            System.out.println("Your action is:");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    StudentsManagerMenu studentsMenu = new StudentsManagerMenu();
                    studentsMenu.mainMenu();
                case 2:
                    System.out.println("Thanks! See you later!");
                    System.exit(1);
                default:
                    System.out.println("Please choose 1 or 2");
            }
        }

    }
}