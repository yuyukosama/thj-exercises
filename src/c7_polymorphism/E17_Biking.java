package c7_polymorphism;

class Cycle1 {
    private String name = "Cycle";
    public static void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }
    public String toString() {
        return this.name;
    }
}

class Unicycle1 extends Cycle1 {
    private String name = "Unicycle";
    public void balance() { System.out.println("Balance Unicycle"); }
    public String toString() {
        return this.name;
    }
}

class Bicycle1 extends Cycle1 {
    private String name = "Bicycle";
    public void balance() { System.out.println("Balance Bicycle"); }
    public String toString() {
        return this.name;
    }

}

class Tricycle1 extends Cycle1 {
    private String name = "Tricycle";
    public String toString() {
        return this.name;
    }
}

public class E17_Biking {

    public static void main(String[] args) {
        Cycle1[] ride = {
                new Unicycle1(),
                new Bicycle1(),
                new Tricycle1(),
        };
//        for(Cycle1 c : ride) {
//            c.balance();
//        }
        ((Unicycle1)ride[0]).balance();
        ((Bicycle1)ride[1]).balance();
        ((Bicycle1)ride[2]).balance();


    }
}
