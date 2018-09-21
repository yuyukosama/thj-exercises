package c2_operators;

public class E10_BinaryTest {
    public static void main(String[] args) {
        int a = 0, b = 0;
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) a |= (1 << i);
            else b |= (1 << i);
        }

        System.out.println("Binary of int a is: " + Integer.toBinaryString(a));
        System.out.println("Binary of int b is: " + Integer.toBinaryString(b));
        System.out.println("a&b is: " + Integer.toBinaryString(a&b));
        System.out.println("a|b is: " + Integer.toBinaryString(a|b));
        System.out.println("a^b is: " + Integer.toBinaryString(a^b));
        System.out.println("~a is: " + Integer.toBinaryString(~a));
        System.out.println("~b is: " + Integer.toBinaryString(~b));
    }
}
