package lab9;

import java.util.Scanner;

class CounterThread extends Thread {
    private int lower;
    private int upper;

    public CounterThread(String name, int lower, int upper) {
        super(name);
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + this.getName());
        System.out.print("Counter - ");

        for (int i = lower; i <= upper; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }
}

public class Lab9_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : Name of the thread - ");
        String threadName = sc.nextLine();

        System.out.print("Lower range of counter - ");
        int lowerRange = sc.nextInt();

        System.out.print("Upper range of counter - ");
        int upperRange = sc.nextInt();

        CounterThread ct = new CounterThread(threadName, lowerRange, upperRange);

        System.out.println("Output :");
        ct.start();

        sc.close();
    }
}