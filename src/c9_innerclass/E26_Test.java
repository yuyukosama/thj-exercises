package c9_innerclass;

class OuterClass {
    class InnerClass {
        public InnerClass(String s) {
            System.out.println(s);
        }
    }
}

public class E26_Test {
    class TestInner extends OuterClass.InnerClass {
        public TestInner(OuterClass o) {
            o.super("Hello");
        }
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        E26_Test t = new E26_Test();
        TestInner ti = t.new TestInner(o);
    }
}
