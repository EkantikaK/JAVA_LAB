package lab3;
import java.util.Scanner;
class Account {
    int acc_no;
    double balance;
    Scanner sc = new Scanner(System.in);
    void input() {
        System.out.print("Enter Account No: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }
    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}
class Person extends Account {
    String name;
    String aadhar_no;
    @Override
    void input() {
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Aadhar No: ");
        aadhar_no = sc.next();
        super.input();
    }
    @Override
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
        super.disp(); // Call parent disp for account details
    }
}
public class Credentials {
    public static void main(String[] args) {
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            p[i] = new Person();
            p[i].input();
        }
        System.out.println("\n--- Details of 3 Persons ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            p[i].disp();
        }
    }
}