package c6_reusing_classes;

class Component10 {
    Component10(byte b) { System.out.println("Component1(byte)"); }
}

class Component20 {
    Component20(short s) { System.out.println("Component2(short)"); }
}

class Component30 {
    Component30(int i) { System.out.println("Component3(int)"); }
}

class Root10 {
    Component10 c1root;
    Component20 c2root;
    Component30 c3root;
    Root10(float f) {
        c1root = new Component10((byte)0);
        c2root = new Component20((short)0);
        c3root = new Component30(0);
        System.out.println("Root(foat)");
    }
}

public class E10_Stem10 extends Root10 {
    Component10 c1stem10;
    Component20 c2stem10;
    Component30 c3stem10;
    E10_Stem10(double d) {
        super(2.78f);
        c1stem10 = new Component10((byte)1);
        c2stem10 = new Component20((short)1);
        c3stem10 = new Component30(1);
        System.out.println("Stem10(double)");
    }
    public static void main(String[] args) {
        E10_Stem10 x = new E10_Stem10(2.78);
    }
}
