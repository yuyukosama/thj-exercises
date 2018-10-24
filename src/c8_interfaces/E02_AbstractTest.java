package c8_interfaces;

abstract class Test {
    Test() {System.out.println("Test()");}
}

class TestB extends Test {
    TestB() {System.out.println("TestB()");}
}

public class E02_AbstractTest {
    public static void main(String[] args) {
        //Test t = new Test();
        Test t = new TestB();
    }
}
