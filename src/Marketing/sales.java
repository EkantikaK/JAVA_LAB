package Marketing;


import General.employee;
import java.util.Scanner;

public class sales extends employee {

    public double tallowance(double totalEarning) {
        return 0.05 * totalEarning;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sales emp = new sales();

        System.out.print("Enter the employee id and emploee name ");
        int id = input.nextInt();
        String name = input.next();
        emp.setDetails(id, name);

        System.out.print("Enter the basic salary ");
        double basic = input.nextDouble();

        double total = emp.earnings(basic);

        System.out.println("The emp id of the employee is " + emp.empid);
        System.out.println("The total earning is " + total);
    }
}