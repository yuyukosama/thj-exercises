package c8_interfaces;
import java.nio.CharBuffer;
import java.util.*;

class RandomChars {
    private static Random rand = new Random(47);
    public char next() {
        return (char)rand.nextInt(128);
    }
    public static void main(String[] args) {
        RandomChars rc = new RandomChars();
        for (int i = 0; i < 7; i++) {
            System.out.println(rc.next());
        }
    }
}

public class E16_AdaptedRandomChars extends RandomChars implements Readable {

    private int count;

    public E16_AdaptedRandomChars(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if(--count == 0) return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
//        RandomChars.main(args);
        Scanner scan = new Scanner(new E16_AdaptedRandomChars(10));
        while(scan.hasNext()) {
            System.out.println(scan.next());
        }

    }
}
