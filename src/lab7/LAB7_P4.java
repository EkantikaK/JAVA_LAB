package lab7;

import java.io.*;
import java.util.Scanner;

public class LAB7_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: Name of the file - ");
        String filename = sc.nextLine();

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            System.out.println("Output: No. of characters - " + charCount);
            System.out.println("No. of lines - " + lineCount);
            System.out.println("No. of words - " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}