package c8_interfaces;

interface Days {
    int SUNDAY = 1,
        MONDAY = 2,
        TUESDAY = 3,
        WEDNESDAY = 4,
        THURSDAY = 5,
        FRIDAY = 6,
        SATURDAY = 7;
}

class Week implements Days {
    private static int count = 0;
    private int id = count++;
    public Week() {
        System.out.println("Week() " + id);
    }
}

public class E17_InterfaceField {
    public static void main(String[] args) {
        System.out.println("SUNDAY = " + Days.SUNDAY);
        System.out.println("MONDAY = " + Days.MONDAY);

        Week w0 = new Week();
        Week w1 = new Week();

        //w0.SUNDAY = 3;
    }
}
