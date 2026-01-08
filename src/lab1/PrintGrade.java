package lab1;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            char grade;

            if (marks >= 90) {
                grade = 'O';
            } else if (marks >= 80) {
                grade = 'E';
            } else if (marks >= 70) {
                grade = 'A';
            } else if (marks >= 60) {
                grade = 'B';
            } else {
                grade = 'C';
            }

            System.out.println("Grade: " + grade);
        }
    }

