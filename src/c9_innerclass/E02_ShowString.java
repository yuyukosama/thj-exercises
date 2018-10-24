package c9_innerclass;

interface Selector {
    boolean end();
    Object current();
    void next();
}


class Sqeuence {
    private Object[] items;
    private int next = 0;


    public Sqeuence(int size) {
        items = new Object[size];
    }

    public void add(Object obj) {
        if (next < items.length) {
            items[next++] = obj;
        }
    }

    public Selector getSelector() {
        return new SquenceSelector();
    }

    private class SquenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }

}



public class E02_ShowString {

    private String s;

    E02_ShowString(String s) {
        this.s = s;
    }

    public String toString() {
        return s.toString();
    }

    public static void main(String[] args) {
        Sqeuence sequence = new Sqeuence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(new E02_ShowString(Integer.toString(i)));
        Selector selector = sequence.getSelector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        E02_ShowString w1 = new E02_ShowString("Peace");
        E02_ShowString w2 = new E02_ShowString("Love");
        E02_ShowString w3 = new E02_ShowString("Easter");
        Sqeuence message = new Sqeuence(3);
        message.add(w1);
        message.add(w2);
        message.add(w3);
        Selector sel = message.getSelector();
        while(!sel.end()) {
            System.out.print(sel.current() + " ");
            sel.next();
        }
    }
}
