package c10_holding;
import java.util.*;

public class Ex24 {
    public static void main(String[] args) {
        String[] keys = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Integer[] values = {0,1,2,3,4,5,6,7,8,9};

        Map<String,Integer> m = new LinkedHashMap<String,Integer>();
        for (int i = 0; i < keys.length; i++) {
            m.put(keys[i], values[i]);
        }

        Set<String> s = new TreeSet<String>(m.keySet());
        Iterator<String> ite = s.iterator();
        while (ite.hasNext()) {
            String key = (String)ite.next();
            Integer i = m.get(key);
            m.remove(key);
            m.put(key, i);
        }

        System.out.println(m);
    }
}
