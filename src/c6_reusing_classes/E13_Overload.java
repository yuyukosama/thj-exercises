package c6_reusing_classes;

class ThreeWay {
    void number(byte b) {
        System.out.println(b);
    }

    void number(short s) {
        System.out.println(s);
    }

    void number(int i) {
        System.out.println(i);
    }
}

public class E13_Overload extends ThreeWay {

    void number(float f) {
        System.out.println(f);
    }

    public static void main(String[] args) {
        E13_Overload ov = new E13_Overload();
        ov.number((byte)0);
        ov.number((short)1);
        ov.number(2);
        ov.number(3.0f);
    }
}
