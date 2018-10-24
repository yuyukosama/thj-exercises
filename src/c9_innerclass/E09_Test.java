package c9_innerclass;

interface Ex9Interface {
    void say(String s);
}

public class E09_Test {
    Ex9Interface getSay() {
        class Inner implements Ex9Interface {
            @Override
            public void say(String s) {
                System.out.println(s);
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        E09_Test t = new E09_Test();
        t.getSay().say("Hello!");
    }
}
