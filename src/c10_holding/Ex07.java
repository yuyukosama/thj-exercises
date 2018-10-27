package c10_holding;

import net.mindview.atunit.Test;

import java.util.*;

class Tester {
    public static int counter = 0;
    private int id = counter++;
    public String toString() { return String.valueOf(id); }
}

public class Ex07 {
    public static void main(String[] args) {
        Tester[] t = new Tester[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tester();
        }

        List<Tester> lt = new ArrayList<Tester>();
        for (Tester x : t) {
            lt.add(x);
        }
        System.out.println("list of Tester: " + lt);
        List<Tester> sub = lt.subList(2, 6);
        System.out.println("subList: " + sub);
        lt.removeAll(sub);
        System.out.println("list of Tester: " + lt);
    }
}
