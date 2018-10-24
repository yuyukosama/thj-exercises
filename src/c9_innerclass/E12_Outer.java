package c9_innerclass;
interface Inner12{
    void modifyOuter();
}

public class E12_Outer {
    private int oi = 1;
    private void hi() {
        System.out.println("Outer hi");
    }
    public Inner12 inner() {
        return new Inner12() {
            @Override
            public void modifyOuter() {
                oi *= 2;
                hi();
            }
        };
    }

    public static void main(String[] args) {
        Inner12 inner = new E12_Outer().inner();
        inner.modifyOuter();
    }
}
