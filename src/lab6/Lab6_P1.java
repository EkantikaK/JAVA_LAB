package lab6;

import java.util.Scanner;

public class Lab6_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.print("Enter 5 numbers (e.g., 1 2 3 4 5): ");
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
        sc.close();
    }
}