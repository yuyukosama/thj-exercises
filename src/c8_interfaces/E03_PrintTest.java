package c8_interfaces;

abstract class Base {

    Base() {
        this.print();
    }

    abstract void print();
}

class Print extends Base {
    private int num = 3;

    void print() {
        System.out.println("num is :" + num);
    }
}

public class E03_PrintTest {
    public static void main(String[] args) {
        Base b = new Print();
        b.print();
    }
}
