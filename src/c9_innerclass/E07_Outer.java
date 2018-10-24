package c9_innerclass;

import c6_reusing_classes.E07_C7;

public class E07_Outer {
    private int oi = 1;
    private void hi() {
        System.out.println("hi");
    }

    public void showOi() {
        System.out.println(oi);
    }

    private class Inner {
        void modifyOuter() {
            oi *= 2;
            hi();
        }
    }

    void testInner() {
        Inner in = new Inner();
        in.modifyOuter();
    }

    public static void main(String[] args) {
        E07_Outer o = new E07_Outer();
        o.showOi();
        o.testInner();
        o.showOi();
    }

}
