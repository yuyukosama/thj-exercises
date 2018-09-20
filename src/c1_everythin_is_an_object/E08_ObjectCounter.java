package c1_everythin_is_an_object;

public class E08_ObjectCounter {
    private static int counter;
    E08_ObjectCounter() {
        E08_ObjectCounter.counter++;
    }

    public static int getCounter() {
        return E08_ObjectCounter.counter;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            new E08_ObjectCounter();
        }

        System.out.println("Total obj number is:" + E08_ObjectCounter.getCounter());
    }

}
