package c8_interfaces;

import java.util.Random;

class RandomRodentGenerator {
    private Random rand = new Random();
    public Rodent7 next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Mouse7();
            case 1: return new Rat7();
            case 2: return new Squirrel7();
        }
    }
}

interface Rodent7 {
    String name = "Rodent";
    void eat();
    void run();
    void sleep();
    String toString();
}

class Mouse7 implements Rodent7 {
    private String name = "Mouse";
    public void eat() { System.out.println("Mouse.eat()"); }
    public void run() { System.out.println("Mouse.run()"); }
    public void sleep() { System.out.println("Mouse.sleep()"); }
    public String toString() { return name; }
}

class Rat7 implements Rodent7 {
    private String name = "Rat";
    public void eat() { System.out.println("Rat.eat()"); }
    public void run() { System.out.println("Rat.run()"); }
    public void sleep() { System.out.println("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel7 implements Rodent7 {
    private String name = "Squirrel";
    public void eat() { System.out.println("Squirrel.eat()"); }
    public void run() { System.out.println("Squirrel.run()"); }
    public void sleep() { System.out.println("Squirrel.sleep()"); }
    public String toString() { return name; }
}



public class E07_Rodent {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent7[] rodent = new Rodent7[10];
        for (Rodent7 r : rodent) {
            r = gen.next();
            System.out.println(r + ":");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
