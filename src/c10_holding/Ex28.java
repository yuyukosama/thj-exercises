package c10_holding;
import java.util.*;

public class Ex28 {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Double> doubleQ = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++) {
            doubleQ.offer(rand.nextDouble() * i);
        }

        while (doubleQ.peek() != null) {
            System.out.print(doubleQ.poll() + " ");
        }
    }
}
