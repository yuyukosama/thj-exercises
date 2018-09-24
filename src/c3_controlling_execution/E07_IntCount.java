package c3_controlling_execution;

public class E07_IntCount {
    static void count1(int n) {
        for (int i = 1; i <= n; i++)
            System.out.println(i);
    }

    static void count2(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            if (i == 99) break;
        }
    }

    static void count3(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            if (i == 99) return;
        }
    }

    public static void main(String[] args) {
        count1(100);
        count2(100);
        count3(100);

    }
}
