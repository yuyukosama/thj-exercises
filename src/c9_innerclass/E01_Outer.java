package c9_innerclass;

import java.util.Iterator;
import java.util.Vector;

public class E01_Outer {
    class Inner {
        Inner() {System.out.println("Inner()");}
    }

    Inner makeInner() { return new Inner(); }

    public static void main(String[] args) {
        E01_Outer o = new E01_Outer();
        Inner inner = o.makeInner();
    }
}
