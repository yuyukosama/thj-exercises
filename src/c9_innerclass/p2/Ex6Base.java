package c9_innerclass.p2;
import c9_innerclass.p1.*;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Ex6Base {
    protected class Ex6BaseInner implements Ex6Interface {
        public Ex6BaseInner() {}
        @Override
        public String say() {
            return "hi";
        }
    }
}
