package c6_reusing_classes;

class Art {
    Art(){System.out.println("Art constructor");}
}

class Drawing extends Art {
    Drawing() {System.out.println("Drawing constructor");}
}

public class E03_Cartoon2 extends Drawing {
    public static void main(String[] args) {
        new E03_Cartoon2();
    }
}
