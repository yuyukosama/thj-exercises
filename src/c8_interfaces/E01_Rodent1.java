package c8_interfaces;

import java.util.Random;

class RandomRodentGenerator1 {
    private Random rand = new Random();
    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Rat();
            case 2: return new Squirrel();
        }
    }
}

abstract class Rodent {
    private String name = "Rodent";
    abstract protected void eat();
    abstract protected void run();
    abstract protected void sleep();
    abstract public String toString();
}

class Mouse extends Rodent {
    private String name = "Mouse";
    protected void eat() { System.out.println("Mouse.eat()"); }
    protected void run() { System.out.println("Mouse.run()"); }
    protected void sleep() { System.out.println("Mouse.sleep()"); }
    public String toString() { return name; }
}

class Rat extends Rodent {
    private String name = "Rat";
    protected void eat() { System.out.println("Rat.eat()"); }
    protected void run() { System.out.println("Rat.run()"); }
    protected void sleep() { System.out.println("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    protected void eat() { System.out.println("Squirrel.eat()"); }
    protected void run() { System.out.println("Squirrel.run()"); }
    protected void sleep() { System.out.println("Squirrel.sleep()"); }
    public String toString() { return name; }
}


public class E01_Rodent1 {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i <10; i++) {
            rodents[i] = gen.next();
        }

        for (int i = 0; i <10; i++) {
            System.out.println(rodents[i] + ":");
            rodents[i].eat();
            rodents[i].run();
            rodents[i].sleep();
        }
    }
}
