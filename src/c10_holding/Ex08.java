package c10_holding;

import java.util.ArrayList;
import java.util.Iterator;

class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }
}

public class Ex08 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }

        Iterator<Gerbil> ite = gerbils.iterator();
        while(ite.hasNext()) {
            ite.next().hop();
        }
    }
}
