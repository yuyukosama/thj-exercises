package c4_initialization_and_cleanup;

class T1 {
    String s = "hello";
}

class T2 {
    String s;
    T2(String s) {
        this.s = s;
    }
}

public class E02_InitialTest2 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2("hello");
        System.out.println(t1.s);
        System.out.println(t2.s);
    }
}
