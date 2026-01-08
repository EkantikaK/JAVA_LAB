package lab2;
import java.util.Scanner;
class AreaRect {
    double length;
    double breadth;
    AreaRect() {
        length = 0;
        breadth = 0;
    }
    AreaRect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea() {
        return length * breadth;
    }
}
public class RectOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaRect rect1 = new AreaRect();
        System.out.println("Area of rect1 (Default Constructor): " + rect1.getArea());

        System.out.print("Enter length and breadth for rect2: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        AreaRect rect2 = new AreaRect(l, b);
        System.out.println("Area of rect2 (Parameterized Constructor): " + rect2.getArea());
    }
}
