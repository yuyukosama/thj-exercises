package c1_everythin_is_an_object;

public class E03_ATNTest {
    public static void main(String[] args) {
        class ATNTest {
            int a;
            double b;
            boolean c;

            public void show(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }

        ATNTest a = new ATNTest();
        a.a = 3;
        a.b = 2.3;
        a.c = true;
        a.show();
    }
}
