package c8_interfaces;

import c8_interfaces.ex5.Ex5;

public class E05_Test implements Ex5{
    public static void main(String[] args) {
        E05_Test t = new E05_Test();
        t.sayOne();
        t.sayTwo();
        t.sayThree();
    }

    @Override
    public void sayOne() {
        System.out.println("one");
    }

    @Override
    public void sayTwo() {
        System.out.println("two");
    }

    @Override
    public void sayThree() {
        System.out.println("three");
    }
}
