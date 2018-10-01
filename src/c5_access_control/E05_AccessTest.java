package c5_access_control;

public class E05_AccessTest {

    public static void main(String[] args) {
        E05_FourWays fw = new E05_FourWays();

        fw.showa();
        fw.showb();
        fw.showc();
        //fw.showd();

        fw.a = 10;
        fw.b = 20;
        fw.c = 30;
        //fw.d = 40;

        fw.showa();
        fw.showb();
        fw.showc();
    }

}
