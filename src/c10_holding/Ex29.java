package c10_holding;
import java.util.*;

class MyClass extends Object {}

public class Ex29 {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        PriorityQueue<MyClass> q = new PriorityQueue<MyClass>();
        q.offer(m);
    }
}
