package lab2;

class Subtraction {
    void subtract(int a, int b) {
        System.out.println("Result (int - int): " + (a - b));
    }

    void subtract(int a, int b, int c) {
        System.out.println("Result (int - int - int): " + (a - b - c));
    }

    void subtract(double a, double b) {
        System.out.println("Result (double - double): " + (a - b));
    }
}

public class Subtract {
    public static void main(String[] args) {
        Subtraction obj = new Subtraction();

        System.out.println("Performing subtractions:");
        obj.subtract(10, 4);
        obj.subtract(20, 5, 3);
        obj.subtract(15.5, 5.5);
    }
}