package c7_polymorphism;


import c7_polymorphism.shape.Shape;

class Cycle5 {
    private String name = "Cycle";
    private int wheels = 0;
    public static void travel(Cycle5 c) {
        System.out.println("Cycle.ride() " + c);
    }
    public int wheels() { return wheels; }
    public String toString() {
        return this.name;
    }
}

class Unicycle5 extends Cycle5 {
    private String name = "Unicycle";
    private int wheels = 1;
    @Override public int wheels() { return wheels; }
    public String toString() {
        return this.name;
    }
}

class Bicycle5 extends Cycle5 {
    private String name = "Bicycle";
    private int wheels = 2;
    @Override public int wheels() { return wheels; }
    public String toString() {
        return this.name;
    }

}

class Tricycle5 extends Cycle5 {
    private String name = "Tricycle";
    private int wheels = 3;
    @Override public int wheels() { return wheels; }
    public String toString() {
        return this.name;
    }
}
public class E05_Biking5 {
    public static void ride(Cycle5 c) {
        Cycle5.travel(c);
        System.out.println("wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        Unicycle5 u = new Unicycle5();
        Bicycle5 b = new Bicycle5();
        Tricycle5 t = new Tricycle5();
        ride(u); // upcast to Cycle
        ride(b);
        ride(t);
    }
}
