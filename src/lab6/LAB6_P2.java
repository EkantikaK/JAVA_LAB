package lab6;

public class LAB6_P2 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {
            System.out.println("Inside finally block: Cleanup can happen here.");
        }
    }
}