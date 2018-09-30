package c4_initialization_and_cleanup;

public class E11_BankTest {
    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        new WebBank(true);
        //proper cleanup
        bank1.logOut();

        //Foget to logout of bank2 and unnamed new bank
        //Attempts to finalize any missed banks:
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        System.runFinalizersOnExit(true);

    }
}
