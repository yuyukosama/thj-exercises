package c4_initialization_and_cleanup;

public class E20_VarargEx20 {
    public static void main(String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
