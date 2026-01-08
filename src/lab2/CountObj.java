package lab2;

class ObjectCounter {
        static int count = 0;

        public ObjectCounter() {
            count++;
        }
    }

    public class CountObj {
        public static void main(String[] args) {
            // Creating 3 objects
            ObjectCounter obj1 = new ObjectCounter();
            ObjectCounter obj2 = new ObjectCounter();
            ObjectCounter obj3 = new ObjectCounter();

            // Accessing the static variable using the Class name
            System.out.println("No of objects created = " + ObjectCounter.count);
        }
    }
