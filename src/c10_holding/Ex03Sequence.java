package c10_holding;

import java.util.ArrayList;

interface Selector {
    boolean end();
    Object current();
    void next();
}


public class Ex03Sequence {
    private ArrayList<Object> items = new ArrayList<Object>();
    private int next = 0;

    public void add(Object x) {
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { if(i < items.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Ex03Sequence s3 = new Ex03Sequence();
        for (int i = 0; i < 10; i++) {
            s3.add(i);
        }
        Selector selector  = s3.selector();

        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }

        s3.add(10);
        s3.add(11);
        s3.add(12);
        s3.add(13);
        s3.add(13);
        s3.add("good bye");
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
