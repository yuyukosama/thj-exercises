package c5_access_control;
import java.util.*;
import net.mindview.simple.*;

public class E02_Collision {
    public static void main(String[] args) {
       // Vector v = new Vector(); Ambiguous collision
        net.mindview.simple.Vector v1 = new net.mindview.simple.Vector();
        java.util.Vector v2 = new java.util.Vector();
        System.out.println(v1.getClass().getName().equals(v2.getClass().getName()));
    }
}
