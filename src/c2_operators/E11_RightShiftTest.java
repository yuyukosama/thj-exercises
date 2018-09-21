package c2_operators;

public class E11_RightShiftTest {
    public static void main(String[] args) {
        int a = 0x80000000;
        System.out.println(Integer.toBinaryString(a));
        for(int i = 0; i < 31; i++) {
            a >>= 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
