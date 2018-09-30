package c4_initialization_and_cleanup;

class Kabayo2 {
    Kabayo2() {
        System.out.println("isa lang kabayo");
    }

    Kabayo2(String s) {
        System.out.println(s);
    }
}

public class E04_DefaultConstructorTest2 {
    public static void main(String[] args) {
        Kabayo2 k = new Kabayo2();
        Kabayo2 k2 = new Kabayo2("tumutugtog ng gitara");
    }
}
