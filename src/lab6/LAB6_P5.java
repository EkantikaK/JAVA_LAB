package lab6;

class CheckArgument extends Exception {
    public CheckArgument() {
        super("CheckArgument");
    }
}

public class LAB6_P5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument();
            } else {
                int sum = 0;
                for (int i = 0; i < 4; i++) {
                    int num = Integer.parseInt(args[i]);
                    sum += (num * num);
                }
                System.out.println(sum);
            }
        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers.");
        }
    }
}