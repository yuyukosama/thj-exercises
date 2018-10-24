package c9_innerclass;
import c9_innerclass.p1.*;
import c9_innerclass.p2.*;

public class E06_Test extends  Ex6Base {
    Ex6Interface getBaseInner() {
        return this.new Ex6BaseInner();
    }

    public static void main(String[] args) {
        E06_Test ex = new E06_Test();
        System.out.println(ex.getBaseInner().say());
    }
}
