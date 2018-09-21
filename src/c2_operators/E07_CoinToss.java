package c2_operators;
import java.util.Random;

public class E07_CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(2);
        if (result % 2 == 0) System.out.println("heads!");
        else System.out.println("tails!");
    }
}
