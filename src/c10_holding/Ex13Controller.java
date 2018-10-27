package c10_holding;
import java.util.*;
import c9_innerclass.controller.Event;

public class Ex13Controller {
    private LinkedList<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        LinkedList<Event> eventListCopy =
                new LinkedList<Event>(eventList);
        ListIterator<Event> it
                = eventListCopy.listIterator();
        while(it.hasNext()) {
            it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

    }
}
