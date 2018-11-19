package c10_holding;

import net.mindview.util.TextFile;

import java.util.*;

public class Ex20Vowels {
    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels,
                'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        Map<Character,Integer> vowelMap = new TreeMap<Character,Integer>();
        int allVowels = 0;
        for (String s : st) {
            for (Character c : s.toCharArray()) {
                if (vowels.contains(c)){
                    Integer count = vowelMap.get(c);
                    vowelMap.put(c, count == null? 1 : count+1);
                    allVowels++;
                }
            }
        }
        System.out.println("vowels" + vowelMap);
        System.out.print("Total vowels: " + allVowels);
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String> (new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}
