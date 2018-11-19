package c10_holding;
import java.util.*;

class Gerbil2 {
    private int gerbilNumber;

    public Gerbil2(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops.");
    }
}


public class Ex17 {
    public static void main(String[] args) {
        String[] name = new String[]{"Fuzzy", "Spot", "Speedy", "Dopey", "Sleepy", "Happy"};
        Map<String,Gerbil2> gerbils = new HashMap<String,Gerbil2>();
        for (int i = 0; i < name.length; i++) {
            gerbils.put(name[i], new Gerbil2(i));
        }

        Iterator<String> ite = gerbils.keySet().iterator();
        while (ite.hasNext()) {
            String s = ite.next();
            System.out.print(s + ": ");
            gerbils.get(s).hop();
        }
    }
}
