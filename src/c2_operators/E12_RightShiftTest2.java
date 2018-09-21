package c2_operators;

public class E12_RightShiftTest2 {
    public static void main(String[] args) {
        int a = 0x80000000;
        System.out.println(Integer.toBinaryString(a));
        for(int i = 0; i < 31; i++) {
            a >>>= 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
