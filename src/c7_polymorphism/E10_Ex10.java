package c7_polymorphism;

class A{
    protected void f() {
        System.out.println("A.f()");
        this.g();
    }

    protected void g() {
        System.out.println("A.g()");
    }
}

class E extends A {
    @Override
    protected void g() {
        System.out.println("E.g()");
    }
}

public class E10_Ex10 {
    public static void main(String[] ars) {
        A e = new E();
        e.f();
    }
}
