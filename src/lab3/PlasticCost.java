package lab3;
import java.util.Scanner;
class Sheet {
    double length;
    double width;

    Sheet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateSheetCost() {
        return (length * width) * 40;
    }
}

class Box extends Sheet {
    double height;

    Box(double length, double width, double height) {
        super(length, width); // Pass 2D dims to parent
        this.height = height;
    }

    double calculateBoxCost() {
        return (length * width * height) * 60;
    }
}
public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Plastic Type:\n1. 2D Sheet\n2. 3D Box");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Length and Width (in ft): ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            Sheet s = new Sheet(l, w);
            System.out.println("Cost of Sheet: Rs " + s.calculateSheetCost());
        } else if (choice == 2) {
            System.out.print("Enter Length, Width and Height (in ft): ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            Box b = new Box(l, w, h);
            System.out.println("Cost of Box: Rs " + b.calculateBoxCost());
        } else {
            System.out.println("Invalid choice");
        }
    }
}