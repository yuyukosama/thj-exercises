package c4_initialization_and_cleanup;

class Tester {
    String s;
    {
        s = "Initializing string in Tester";
        System.out.println(s);
    }

    Tester() {
        System.out.println("Tester()");
    }
}

public class E15_InstanceClauseTest {
    public static void main(String[] args) {
        Tester t = new Tester();
    }

}
