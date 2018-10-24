package c8_interfaces;

abstract class Dad {

}

class Son extends Dad {
    protected void print() {System.out.println("Son");}
}

abstract class SecondDad{
    protected abstract void print();
}

class SecondSon extends SecondDad {
    protected void print() {
        System.out.println("SecondSon");
    }
}



public class E04_Test {

    public static void testPrint(Dad d) {
        ((Son)d).print();
    }

    public static void main(String[] args) {
        Dad s = new Son();
        testPrint(s);
        SecondDad ss = new SecondSon();
        ss.print();
    }
}
