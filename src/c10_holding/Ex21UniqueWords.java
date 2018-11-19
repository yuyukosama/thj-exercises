package c10_holding;
import net.mindview.util.*;
import java.util.*;

public class Ex21UniqueWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
        System.out.println("words to count: " + words);
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);

        Map<String, Integer> m = new LinkedHashMap<String, Integer>();

        Iterator<String> ite = words.iterator();
        while (ite.hasNext()) {
            String word = ite.next();
            Integer count = m.get(word);
            m.put(word, count==null? 1: count+1);
        }

        System.out.println("word count: " + m);
    }
}
