package c4_initialization_and_cleanup;


public class E20_EnumEx21 {

    public enum Bills {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        for (Bills bill : Bills.values()) {
            System.out.println(bill + " ordinal " + bill.ordinal());
        }
    }

}
