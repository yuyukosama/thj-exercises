package c9_innerclass;

class Sqeuence4 {
    private Object[] items;
    private int next = 0;


    public Sqeuence4(int size) {
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

        public Sqeuence4 getOuter() {
            return Sqeuence4.this;
        }
    }

}


public class E04_Sequence {
    public static void main(String[] args) {
        Sqeuence4 seq = new Sqeuence4(10);
        for (int i = 0; i < 10; i++) seq.add(i);
        Selector sqeuence = seq.getSelector();
    }
}
