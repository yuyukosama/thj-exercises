package c9_innerclass;

interface Ex11Interface {
    void say(String s);
}

class Test {

    private class Inner implements Ex11Interface {
        @Override
        public void say(String s) {
            System.out.println(s);
            Object o = new Object(){
                private String str = s;
            };
        }
    }

    Ex11Interface getInner() {
        return this.new Inner();
        // return new Inner();
    }
}

public class E11_Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.getInner().say("hello");
        //((Inner)t.getInner()).say("Hello!")

    }
}
