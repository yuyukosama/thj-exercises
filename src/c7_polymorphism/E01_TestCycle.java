package c7_polymorphism;

class Cycle {
    public void ride() {
        System.out.println("ride Cycle!");
    }
}

class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("ride unicycle!");
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("ride bicycle!");
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("ride tricycle!");
    }
}

public class E01_TestCycle {
    public static void ride(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        Cycle c = new Cycle();
        ride(c);
        c = new Unicycle();
        ride(c);
        c = new Bicycle();
        ride(c);
        c = new Tricycle();
        ride(c);
    }
}
