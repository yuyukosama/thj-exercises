package c6_reusing_classes;

public class E05_C extends A {
    E05_C(){System.out.println("fuck");}
    B b = new B();

    public static void main(String[] args) {
        E05_C c = new E05_C();
        /*
         * A()
         * A()
         * B()
         */
    }
}
