package c6_reusing_classes;

import org.omg.PortableServer.RequestProcessingPolicyValue;

class Component1 {
    Component1() {
        System.out.println("Component1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3");
    }
}

class Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;
    {
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
    }

    Root() {
        System.out.println("Root()");
    }
}

public class E09_Stem extends Root {
    private Component1 c1Stem;
    private Component2 c2Stem;
    private Component3 c3Stem;
    {
        c1Stem = new Component1();
        c2Stem = new Component2();
        c3Stem = new Component3();
    }

    E09_Stem() {
        System.out.println("E09_Stem()");
    }

    public static void main(String[] args) {
        E09_Stem stem = new E09_Stem();
    }
}
