package c6_reusing_classes;

class WithFin {
    final void f() { System.out.println("WithFinal.f()"); }
    void g() { System.out.println("WithFinal.g()"); }
    final void h() { System.out.println("WitFinal.h()"); }
}

class OverrideFinal extends WithFin {
    // attempt to override:
    // public final void f() { print("OverrideFinal.f()"); } // no can do
    @Override public void g() { System.out.println("OverrideFinal.g()"); } // OK, not final
    // final void h(); { print("OVerrideFinal.h()"); } // cannot override final
}


public class E21_FinalOverrideEx {
    public static void main(String[] args) {
        OverrideFinal of = new OverrideFinal();
        of.f();
        of.g();
        of.h();
        // Upcast:
        WithFin wf = of;
        wf.f();
        wf.g();
        wf.h();
    }
}
