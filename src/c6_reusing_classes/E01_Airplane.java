package c6_reusing_classes;

class Engine {
    private String s;
    Engine() {
        System.out.println("Engine()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}

public class E01_Airplane {
    private String fuselage, wings, tail;
    private Engine e;
    public E01_Airplane() {
        System.out.println("Inside Airplane()");
        fuselage = "Body";
        wings = "Airfoils";
        tail = "Empennage";
    }

    public String toString() {
        if (e == null) //lazy(delayed) initialization
            e = new Engine();
        return "fuselage = " + fuselage + " , " +
                "wings = " + wings + " , " +
                "tail = " + tail + " , " +
                "engine = " + e;

    }

    public static void main(String[] args) {
        E01_Airplane N1234  = new E01_Airplane();
        System.out.println(N1234 );
    }
}
