package lab4;
/// exercise qn
import java.util.Scanner;

public class StringsSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("First Pair");
        System.out.print("Enter first main string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter substring to find in first string: ");
        String sub1 = sc.nextLine();

        System.out.println("\n Second Pair");
        System.out.print("Enter second main string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter substring to find in second string: ");
        String sub2 = sc.nextLine();
    }
}
