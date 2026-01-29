package lab4;

import java.util.Scanner;

interface StaffMember {
    void getDetails();
}

interface DeptManager extends StaffMember {
    void getDeptDetails();
}

class DeptHead implements DeptManager {
    int empId;
    String empName;
    int deptId;
    String deptName;
    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id - ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name - ");
        empName = sc.nextLine();
    }
    public void getDeptDetails() {
        System.out.print("Enter department id - ");
        deptId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department name - ");
        deptName = sc.nextLine();
    }
    void display() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + String.format("%02d", deptId));
        System.out.println("Department name - " + deptName);
    }
}

public class EmpDetails {
    public static void main(String[] args) {
        DeptHead h = new DeptHead();
        h.getDetails();
        h.getDeptDetails();
        System.out.println();
        h.display();
    }
}
