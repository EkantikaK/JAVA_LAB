package lab9;
class Printer {
    synchronized void printNumbers(String threadName) {
        System.out.println("--- " + threadName + " has acquired the printer ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is printing document #" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("--- " + threadName + " has released the printer ---\n");
    }
}

class PrintThread extends Thread {
    Printer sharedPrinter;
    String threadName;

    public PrintThread(String name, Printer printer) {
        this.threadName = name;
        this.sharedPrinter = printer;
    }

    @Override
    public void run() {
        sharedPrinter.printNumbers(threadName);
    }
}

public class Lab9_P2 {
    public static void main(String[] args) {
        System.out.println("Output:\n");

        Printer myPrinter = new Printer();

        PrintThread t1 = new PrintThread("Thread-1 (HR Dept)", myPrinter);
        PrintThread t2 = new PrintThread("Thread-2 (IT Dept)", myPrinter);

        t1.start();
        t2.start();
    }
}