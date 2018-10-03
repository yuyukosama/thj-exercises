package c6_reusing_classes;

class Component11 {
    Component11() {
        System.out.println("Component11");
    }

    void dispose() {
        System.out.println("Component11.dispose()");
    }
}

class Component12 {
    Component12() {
        System.out.println("Component12");
    }

    void dispose() {
        System.out.println("Component12.dispose()");
    }
}

class Component13 {
    Component13() {
        System.out.println("Component13");
    }

    void dispose() {
        System.out.println("Component13.dispose()");
    }
}

class Root2 {
    Component11 c1root;
    Component12 c2root;
    Component13 c3root;

    Root2() {
        System.out.println("Root()");
        c1root = new Component11();
        c2root = new Component12();
        c3root = new Component13();
    }

    void dispose() {
        c1root.dispose();
        c2root.dispose();
        c3root.dispose();
        System.out.println("Root2.dispose()");
    }

}

public class E12_Stem2 extends Root2 {
    Component11 c1stem;
    Component12 c2stem;
    Component13 c3stem;

    E12_Stem2() {
        super();
        c1stem = new Component11();
        c2stem = new Component12();
        c3stem = new Component13();
    }

    void dispose() {
        c1stem.dispose();
        c2stem.dispose();
        c3stem.dispose();
        super.dispose();
        System.out.println("Stem2.dispose()");
    }

    public static void main(String[] args) {
        E12_Stem2 s = new E12_Stem2();
        try {
            //To do
        } finally {
            s.dispose();
        }
    }
}
