package lab1;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lname = scanner.nextLine();

        System.out.println("Output: " + fname + " " + lname);
    }
}