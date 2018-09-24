package c3_controlling_execution;

public class E09_Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b += temp;
            System.out.print(a + ", ");
        }

    }
}
