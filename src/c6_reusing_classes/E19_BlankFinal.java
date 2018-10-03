package c6_reusing_classes;

class Poppet {
    private int i;
    Poppet(int k) {
        i = k;
    }
    public String toString() {
        return "people " + i;
    }
}

public class E19_BlankFinal {
    private final Poppet p;
    public E19_BlankFinal() {
        p = new Poppet(1);
    }
    public E19_BlankFinal(int x) {
        p = new Poppet(x);
    }
    public static void main(String[] args) {
        E19_BlankFinal b1 = new E19_BlankFinal();
        E19_BlankFinal b2 = new E19_BlankFinal(47);
        //b1.p = new Poppet(2);
        //b2.p = new Poppet(3);
        System.out.println(b1.p);
        System.out.println(b2.p);
    }
}
