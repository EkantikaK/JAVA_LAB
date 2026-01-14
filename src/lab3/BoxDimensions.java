package lab3;

import java.util.Scanner;

class MultiPlate {
    double length;
    double width;

    MultiPlate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("1. [Parent] MultiPlate Constructor executed.");
        System.out.println("   -> Dimensions set: " + length + " x " + width);
    }
}

class MultiBox extends MultiPlate {
    double height;

    MultiBox(double length, double width, double height) {
        // super() must be the first line to call the parent constructor
        super(length, width);
        this.height = height;
        System.out.println("2. [Child] MultiBox Constructor executed.");
        System.out.println("   -> Height added: " + height);
    }
}
class MultiWoodBox extends MultiBox {
    double thickness;
    MultiWoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("3. [Grandchild] MultiWoodBox Constructor executed.");
        System.out.println("   -> Thickness added: " + thickness);
    }
}
public class BoxDimensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for the Wood Box:");
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter Width: ");
        double w = sc.nextDouble();
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        System.out.print("Enter Thickness: ");
        double t = sc.nextDouble();

        System.out.println("\n--- Initializing Object ---");

        MultiWoodBox wb = new MultiWoodBox(l, w, h, t);
    }
}