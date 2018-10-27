package c10_holding;

import java.util.*;

public class Ex09Sequence {
    private List<Object> items = new ArrayList<Object>();
    public void add(Object x) {
        items.add(x);
    }

    public Iterator<Object> iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Ex09Sequence sequence = new Ex09Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator it = sequence.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
