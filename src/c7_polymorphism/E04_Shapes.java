package c7_polymorphism;
import c7_polymorphism.shape.*;

public class E04_Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[20];
        // fill up the array wth shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // make polymorphic method calls:
        for(Shape shp : s) {
            shp.draw();
            shp.amend();
        }
    }
}
