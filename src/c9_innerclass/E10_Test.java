package c9_innerclass;

public class E10_Test {

    Ex9Interface getSay(boolean b) {
        if (b) {
            class Inner implements Ex9Interface {
                @Override
                public void say(String s) {
                    System.out.println(s);
                }
            }
            return new Inner();
        }
        return null;
    }

    public static void main(String[] args) {
        E10_Test t = new E10_Test();
        t.getSay(true).say("Hello!");
    }
}
