package c2_operators;

public class E14_StringCompare {
    public static void main(String[] args) {
        String s = "one";
        String t = "two";
        stringTest(s, t);
    }

    static void stringTest(String a, String b) {
        f(a == b);
        f(a.equals(b));
        f(b.equals(a));

    }

    static void f(boolean b) {
        if (b == true) System.out.println("true");
        else System.out.println("false");
    }
}
