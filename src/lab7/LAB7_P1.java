package lab7;

import java.io.*;
import java.util.Scanner;

public class LAB7_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details - Rollno, name, subject, marks:");
        String roll = sc.nextLine();
        String name = sc.nextLine();
        String subject = sc.nextLine();
        String marks = sc.nextLine();

        System.out.print("Enter the name of existing file to which student details will be written: ");
        String filename = sc.nextLine();

        // Write to file
        try (FileWriter fw = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            pw.println(roll + ", " + name + ", " + subject + ", " + marks);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read from file
        System.out.println("\nOutput: Display the content of existing file");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}