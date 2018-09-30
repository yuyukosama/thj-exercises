package c4_initialization_and_cleanup;

public class E19_VarargEx19 {
    static void showStrings(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        showStrings("one", "two", "three");
        showStrings(new String[] {"four", "five", "six"});
    }

}
