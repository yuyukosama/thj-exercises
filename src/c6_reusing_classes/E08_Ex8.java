package c6_reusing_classes;

class A8 {
    A8(char c, int i) {
        System.out.println("A(char, int)");
    }
}

public class E08_Ex8 extends A8{
    private char c;
    private int i;

    E08_Ex8() {
        super('z', 3);
        System.out.println("E08_Ex8");
    }

    E08_Ex8(char a, int j) {
        super(a, j);
        c = a;
        i = j;
        System.out.println("E08_Ex8");
    }

    public static void main(String[] args) {
        E08_Ex8 ex1 = new E08_Ex8();
        E08_Ex8 ex2 = new E08_Ex8('b', 2);
    }

}
