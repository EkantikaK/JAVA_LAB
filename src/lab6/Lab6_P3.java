import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Lab6_P3 {
    public static void ProcessInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        try {
            if (num < 0) {
                throw new NegativeNumberException("number should be positive");
            } else {
                System.out.println("Double value: " + (num * 2));
            }
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: NegativeNumberException: " + e.getMessage());
        }
        sc.close();
    }

    public static void main(String[] args) {
        ProcessInput();
    }
}