package c8_interfaces;

import static net.mindview.util.Print.*;

interface FastFood {
    void cheeseburger();
    void fries();
    void softDrink();
}

class Meal {
    Meal() { print("Meal()"); }
}

class Bread {
    Bread() { print("Bread()"); }
}

class Cheese {
    Cheese() { print("Cheese()"); }
}

class Lettuce {
    Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}

public class E08_Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();

    private Lettuce l = new Lettuce();

    public E08_Sandwich() {
        print("Sandwich8()");
    }

    @Override
    public void cheeseburger() {
        print("Cheeseburger");
    }

    @Override
    public void fries() {
        print("Fries");
    }

    @Override
    public void softDrink() {
        print("Soft Drink");
    }

    public static void main(String[] args) {
        FastFood  s = new E08_Sandwich();
        s.cheeseburger();
        s.fries();
        s.softDrink();
    }
}
