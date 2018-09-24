package c3_controlling_execution;

public class E06_IfElseTest {
    static int test(int testVal, int begin, int end) {
        if (end < begin) {
            System.out.println("end can't be < begin");
            return 0;
        }

        if (testVal >= begin && testVal <= end) return +1;
        if (testVal < begin || testVal > end) return -1;
        System.out.println("exceptional case");
        return 13;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 4));
        System.out.println(test(5, 4, 10));
        System.out.println((test(5, 5, 6)));
        System.out.println(test(10, 5, 7));
        System.out.println(test(5, 5, 5));
    }
}
