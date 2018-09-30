package c4_initialization_and_cleanup;

public class E22_Wallet {

    public enum Bills {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        for (Bills bill : Bills.values()) {
            switch (bill) {
                case ONE: System.out.println("$1"); break;
                case FIVE: System.out.println("$5"); break;
                case TEN: System.out.println("$10"); break;
                case TWENTY: System.out.println("$20"); break;
                case FIFTY: System.out.println("$50"); break;
                case HUNDRED: System.out.println("$100"); break;
            }
        }
    }
}
