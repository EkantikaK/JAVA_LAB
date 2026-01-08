package lab2;

import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("Enter 10 numbers:");

            // Loop 10 times to accept numbers
            for (int i = 1; i <= 10; i++) {
                System.out.print("Number " + i + ": ");
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);
        }
    }

