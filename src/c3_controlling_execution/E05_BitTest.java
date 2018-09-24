package c3_controlling_execution;

public class E05_BitTest {

    static void binaryPrint(int q) {
        if (q == 0) {
            System.out.print(0);
            return;
        }

        int nlz = Integer.numberOfLeadingZeros(q);
        q <<= nlz;

        for (int i = 0; i < 32 - nlz; i++) {
            int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
            System.out.print(n);
            q <<= 1;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int a = 0, b = 0;
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) a |= (1 << i);
            else b |= (1 << i);
        }

        System.out.println("Using Integer.toBinaryString(): ");
        System.out.println("Binary of int a is: " + Integer.toBinaryString(a));
        System.out.println("Binary of int b is: " + Integer.toBinaryString(b));
        System.out.println("a&b is: " + Integer.toBinaryString(a&b));
        System.out.println("a|b is: " + Integer.toBinaryString(a|b));
        System.out.println("a^b is: " + Integer.toBinaryString(a^b));
        System.out.println("~a is: " + Integer.toBinaryString(~a));
        System.out.println("~b is: " + Integer.toBinaryString(~b));

        System.out.println("Using binaryPrint(): ");
        System.out.print("Binary of int a is: ");
        binaryPrint(a);
        System.out.print("Binary of int b is: ");
        binaryPrint(b);
        System.out.print("a&b is: ");
        binaryPrint(a&b);
        System.out.print("a|b is: ");
        binaryPrint(a|b);
        System.out.print("a^b is: ");
        binaryPrint(a^b);
        System.out.print("~a is: ");
        binaryPrint(~a);
        System.out.print("~b is: ");
        binaryPrint(~b);
    }
}
