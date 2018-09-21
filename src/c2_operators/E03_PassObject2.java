package c2_operators;

class Box {
    float num;
}

public class E03_PassObject2 {
    static void f(Box b) {
        b.num = 2.71828f;
    }

    public static void main(String[] args) {
        Box a = new Box();
        a.num = 3.123f;
        System.out.println("1: a.num = " + a.num);
        f(a);
        System.out.println("2: a.num = " + a.num);
    }
}
