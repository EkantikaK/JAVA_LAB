package lab2;
import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;
    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Method to calculate Area
    double calculateArea() {
        return length * breadth;
    }
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
    void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);
        rect.display();
    }
}