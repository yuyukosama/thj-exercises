package c7_polymorphism;
import java.util.Random;

class RandomRodentGenerator1 {
    private Random rand = new Random();

    public Rodent1 next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse1();
            case 1:
                return new Rat1();
            case 2:
                return new Squirrel1();
        }
    }
}

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
}

class Rodent1 {
    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");
    Rodent1() { System.out.println("Rodent()"); }
    protected void eat() { System.out.println("Rodent.eat()"); }
    protected void run() { System.out.println("Rodent.run()"); }
    protected void sleep() { System.out.println("Rodent.sleep()"); }
    public String toString() { return name; }
}

class Mouse1 extends Rodent1 {
    private String name = "Mouse";
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");
    Mouse1() { System.out.println("Mouse()"); }
    protected void eat() { System.out.println("Mouse.eat()"); }
    protected void run() { System.out.println("Mouse.run()"); }
    protected void sleep() { System.out.println("Mouse.sleep()"); }
    public String toString() { return name; }
}

class Rat1 extends Rodent1 {
    private String name = "Rat";
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");
    Rat1() { System.out.println("Rat()"); }
    protected void eat() { System.out.println("Rat.eat()"); }
    protected void run() { System.out.println("Rat.run()"); }
    protected void sleep() { System.out.println("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel1 extends Rodent1 {
    private String name = "Squirrel";
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");
    Squirrel1() { System.out.println("Squirrel()"); }
    protected void eat() { System.out.println("Squirrel.eat()"); }
    protected void run() { System.out.println("Squirrel.run()"); }
    protected void sleep() { System.out.println("Squirrel.sleep()"); }
    public String toString() { return name; }
}



public class E12_Rodent {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
    public static void main(String[] args) {
        Rodent1[] rodents = new Rodent1[10];
        for(Rodent1 r : rodents) {
            r = gen.next();
            System.out.println(r);
        }
    }
}
