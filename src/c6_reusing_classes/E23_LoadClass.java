package c6_reusing_classes;

class AA {
    static int j = printInit("A.j initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }
    AA() { System.out.println("A() constructor"); }
}

class BB extends AA {
    static int k = printInit("B.k initialized");
    BB() { System.out.println("B() constructor"); }
}

class CC {
    static int n = printInitC("C.n initialized");
    static AA a = new AA();
    CC() { System.out.println("C() constructor"); }
    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }
}

class DD {
    DD() { System.out.println("D() constructor"); }
}

public class E23_LoadClass extends BB {
    static int i = printInit("LoadClass.i initialized");
    E23_LoadClass() { System.out.println("LoadClass() constructor"); }

    public static void main(String[] args) {
        // accessing static main causes loading (and initialization)
        // of A, B, & LoadClass
        System.out.println("hi");
        // call constructors from loaded classes:
        E23_LoadClass lc = new E23_LoadClass();
        // call to static field loads & initializes C:
        System.out.println(CC.a);
        // call to constructor loads D:
        DD d = new DD();

        /*
         * A.j initialized
         * B.k initialized
         * LoadClass.i initialized
         * hi
         * A() constructor
         * B() constructor
         * LoadClass() constructor
         * C.n initialized
         * A() constructor
         * c6_reusing_classes.AA@xxxxxxx
         * D() constructor
         */
    }
}
