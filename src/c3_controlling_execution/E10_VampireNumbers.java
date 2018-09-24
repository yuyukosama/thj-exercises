package c3_controlling_execution;

public class E10_VampireNumbers {
    public static void main(String[] args) {
        for (int i = 1001; i <= 9999; i++) {
            /*
            * ab cd; ab dc; ba cd; ba dc;
            * ac bd; ac db; ca bd; ca db;
            * ad bc; ad cb; da bc; da cb;
            * */
            int a = i / (1000) % 10, b = (i / 100) % 10, c = (i / 10) % 10, d = i % 10;
            test(i, comb(a, b), comb(c, d));
            test(i, comb(a, b), comb(d, c));
            test(i, comb(b, a), comb(c, d));
            test(i, comb(b, a), comb(d, c));

            test(i, comb(a, c), comb(b, d));
            test(i, comb(a, c), comb(d, b));
            test(i, comb(c, a), comb(b, d));
            test(i, comb(c, a), comb(d, b));

            test(i, comb(a, d), comb(b, c));
            test(i, comb(a, d), comb(c, b));
            test(i, comb(d, a), comb(b, c));
            test(i, comb(d, a), comb(c, b));
        }
    }

    static int comb(int a, int b) {
        return 10*a + b;
    }

    static void test(int i, int m, int n) {
        if (m * n == i) {
            System.out.println(i + " = " + m + " * " + n);
        }
    }
}
