package c1_everythin_is_an_object;

public class E01_DefaultInitializtaion {

    int a;
    char b;
    static int static_a;
    static char static_b;

    public static void main(String[] args) {
        System.out.println("value of static a(int) is: " + static_a);
        System.out.println("value of static a(int) is: " + static_b);
        E01_DefaultInitializtaion ini = new E01_DefaultInitializtaion();
        System.out.println("value of a(int) is: " + ini.a);
        System.out.println("value of a(int) is: " + ini.b);
    }
}
