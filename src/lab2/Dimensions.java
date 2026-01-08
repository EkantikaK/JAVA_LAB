package lab2;

import java.util.Scanner;

class Box {
        double length;
        double width;
        double height;

        // Method to calculate and return volume
        double volume() {
            return length * width * height;
        }
    }

    public class Dimensions {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Box myBox = new Box();

            System.out.println("Enter length, width, and height of the box:");
            myBox.length = sc.nextDouble();
            myBox.width = sc.nextDouble();
            myBox.height = sc.nextDouble();

            double vol = myBox.volume();
            System.out.println("Volume of the Box is: " + vol);
        }
    }
