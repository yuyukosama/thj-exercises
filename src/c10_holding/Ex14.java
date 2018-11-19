package c10_holding;
import java.util.*;

public class Ex14 {

    public static void addMiddle(LinkedList<Integer> l, Integer[] ia) {
        for (Integer i : ia) {
            ListIterator<Integer> ite = l.listIterator(l.size()/2);
            ite.add(i);
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Integer[] ints = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7};
        addMiddle(list, ints);
    }
}
