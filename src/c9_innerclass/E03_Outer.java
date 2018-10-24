package c9_innerclass;

public class E03_Outer {
    private String s;

    public E03_Outer(String s) {
        this.s = s;
    }

    private class Inner {
        public String toString() {
            return s;
        }
    }

    public Inner makeInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        E03_Outer o = new E03_Outer("Hi is risen!");
        Inner i = o.makeInner();
        System.out.println(i);
    }
}
