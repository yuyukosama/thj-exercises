package c6_reusing_classes;

class A { A(){ System.out.println("A()");} }

class B extends A { B(){ System.out.println("B()");} }

class C extends B { C(){ System.out.println("C()");} }

class D extends C {
    D() {
        System.out.println("D()");
    }

    static D makeD() {
        return new D();
    }

    public static void main(String[] args) {
        D d = new D();
        D d2 = D.makeD();
    }
}

public class E04_E extends D{
    E04_E() {
        System.out.println("E()");
    }

    public static void main(String[] args) {
        E04_E e = new E04_E();
        // test D
        D.main(args);
    }
}
