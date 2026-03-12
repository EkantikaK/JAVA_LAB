package lab6;

import java.util.Scanner;

class InvalidHourException extends Exception {
    public InvalidHourException(String msg) { super(msg); }
}
class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String msg) { super(msg); }
}
class InvalidSecondException extends Exception {
    public InvalidSecondException(String msg) { super(msg); }
}

class Time {
    int hours, minutes, seconds;

    public void takeTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();

        boolean error = false;

        if (hours > 24 || hours < 0) {
            System.out.println("Exception occurred: InvalidHourException: hour is not greater than 24");
            error = true;
        }
        if (minutes > 60 || minutes < 0) {
            System.out.println("Exception occurred: InvalidMinuteException: minute is not greater than 60");
            error = true;
        }
        if (seconds > 60 || seconds < 0) {
            System.out.println("Exception occurred: InvalidSecondException: second is not greater than 60");
            error = true;
        }

        if (error) {
            System.out.println("Caught the exception");
        } else {
            System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
        }
        sc.close();
    }
}

public class LAB6_P4 {
    public static void main(String[] args) {
        Time t = new Time();
        t.takeTime();
    }
}