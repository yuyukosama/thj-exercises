package c10_holding;
import java.util.*;

class Command {
    String s;
    Command(String s) {this.s = s;}
    void operation() {System.out.println(s);}
}

class Build {
    Queue<Command> makeQ() {
        Queue<Command> q = new LinkedList<Command>();
        for (int i = 0; i < 10; i++) {
            q.offer(new Command(i + " "));
        }

        return q;
    }
}

public class Ex27Queue {
    static void commandEater(Queue<Command> q) {
        while (q.peek() != null) {
            q.poll().operation();
        }
    }

    public static void main(String[] args) {
        Build b = new Build();
        commandEater(b.makeQ());
    }
}
