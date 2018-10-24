package c9_innerclass;


interface Ex13Interface {
    void say(String s);
}

public class E13_Outer {
    public Ex13Interface f() {
        return new Ex13Interface() {
            @Override
            public void say(String s) {
                System.out.println(s);
            }
        };
    }

    public static void main(String[] args) {
        Ex13Interface inner = new E13_Outer().f();
        inner.say("Hi");
    }
}
