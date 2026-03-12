package lab7;

import java.io.*;
import java.util.Scanner;

public class LAB7_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source file name: ");
        String source = sc.nextLine();
        System.out.print("Enter the destination file name: ");
        String dest = sc.nextLine();

        // Using Byte Stream
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File Copied (using Byte Stream)");
        } catch (IOException e) {
            System.out.println("Byte Stream Error: " + e.getMessage());
        }

        // Using Character Stream
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter("char_" + dest)) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("File Copied (using Character Stream to char_" + dest + ")");
        } catch (IOException e) {
            System.out.println("Character Stream Error: " + e.getMessage());
        }
        sc.close();
    }
}