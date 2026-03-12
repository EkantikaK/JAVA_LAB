package  lab7;

import java.io.*;

public class LAB7_P3 {
    public static void main(String[] args) {
        // Change these file names to test on your system
        String file1 = "fileA.bin";
        String file2 = "fileB.bin";

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int b1, b2;
            int position = 1;
            boolean equal = true;

            while ((b1 = fis1.read()) != -1 && (b2 = fis2.read()) != -1) {
                if (b1 != b2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    equal = false;
                    break;
                }
                position++;
            }

            if (equal) {
                if (fis1.read() == -1 && fis2.read() == -1) {
                    System.out.println("Two files are equal");
                } else {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                }
            }
        } catch (IOException e) {
            System.out.println("Error accessing files: " + e.getMessage());
        }
    }
}