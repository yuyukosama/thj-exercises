package c6_reusing_classes;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;

class Test {
    Test() {
        System.out.println("Test()");
    }
}

public class E18_Difference {

    private String name;
    public E18_Difference(String s) {
        name = s;
    }
    static final Test sft = new Test();
    private final Test ft = new Test();
    static final String SFS = "static final string";
    private final String fs = "final";
    private static Random rand = new Random();
    static final int SFI = rand.nextInt();
    private final int fi = rand.nextInt();

    public String toString() {
        return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
    }

    public static void main(String[] args) {
        E18_Difference d1 = new E18_Difference("D1");
        E18_Difference d2 = new E18_Difference("D2");
        E18_Difference d3 = new E18_Difference("D3");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


    }
}
