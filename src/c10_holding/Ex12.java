package c10_holding;
import java.util.*;

public class Ex12 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
        ListIterator<Integer> ite1 = l1.listIterator();
        ListIterator<Integer> ite2 = l2.listIterator();
        System.out.println("li1: " + ite1);
        System.out.println("li2: " + ite2);
        while (ite1.hasNext()) {
            System.out.print(ite1.next() + ", ");
        }
        System.out.println();
        while (ite1.hasPrevious()) {
            ite2.next();
            ite2.set(ite1.previous());
        }

        System.out.println("l2: " + l2);
    }
}
