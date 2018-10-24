package c9_innerclass;

interface In {
    class Nested {
        Nested() {System.out.println("Nested()");}
        public void hi() {System.out.println("hi");}
    }
}

public class E20_Test implements In{
    public static void main(String[] args) {
//        In.Nested in = new In.Nested();
        Nested in = new Nested();
        in.hi();
    }
}
