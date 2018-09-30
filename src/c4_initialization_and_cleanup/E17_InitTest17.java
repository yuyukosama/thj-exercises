package c4_initialization_and_cleanup;

class InitTest {
    InitTest(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

public class E17_InitTest17 {
    public static void main(String[] args) {
        InitTest[] init = new InitTest[10];
    }
}
