package c9_innerclass;

class One {
    private String s;
    One(String s) {
        this.s = s;
    }

    public String showS() {
        return this.s;
    }
}

public class E15_Test {
    public One makeOne(String s) {
        return new One(s){};
    }

    public static void main(String[] args) {
        E15_Test x = new E15_Test();
        System.out.println(x.makeOne("hi").showS());
    }
}
