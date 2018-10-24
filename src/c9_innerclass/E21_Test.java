package c9_innerclass;

import c4_initialization_and_cleanup.E12_TankTest;

interface In1 {
    String f();
    String g();
    class Nested {
        static void testIn(In1 i) {

            System.out.println(i.f() + " " + i.g());
        }
    }
}

public class E21_Test implements In1 {
    @Override
    public String f() {
        return "hello";
    }

    @Override
    public String g() {
        return "friend";
    }

    public static void main(String[] args) {
        In1.Nested.testIn(new E21_Test());
    }
}
