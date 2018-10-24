package c10_holding;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }

        for (Integer i : c) {
            System.out.print(i + ", ");
        }

        System.out.println("");

        Iterator<Integer> ite = c.iterator();
        while(ite.hasNext()) {
            Integer i = ite.next();
            System.out.print(i + ", ");
        }
    }
}
