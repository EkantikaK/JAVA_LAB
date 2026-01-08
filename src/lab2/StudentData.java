package lab2;
import java.util.Scanner;
class Student {
    int roll;
    String name;
    double cgpa;
    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}
public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int r = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("CGPA: ");
            double c = sc.nextDouble();
            students[i] = new Student(r, name, c);
        }
        System.out.println("\n--- Student Details ---");
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Roll: " + students[i].roll + ", Name: " + students[i].name + ", CGPA: " + students[i].cgpa);
            if (students[i].cgpa < students[minIndex].cgpa) {
                minIndex = i;
            }
        }
        System.out.println("\nStudent with lowest CGPA is: " + students[minIndex].name);
    }
}