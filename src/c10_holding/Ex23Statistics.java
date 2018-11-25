package c10_holding;
import java.util.*;

public class Ex23Statistics {

    static int getBestInt20(int n) {
        Random rand = new Random();
        Map<Integer,Integer> m = new TreeMap<Integer,Integer>();
        for (int i = 0; i < n; i++) {
            int r = rand.nextInt(20);
            Integer c = m.get(r);
            m.put(r, c==null? 1 : c+1);
        }

        int max = 0, key = -1;

        for (Map.Entry<Integer,Integer> e : m.entrySet()) {
            int value = e.getValue();
            if (value > max) {
                max = value;
                key = e.getKey();
            }
        }

        return key;
    }

    public static void main(String[] args) {
        Map<Integer,Integer> m20 =
                new TreeMap<Integer,Integer>();
        for(int i = 0; i < 2000; i++) {
            int x = getBestInt20(10000);
            Integer freq = m20.get(x);
            m20.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println("Most often picked ints, 0 - 19, in 2000 tests of 10,000 random picks: " + m20);
    }
}
