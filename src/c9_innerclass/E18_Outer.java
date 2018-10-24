package c9_innerclass;

public class E18_Outer {
    E18_Outer(){System.out.println("E18_Outer()");}
    static class Inner {
        Inner(){System.out.println("Inner()");}
    }

    public static void main(String[] args) {
        new E18_Outer.Inner();
    }
}
