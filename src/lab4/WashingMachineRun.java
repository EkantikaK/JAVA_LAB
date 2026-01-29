package lab4;

interface Motor {
    int CAPACITY = 10;
    void run();
    void consume();
}
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Motor is running.");
    }
    public void consume() {
        System.out.println("Motor is consuming electricity.");
    }

    void checkCapacity() {
        System.out.println("Capacity of the motor is " + CAPACITY);
    }
}
public class WashingMachineRun {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.checkCapacity();
    }
}
