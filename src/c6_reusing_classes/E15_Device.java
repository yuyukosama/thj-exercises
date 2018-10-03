package c6_reusing_classes;
import c6_reusing_classes.ex15.BasicDevice;

class DeviceFail {
    public static void main(String[] args) {
        BasicDevice device = new BasicDevice();
        device.showS();
        //device.changeS("hello") //can not access protected method
    }
}

public class E15_Device extends BasicDevice {

    void changeBasic(String s) {
        super.changeS(s);
    }

    public static void main(String[] args) {
        E15_Device device = new E15_Device();
        device.showS();
        device.changeBasic("hello");
        device.showS();

        BasicDevice basic = new BasicDevice();
        basic.showS();
        //device.changeS("hello") //can not access protected method
        DeviceFail.main(args);
    }

}
