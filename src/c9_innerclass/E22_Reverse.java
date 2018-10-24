package c9_innerclass;

class Sqeuence22 {
    private Object[] items;
    private int next = 0;


    public Sqeuence22(int size) {
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

    public Selector reverseSelector() {return new ReverseSelector();}

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

    private class ReverseSelector implements Selector {
        private int i = items.length - 1;

        @Override
        public boolean end() {
            return i < 0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i >= 0) i--;
        }
    }

}

public class E22_Reverse {
    public static void main(String[] args) {
        Sqeuence22 s = new Sqeuence22(10);
        for (int i = 0; i < 10; i++) {
            s.add(i);
        }

        Selector selector = s.reverseSelector();
        while(selector.end() == false) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
