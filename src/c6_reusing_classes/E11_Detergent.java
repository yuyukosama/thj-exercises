package c6_reusing_classes;

class CleanserEx11 {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

public class E11_Detergent {
    private CleanserEx11 c = new CleanserEx11();

    public void append(String a) {
        c.append(a);
    }

    public void dilute() {
        c.dilute();
    }

    public void apply() {
        c.apply();
    }

    public void scrub() {
        c.scrub();
    }

    public void foam() {
        c.append(" foam()");
    }

    public String toString() {
        return c.toString();
    }

    public static void main(String[] args) {
        E11_Detergent x = new E11_Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base case: ");
        CleanserEx11.main(args);
    }
}
