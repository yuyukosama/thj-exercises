package c9_innerclass;

public class E08_Outer {

    public E08_Outer() {
        System.out.println("Outer()");
    }

    class Inner {

        private int ii1 = 1;
        private int ii2 = 2;

        void showIi2() {
            System.out.println(ii2);
        }

        Inner() {
            System.out.println("Inner()");
        }
    }

    int oi = new Inner().ii1;

    void showOi() {
        System.out.println(oi);
    }

    void showIi2() {
        new Inner().showIi2();
    }

    public static void main(String[] args) {
        E08_Outer out = new E08_Outer();
        out.showIi2();
        out.showOi();
    }


}
