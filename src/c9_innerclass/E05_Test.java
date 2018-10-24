package c9_innerclass;

class Outer {
    public Outer() {
        System.out.println("Outer()");
    }

    class Inner {
        public Inner() {
            System.out.println("Outer.Inner()");
        }
    }
}

public class E05_Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
    }
}
