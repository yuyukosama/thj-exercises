package c10_holding;
import java.util.ArrayList;

class Gerbil1 {
    private int gerbilNumber;

    public Gerbil1(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops.");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Gerbil1> gerbil1s = new ArrayList<Gerbil1>();
        for (int i = 0; i < 10; i++) {
            gerbil1s.add(new Gerbil1(i));
        }

        for (Gerbil1 g : gerbil1s) {
            g.hop();
        }

        for (int i = 0; i < gerbil1s.size(); i++) {
            gerbil1s.get(i).hop();
        }
    }
}
