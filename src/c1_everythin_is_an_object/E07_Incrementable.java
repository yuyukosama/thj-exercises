package c1_everythin_is_an_object;

public class E07_Incrementable {
    static int i;
    static void increment() {
        E07_Incrementable.i++;
    }

    public static void main(String[] args) {
        System.out.println("Value of i is :" + E07_Incrementable.i);
        E07_Incrementable.increment();
        System.out.println("Value of i after incement by class is :" + E07_Incrementable.i);
        E07_Incrementable incre = new E07_Incrementable();
        incre.increment();
        System.out.println("Value of i after incement by object is :" + E07_Incrementable.i);

    }
}
