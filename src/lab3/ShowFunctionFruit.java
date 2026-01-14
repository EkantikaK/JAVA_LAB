package lab3;
class Apple {
    void show() {
        System.out.println("Show method of Class Apple");
    }
}
class Banana extends Apple {
    @Override
    void show() {
        System.out.println("Show method of Class Banana");
    }
}
class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("Show method of Class Cherry");
    }
}
public class ShowFunctionFruit {
    public static void main(String[] args) {
        Apple ref;

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}