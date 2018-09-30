package c4_initialization_and_cleanup;

class Go {
    static String s1 = "run";
    static String s2, s3;
    static {
        s2 = "driving car";
        s3 = "fly plane";
        System.out.println("s2 & s3 initialized");
    }

    static void how() {
        System.out.println(s1 + " or " + s2 + " or " + s3);
    }

    Go() {
        System.out.println("Go()");
    }
}

public class E14_ExplicitStaticEx {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Go.how();
        System.out.println("Go.s1: " + Go.s1);
    }
    static Go g1 = new Go();
    static Go g2 = new Go();
}
