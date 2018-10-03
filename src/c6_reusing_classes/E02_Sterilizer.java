package c6_reusing_classes;

public class E02_Sterilizer extends Detergent {
    public void scrub() {
        append(" Sterilizer.scrub()");
    }

    public void sterilize() {
        append(" isterilize()");
    }

    public static void main(String[] args) {
        E02_Sterilizer x =  new E02_Sterilizer();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("Testing base class:");
        Detergent.main(args);
    }
}
