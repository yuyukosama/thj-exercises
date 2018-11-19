package c10_holding;
import net.mindview.util.*;
import java.util.*;

class Word {
    static int totalWords = 0;
    String word;
    int count;
    Word(String word, int count) {
        this.word = word;
        this.count = count;
        totalWords++;
    }

    @Override
    public String toString() {
        return word + ": " + count;
    }
}

public class Ex22UniqueWord {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
        System.out.println("words to count: " + words);
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);

        Set<Word> s = new HashSet<Word>();
        for (String w : words) {
            int count = 0;
            for(int i = 0; i < words.size(); i++) {
                if(w.equals(words.get(i))) count++;
            }
            Word m = new Word(w, count);
            s.add(m);
        }

        System.out.println("Word count: " + s);
        System.out.println("Total words: " + Word.totalWords);
    }
}
