package c6_reusing_classes;

class A7 {
    A7(char c, int i) {
        System.out.println("A(char, int)");
    }
}

class B7 extends A7 {
    B7(String s, float f) {
        super(' ', 0);
        System.out.println("B7(String, float)");
    }
}

public class E07_C7 extends A7 {
    private char c;
    private int i;
    E07_C7(char a, int j) {
        super(a, j);
        c = a;
        i = j;
    }

    B7 b = new B7("hi", 1.f);

    public static void main(String[] args) {
        E07_C7 c = new E07_C7('b', 2);
        /*
         * A(char, int)
         * A(char, int)
         * B7(String, float)
         */
    }
}
